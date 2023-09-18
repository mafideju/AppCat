package org.mafideju.appcat;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(
		scanBasePackages = {
				"org.mafideju.appcat",
				"org.mafideju.config"
		}
)
public class AppcatApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppcatApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(String[] args) {
		return runner -> {
			System.out.println("Hello, Spring Boot!!");
		};
	}

}
