package com.example.demo11;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class country
{

    private String State;
	private String City;
	private String Country;
    @Id
	private String Zipcode;

    public country(String state, String city, String country, String zipcode) {
        State = state;
        City = city;
        Country = country;
        Zipcode = zipcode;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getZipcode() {
        return Zipcode;
    }

    public void setZipcode(String zipcode) {
        Zipcode = zipcode;
    }
	
	
}