package com.zz.like.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ccp.
 */
@RestController
@RequestMapping("/refresh")
@RefreshScope
public class RefreshController {

    @Value("${nihao}")
    private String nihao;


    @GetMapping("/nihaos")
    public String getWords() {
        return nihao;
    }

}
