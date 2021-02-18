package com.dip.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class HelloService {

    @Resource
    RestTemplate restTemplate;

    public String hello(String name){
        return restTemplate.getForObject("http://SERVICE-CLIENT/hello?name="+name, String.class);
    }
}
