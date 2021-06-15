package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;

@Service
public class ConsumerService {

    @Reference
    private DemoService demoService;

    public void sayHello() {
        String result = demoService.sayHello("lql");
        System.out.println(result);
    }
}
