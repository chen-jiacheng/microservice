package com.chenjiacheng.microservice.user.service.service.controller;

import com.chenjiacheng.microservice.asset.service.api.api.AssetService;
import com.chenjiacheng.microservice.trade.srvice.api.api.TradeService;
import com.chenjiacheng.microservice.user.service.service.config.UserServiceConfig;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenjiacheng on 2024/9/21 15:01
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@RequestMapping("/health")
@RestController
public class HealCheckController {

    @DubboReference
    private AssetService assetService;

    @DubboReference
    private TradeService tradeService;

    @Autowired
    private UserServiceConfig userServiceConfig;

    @GetMapping("/check")
    public String check(){
        return userServiceConfig.getApp()+": I'm ok.";
    }

    @GetMapping("/checks")
    public String check(@RequestParam("app")String app){
        if("asset-service".equalsIgnoreCase(app)){
            return assetService.sayHello(app);
        }else if("trade-service".equalsIgnoreCase(app)){
            return tradeService.sayHello(app);
        }else {
            return userServiceConfig.getApp()+": I'm ok.";
        }
    }

}
