package com.chenjiacheng.microservice.trade.service.service.controller;

import com.chenjiacheng.microservice.trade.service.service.config.TradeServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @Autowired
    private TradeServiceConfig tradeServiceConfig;

    @GetMapping("/check")
    public String check(){
        return tradeServiceConfig.getApp()+": I'm ok.";
    }

}
