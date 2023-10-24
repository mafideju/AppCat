package org.mars.geodatarest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"org.mars.geodatarest",
		"org.mars.config"
})
public class GeodataRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeodataRestApplication.class, args);
	}

}
