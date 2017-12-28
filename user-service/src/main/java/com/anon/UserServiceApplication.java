package com.anon;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 *
 * Created by winston.wang on 2016/11/21.
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class UserServiceApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(UserServiceApplication.class).web(true).run(args);


    }
}
