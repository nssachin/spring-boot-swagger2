package com.sns.swagger2.resources;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/user")
public interface IHelloServiceApi {

    @GetMapping("/")
    String hello();

    @PostMapping("/post")
    String helloPost(@RequestBody String hello);

    @PutMapping("/put")
    String helloPut(@RequestBody String hello);

}
