package com.bluekke.nrpc.core.provider;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description for this class
 *
 * @Author will
 * @create 2024/3/14 23:06
 */
@Configuration
public class ProviderConfig {

    @Bean
    ProviderBootstrap providerBootstrap(){
        return new ProviderBootstrap();
    }
}
