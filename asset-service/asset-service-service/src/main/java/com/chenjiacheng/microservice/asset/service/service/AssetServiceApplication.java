package com.chenjiacheng.microservice.asset.service.service;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by chenjiacheng on 2024/9/21 14:44
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@NacosPropertySource(dataId = "asset-service", autoRefreshed = true)
@EnableDubbo
@SpringBootApplication
public class AssetServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(AssetServiceApplication.class,args);
    }
}