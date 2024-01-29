package com.unir.eurekagrupo13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaGrupo13Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaGrupo13Application.class, args);
	}

}
