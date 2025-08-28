package com.voting.consumer.controller;

import com.voting.consumer.providerfeign.ProviderFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConsumerController {

    @Resource
    ProviderFeign providerFeign;

    @GetMapping("/")
    public String consumer(){
        return providerFeign.hello();
    }

}
