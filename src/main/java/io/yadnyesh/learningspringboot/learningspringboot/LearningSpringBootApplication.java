package io.yadnyesh.learningspringboot.learningspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LearningSpringBootApplication implements CommandLineRunner {

	protected final Logger logger = LoggerFactory.getLogger(LearningSpringBootApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(LearningSpringBootApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		logger.info("hello");
	}
	
	@Bean
	public StartupRunner schedulerRunner() {
		return new StartupRunner();
	}
}
