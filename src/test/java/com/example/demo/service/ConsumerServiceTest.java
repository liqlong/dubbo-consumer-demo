package com.example.demo.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.DemoApplicationTests;

public class ConsumerServiceTest extends DemoApplicationTests {

    @Autowired
    private ConsumerService consumerService;

    @Test
    public void testSayHello() {
        consumerService.sayHello();
    }
}
