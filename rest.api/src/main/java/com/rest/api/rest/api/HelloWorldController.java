package com.rest.api.rest.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "hello world";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World",2);
    }

    @GetMapping(path = "/hello-world/path-variable/{name}/{value}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name,@PathVariable Integer value) {
        return new HelloWorldBean(String.format("Hello World, %s",name),value);
    }

}
