package com.anon;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurakaTempApplication {

	public static void main(String[] args) {
//		SpringApplication.run(EurakaTempApplication.class, args);
		new SpringApplicationBuilder(EurakaTempApplication.class).web(true).run(args);
	}
}
