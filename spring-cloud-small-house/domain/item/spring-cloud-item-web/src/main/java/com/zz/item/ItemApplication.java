package com.zz.item;

import com.zz.item.fallback.likeservice.LikeFeignClient;
import com.zz.like.service.LikeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Created by 开源
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
// 扫描 mybatis 通用 mapper 所在的包
@MapperScan(basePackages = "com.zz.item.mapper")
// 扫描所有包以及相关组件包
@ComponentScan(basePackages = {"com.zz", "org.n3r.idworker"})
@EnableDiscoveryClient
// TODO feign注解
//@EnableFeignClients(basePackages = {"com.zz.like.service"})
@EnableFeignClients(
        clients = {
                LikeFeignClient.class
        }
)
public class ItemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItemApplication.class, args);
    }

}
