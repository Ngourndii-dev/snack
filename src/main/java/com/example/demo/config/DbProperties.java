package com.example.demo.config;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Getter
@NoArgsConstructor
@Component
@ConfigurationProperties("db")
public class DbProperties{
    private String url;
    private String user;
    private String password;

    public static void main(String[] args) {

    }
}
