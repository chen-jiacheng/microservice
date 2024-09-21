package com.chenjiacheng.microservice.asset.service.service.config;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

/**
 * Created by chenjiacheng on 2024/9/21 15:51
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Data
@Configuration
public class AssetServiceConfig {

    @NacosValue(value = "${app:asset-service}", autoRefreshed = true)
    private String app;

}
