package com.zz.like;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Created by 开源
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
// 扫描 mybatis 通用 mapper 所在的包
@MapperScan(basePackages = "com.zz.like.mapper")
// 扫描所有包以及相关组件包
@ComponentScan(basePackages = {"com.zz", "org.n3r.idworker"})
@EnableDiscoveryClient
@EnableCircuitBreaker
public class LikeApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(LikeApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }

}
