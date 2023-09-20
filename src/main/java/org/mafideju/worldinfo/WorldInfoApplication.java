package org.mafideju.worldinfo;

import org.mafideju.worldinfo.dao.type.CityDAO;
import org.mafideju.worldinfo.dao.type.CountryService;
import org.mafideju.worldinfo.entity.City;
import org.mafideju.worldinfo.entity.Country;
import org.mafideju.worldinfo.enumeration.Continent;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(
		scanBasePackages = {
				"org.mafideju.worldinfo",
				"org.mafideju.config"
		}
)
public class WorldInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorldInfoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(CityDAO cityDAO) {
		return runner -> {
			createCountry(cityDAO);
		};
	}

	private void createCountry(CityDAO cityDAO) {
		City city = new City(
				"São Bernardo do Campo",
				"BRA",
				"ABC Paulista",
				1253357
		);

		cityDAO.save(city);
		System.out.println(city.toString());
	}

}
