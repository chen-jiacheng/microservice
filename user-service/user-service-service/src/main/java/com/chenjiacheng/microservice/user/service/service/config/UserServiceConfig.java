package com.chenjiacheng.microservice.user.service.service.config;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

/**
 * Created by chenjiacheng on 2024/9/21 15:04
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Data
@Configuration
public class UserServiceConfig {

    @NacosValue(value = "${app:user-service}",autoRefreshed = true)
    public String app;

}
