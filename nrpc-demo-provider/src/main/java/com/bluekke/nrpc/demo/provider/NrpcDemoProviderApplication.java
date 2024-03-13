package com.bluekke.nrpc.demo.provider;

import com.bluekke.nrpc.core.api.RpcRequest;
import com.bluekke.nrpc.core.api.RpcResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NrpcDemoProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(NrpcDemoProviderApplication.class, args);
	}

	// 使用HTTP + JSON 来实现序列化和通信

	@RequestMapping("/")
	public RpcResponse invoke(@RequestBody RpcRequest request) {

		return new RpcResponse();
	}
}
