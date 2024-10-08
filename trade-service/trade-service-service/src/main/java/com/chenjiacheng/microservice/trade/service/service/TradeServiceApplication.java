package com.chenjiacheng.microservice.trade.service.service;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by chenjiacheng on 2024/9/21 14:42
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@NacosPropertySource(dataId = "trade-service", autoRefreshed = true)
@EnableDubbo
@SpringBootApplication
public class TradeServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(TradeServiceApplication.class,args);
    }
}