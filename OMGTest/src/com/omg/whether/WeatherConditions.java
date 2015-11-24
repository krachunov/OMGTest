package com.omg.whether;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class WeatherConditions {

	private List<City> citys;
	private Map<String, City> citysByName;

	public WeatherConditions() {
		this.citys = new ArrayList<City>();
		this.citysByName = new TreeMap<String, City>();

	}

	public void addCity(String cityName) {
		City newCity = new City(cityName);
		getCitys().add(newCity);
		getCitysByName().put(cityName, newCity);
	}

	public List<City> getCitys() {
		return citys;
	}

	public void setCitys(List<City> citys) {
		this.citys = citys;
	}

	public Map<String, City> getCitysByName() {
		return citysByName;
	}

	public void setCitysByName(Map<String, City> citysByName) {
		this.citysByName = citysByName;
	}

}
