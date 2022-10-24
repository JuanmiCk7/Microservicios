package com.nttdata.bootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.nttdata.*")
public class RetoConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetoConfigServiceApplication.class, args);
	}

}
