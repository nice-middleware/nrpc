package com.bluekke.nrpc.demo.provider;

import com.bluekke.nrpc.core.annotation.NProvider;
import com.bluekke.nrpc.demo.api.User;
import com.bluekke.nrpc.demo.api.UserService;
import org.springframework.stereotype.Component;

/**
 * Description for this class
 *
 * @Author will
 * @create 2024/3/13 23:38
 */

@Component
@NProvider
public class UserServiceImpl implements UserService {
    @Override
    public User findById(int id) {
        return new User(id,"n-" + System.currentTimeMillis());
    }
}
