package org.mafideju.worldinfo.entity;

import jakarta.persistence.*;
import org.mafideju.worldinfo.enumeration.Continent;

@Entity
@Table(name="country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code")
    public String code;

    @Column(name = "name")
    public String name;

    @Enumerated(EnumType.STRING)
    public Continent CONTINENT;

    @Column(name = "region")
    public String region;

    @Column(name = "surface_area")
    public Integer surfaceArea;

    @Column(name = "indep_year")
    public Integer indepYear;

    @Column(name = "population")
    public Integer population;

    @Column(name = "life_expectancy")
    public Integer lifeExpectancy;

    @Column(name = "gnp")
    public Integer gnp;

    @Column(name = "gnp_old")
    public Integer gnpOld;

    @Column(name = "local_name")
    public String localName;

    @Column(name = "government_form")
    public String governmentForm;

    @Column(name = "head_of_state")
    public String headOfState;

    @Column(name = "capital")
    public String capital;

    @Column(name = "code2")
    public String code2;

    public Country() {
    }

    public Country(
            String code,
            String name,
            Continent CONTINENT,
            String region,
            Integer surfaceArea,
            Integer indepYear,
            Integer population,
            Integer lifeExpectancy,
            Integer gnp,
            Integer gnpOld,
            String localName,
            String governmentForm,
            String headOfState,
            String capital,
            String code2
        )
    {
        this.code = code;
        this.name = name;
        this.CONTINENT = CONTINENT;
        this.region = region;
        this.surfaceArea = surfaceArea;
        this.indepYear = indepYear;
        this.population = population;
        this.lifeExpectancy = lifeExpectancy;
        this.gnp = gnp;
        this.gnpOld = gnpOld;
        this.localName = localName;
        this.governmentForm = governmentForm;
        this.headOfState = headOfState;
        this.capital = capital;
        this.code2 = code2;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Continent getCONTINENT() {
        return CONTINENT;
    }

    public void setCONTINENT(Continent CONTINENT) {
        this.CONTINENT = CONTINENT;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(Integer surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public Integer getIndepYear() {
        return indepYear;
    }

    public void setIndepYear(Integer indepYear) {
        this.indepYear = indepYear;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Integer getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(Integer lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public Integer getGnp() {
        return gnp;
    }

    public void setGnp(Integer gnp) {
        this.gnp = gnp;
    }

    public Integer getGnpOld() {
        return gnpOld;
    }

    public void setGnpOld(Integer gnpOld) {
        this.gnpOld = gnpOld;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getGovernmentForm() {
        return governmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", CONTINENT=" + CONTINENT +
                ", region='" + region + '\'' +
                ", surfaceArea=" + surfaceArea +
                ", indepYear=" + indepYear +
                ", lifeExpectancy=" + lifeExpectancy +
                ", headOfState='" + headOfState + '\'' +
                '}';
    }
}
