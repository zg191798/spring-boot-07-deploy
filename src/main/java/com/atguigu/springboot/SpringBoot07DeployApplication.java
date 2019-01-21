package com.atguigu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//引入热部署maven配置后,ctrl+F9
public class SpringBoot07DeployApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot07DeployApplication.class, args);
    }

}

