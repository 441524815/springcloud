package com.zz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by caochunpeng on 2019-11-11
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

    //    http://localhost:8088/swagger-ui.html     原路径
    //    http://localhost:8088/doc.html     原路径
    //配置swaggers核心配置docket
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors
                        .withClassAnnotation(RestController.class))
                        //.basePackage("com.zr.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("小程序对接API")
                .contact(new Contact("卓然",
                        "zrlingxian.com",
                        "441524815@qq.com"))
                .description("专为卓然提供API文档")//详细信息
                .version("1.0.0")//掌站版本号
                .termsOfServiceUrl("zrlingxian.com")//掌站官网
                .build();

    }
}
