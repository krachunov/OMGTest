package com.omg.whether;

import java.util.Map;
import java.util.TreeMap;

public class WeatherConditions {

	private Map<String, City> citysByName;

	public WeatherConditions() {
		this.citysByName = new TreeMap<String, City>();

	}

	public void addCity(String cityName) {
		City newCity = new City(cityName);
		getCitysByName().put(cityName, newCity);
	}

	public Map<String, City> getCitysByName() {
		return citysByName;
	}

	public void setCitysByName(Map<String, City> citysByName) {
		this.citysByName = citysByName;
	}

}
