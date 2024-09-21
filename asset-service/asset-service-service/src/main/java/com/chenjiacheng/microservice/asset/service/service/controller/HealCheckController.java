package com.chenjiacheng.microservice.asset.service.service.controller;

import com.chenjiacheng.microservice.asset.service.service.config.AssetServiceConfig;
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
    private AssetServiceConfig assetServiceConfig;

    @GetMapping("/check")
    public String check(){
        return assetServiceConfig.getApp()+ ": I'm ok.";
    }

}
