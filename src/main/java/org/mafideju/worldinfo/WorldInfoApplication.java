package org.mafideju.worldinfo;

import org.mafideju.worldinfo.dao.type.CityDAO;
import org.mafideju.worldinfo.entity.City;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

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
//			createCountry(cityDAO);
//			createCountries(cityDAO);
//			getCity(cityDAO);
			getCities(cityDAO);
		};
	}

	private void getCity(CityDAO cityDAO) {
		City city = new City(
				"London",
				"UK",
				"Capital",
				729216
		);
		cityDAO.save(city);
		System.out.println(city.getId());
		City city1 = cityDAO.findById(city.getId());
		System.out.println(city1);
	}

	private void getCities(CityDAO cityDAO) {
		List<City> cities = cityDAO.findAll();
		for (City city : cities) System.out.println(city);
	}

	private void createCountries(CityDAO cityDAO) {
		City city = new City(
				"São Paulo",
				"BRA",
				"Capital",
				12299216
		);
		City city1 = new City(
				"Sorocaba",
				"BRA",
				"Oeste Paulista",
				299216
		);
		City city2 = new City(
				"New York",
				"USA",
				"New York Greater Area",
				299216
		);
		cityDAO.save(city);
		cityDAO.save(city1);
		cityDAO.save(city2);
	}

	private void createCountry(CityDAO cityDAO) {
		City city = new City(
				"São Caetano do Sul",
				"BRA",
				"ABC Paulista",
				299216
		);

		cityDAO.save(city);
		System.out.println(city.toString());
	}

}
