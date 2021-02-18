package com.dip.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-client", fallback = HiScheduleServiceHystrix.class)
public interface HiScheduleService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String sayHi(@RequestParam(value = "name")  String name);

}
