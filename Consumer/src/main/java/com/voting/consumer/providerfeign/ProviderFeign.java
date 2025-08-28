package com.voting.consumer.providerfeign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Provider")
public interface ProviderFeign {
    @GetMapping("/")
    public String hello();


}
