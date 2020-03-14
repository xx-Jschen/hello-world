package com.chen.bean;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private Boolean boss;
    private  String name;
    private Integer age;
}
