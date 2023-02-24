package com.java.jenkins.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
	
	public static Logger logger=LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@PostConstruct
	public void intt() {
		logger.info("Application started...");
	}

	public static void main(String[] args) {
		logger.info("Application excuted...");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
