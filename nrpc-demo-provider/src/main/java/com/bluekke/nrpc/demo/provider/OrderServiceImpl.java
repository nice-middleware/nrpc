package com.bluekke.nrpc.demo.provider;

import com.bluekke.nrpc.core.annotation.NProvider;
import com.bluekke.nrpc.demo.api.Order;
import com.bluekke.nrpc.demo.api.OrderService;
import org.springframework.stereotype.Component;

/**
 * Description for this class
 *
 * @Author will
 * @create 2024/3/14 23:36
 */
@Component
@NProvider
public class OrderServiceImpl implements OrderService {
    @Override
    public Order findById(Integer id) {
        return new Order(id.longValue(),15.6f);
    }
}
