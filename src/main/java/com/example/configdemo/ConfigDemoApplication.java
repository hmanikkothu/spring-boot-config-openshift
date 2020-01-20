package com.example.configdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class ConfigDemoApplication {

	@Value("${service.message}")
	private String svcMsg;

	private final ApplicationConfig config;

	public ConfigDemoApplication(ApplicationConfig config) {
		this.config = config;
	}

	public static void main(String[] args) {
		SpringApplication.run(ConfigDemoApplication.class, args);
	}

	@GetMapping("svcmessage")
	public String svcMessage() {
		return "Hello. - " + svcMsg;
	}

	@GetMapping("message")
	public String message() {
		return "Hello. - " + config.getMessage();
	}

}
