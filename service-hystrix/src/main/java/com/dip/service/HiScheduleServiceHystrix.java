package com.dip.service;

import org.springframework.stereotype.Component;

@Component
public class HiScheduleServiceHystrix implements HiScheduleService{

    @Override
    public String sayHi(String name) {
        return "error:"+name;
    }
}
