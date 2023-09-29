package org.mafideju.worldinfo;

import org.mafideju.worldinfo.dao.type.CityService;
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
	public CommandLineRunner commandLineRunner(CityService cityService) {
		return runner -> {
//			createCountry(cityService);
//			createCountries(cityService);
//			getCity(cityService);
//			getCityByName(cityService);
//			updateCity(cityService);
//			deleteCity(cityService);

			getCities(cityService);

		};
	}

	private void getCity(CityService cityService) {
		City city = new City(
				"London",
				"UK",
				"Capital",
				729216
		);
		cityService.save(city);
		System.out.println(city.getId());
	}


	private void getCityByName(CityService cityService) {
		List<City> cities = cityService.findByCity("New York");
		for (City city : cities) System.out.println(city);;
	}

	private void getCities(CityService cityService) {
		List<City> cities = cityService.findAll();
		for (City city : cities) System.out.println(city);
	}

	private void createCountries(CityService cityService) {
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
		cityService.save(city);
		cityService.save(city1);
		cityService.save(city2);
	}

	private void createCountry(CityService cityService) {
		City city = new City(
				"São Caetano do Sul",
				"BRA",
				"ABC Paulista",
				299216
		);

		cityService.save(city);
		System.out.println(city.toString());
	}


	private void deleteCity(CityService cityService) {
		cityService.deleteCity(9);
	}

	private void updateCity(CityService cityService) {
		int cityID = 11;
		City city = cityService.findById(cityID);
//		city.setName("Nothing Hill");
//		city.setCountryCode("UKG");
//		city.setDistrict("Central London");
		city.setId(9);
		cityService.updateCity(city);
		System.out.println(city);
		System.out.println("++++++++++++++++++++++");
	}
}
