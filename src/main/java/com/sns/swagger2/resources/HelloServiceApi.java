package com.sns.swagger2.resources;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloServiceApi implements IHelloServiceApi {
    @Override
    public String hello() {
        return "Hello World!";
    }

    @Override
    public String helloPost(String hello) {
        return hello;
    }

    @Override
    public String helloPut(String hello) {
        return hello;
    }
}
