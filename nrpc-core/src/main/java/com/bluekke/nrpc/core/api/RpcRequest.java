package com.bluekke.nrpc.core.api;

import lombok.Data;

/**
 * Description for this class
 *
 * @Author will
 * @create 2024/3/13 23:49
 */

@Data
public class RpcRequest {

    private String service; //接口: com.bluekke.nrpc.demo.api.UserService
    private String method; //方法: findById
    private Object[] args; //参数: 100
}
