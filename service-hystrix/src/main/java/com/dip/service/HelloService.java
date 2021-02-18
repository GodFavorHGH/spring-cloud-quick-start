package com.dip.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class HelloService {

    @Resource
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "errorHi")
    public String sayHi(String name){
        return restTemplate.getForObject("http://SERVICE-CLIENT/hello?name="+name, String.class);
    }

    public String errorHi(String name){
        return "error:"+name;
    }
}
