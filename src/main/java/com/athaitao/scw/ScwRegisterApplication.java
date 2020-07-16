package com.athaitao.scw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*
 * 这是注册中心、
 * 
 * 
 * 
 * 
 * 
 * 
 */

@EnableEurekaServer
@SpringBootApplication
public class ScwRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScwRegisterApplication.class, args);
	}

}
