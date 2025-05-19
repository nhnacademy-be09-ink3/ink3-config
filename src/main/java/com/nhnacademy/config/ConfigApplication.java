package com.nhnacademy.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication(exclude = {
        // 스프링 시큐리티 전체 비활성화
        SecurityAutoConfiguration.class,
        // Actuator 전용 Security 자동 설정도 비활성화
        ManagementWebSecurityAutoConfiguration.class
})
public class ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }

}
