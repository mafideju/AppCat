package org.mars.geodata.entity;


public class City {

    private String cityName;
    private String countryCode;
    private String district;
    private Integer population;

    public City() {}

    public City(String cityName, String countryCode, String district, Integer population) {
        this.cityName = cityName;
        this.countryCode = countryCode;
        this.district = district;
        this.population = population;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }
}
