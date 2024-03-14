package com.bluekke.nrpc.demo.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description for this class
 *
 * @Author will
 * @create 2024/3/14 23:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    Long id;
    Float amount;
}
