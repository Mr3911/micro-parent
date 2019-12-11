package com.shsxt.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author
 * @create2019-12-11 10:17
 */
@SpringBootApplication
@EnableEurekaServer//启动Eureka注册中心
public class RegistryApplication {


    public static void main(String[] args) {
        SpringApplication.run(RegistryApplication.class, args);
    }

}
