package com.bluekke.nrpc.core.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description for this class
 *
 * @Author will
 * @create 2024/3/13 23:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RpcResponse<T> {

    boolean status;  //状态：true
    T data;  // new User
}
