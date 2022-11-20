package com.rajesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class SpringbootHelloworldApplication {
	@RequestMapping(value="/")
	public String index() {
		return "<h1>Hello World guru</h1>";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHelloworldApplication.class, args);
	}

}
