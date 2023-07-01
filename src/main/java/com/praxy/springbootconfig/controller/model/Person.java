package com.praxy.springbootconfig.controller.model;
import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ToString
@ConfigurationProperties("praxy.property")
public class Person {
    private String name;
    private String age;
    private String city;
}
