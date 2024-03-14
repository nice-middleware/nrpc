package com.bluekke.nrpc.core.provider;

import com.bluekke.nrpc.core.annotation.NProvider;
import com.bluekke.nrpc.core.api.RpcRequest;
import com.bluekke.nrpc.core.api.RpcResponse;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Description for this class
 *
 * @Author will
 * @create 2024/3/14 23:02
 */
@Data
public class ProviderBootstrap implements ApplicationContextAware {

    ApplicationContext applicationContext;

    private Map<String,Object> skeleton = new HashMap<>();

    @PostConstruct     // init-method
    // PreDestroy
    public void buildProviders(){
        Map<String, Object> providers = applicationContext.getBeansWithAnnotation(NProvider.class);
        providers.forEach((x,y) -> System.out.println(x));
        //	skeleton.putAll(providers);
        providers.values().forEach(
                x -> getInterface(x)
        );
    }

    private void getInterface(Object x) {
        Class<?> itfer = x.getClass().getInterfaces()[0];
        skeleton.put(itfer.getCanonicalName(), x);
    }

    public RpcResponse invoke(RpcRequest request) {
        Object bean = skeleton.get(request.getService());
        try {
            Method method = findMethod(bean.getClass(),request.getMethod());
            Object result = method.invoke(bean, request.getArgs());
            return new RpcResponse(true,result);
        } catch (InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private Method findMethod(Class<?> aClass, String methodName) {
        for (Method method : aClass.getMethods()) {
            if (method.getName().equals(methodName)){
                return method;
            }
        }
        return null;
    }



}
