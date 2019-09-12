package com.luv2code.springboot.demo.myfirstspringbootapp;

// Below is sprin application To Bootstrap our application (Create applications, registers all beans and start embedded server tomcat
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //Enables autoconfiguration component scanning and additional configuration @EnableAutoConfiguration
// enables spring boot auto configuration support @ComponentScan enable component scanning of current package also recursively scans sub packages
// @Configuration able to register extra beans with @Bean or import other configuration classes

//@ComponentScan Place your main app class in the root package above your other packages
// impicitly defines a base search package
// Allows you to leverage default component scanning
// NO need to explicitly reference base package name (like here we have rest package inside MyFirstspringbootApplication
// Use scanBasePackages=("")
public class MyfirstspringbootappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstspringbootappApplication.class, args);
	}

}
