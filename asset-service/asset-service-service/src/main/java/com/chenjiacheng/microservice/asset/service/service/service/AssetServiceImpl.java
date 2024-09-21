package com.chenjiacheng.microservice.asset.service.service.service;

import com.chenjiacheng.microservice.asset.service.api.api.AssetService;
import com.chenjiacheng.microservice.asset.service.service.config.AssetServiceConfig;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by chenjiacheng on 2024/9/21 17:47
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@DubboService
public class AssetServiceImpl implements AssetService {

    @Autowired
    private AssetServiceConfig assetServiceConfig;

    @Override
    public String sayHello(String name) {
        return assetServiceConfig.getApp()+": I'm ok.";
    }
}
