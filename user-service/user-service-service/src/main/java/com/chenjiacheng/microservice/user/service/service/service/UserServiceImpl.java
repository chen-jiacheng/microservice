package com.chenjiacheng.microservice.user.service.service.service;

import com.chenjiacheng.microservice.user.service.api.api.UserService;
import com.chenjiacheng.microservice.user.service.service.config.UserServiceConfig;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by chenjiacheng on 2024/9/21 17:44
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@DubboService
public class UserServiceImpl implements UserService {

    @Autowired
    private UserServiceConfig userServiceConfig;

    @Override
    public String sayHello(String name) {
        return userServiceConfig.getApp()+": I'm ok.";
    }
}
