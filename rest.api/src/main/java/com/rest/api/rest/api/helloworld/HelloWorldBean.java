package com.rest.api.rest.api.helloworld;

public class HelloWorldBean {
    private String message;
    private Integer value;

    public String getMessage() {
        return message;
    }

    public Integer getValue() {
        return value;
    }

    public HelloWorldBean(String message, Integer value) {
        this.message=message;
        this.value=value;
    }

}
