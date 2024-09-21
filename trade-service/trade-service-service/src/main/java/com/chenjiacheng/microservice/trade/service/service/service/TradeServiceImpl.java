package com.chenjiacheng.microservice.trade.service.service.service;

import com.chenjiacheng.microservice.trade.service.service.config.TradeServiceConfig;
import com.chenjiacheng.microservice.trade.srvice.api.api.TradeService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by chenjiacheng on 2024/9/21 17:46
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@DubboService
public class TradeServiceImpl implements TradeService {

    @Autowired
    private TradeServiceConfig tradeServiceConfig;

    @Override
    public String sayHello(String name) {
        return tradeServiceConfig.getApp()+": I'm ok.";
    }
}
