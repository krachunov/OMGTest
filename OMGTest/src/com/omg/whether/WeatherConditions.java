package com.omg.whether;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.Map.Entry;

import com.omg.whether.dataGenerator.GenerateDate;

public class WeatherConditions {

	private Map<String, City> citysByName;
	private PriorityQueue<City> allCities;

	// TODO Save city in order - min max
	// Use sort and comparator

	public WeatherConditions() {
		this.citysByName = new TreeMap<String, City>();
		this.allCities = new PriorityQueue<City>();
	}

	public void addCity(String cityName) {
		City newCity = new City(cityName);
		getCitysByName().put(cityName, newCity);
		getAllCities().offer(newCity);

	}

	public Map<String, City> getCitysByName() {
		return citysByName;
	}

	public void setCitysByName(Map<String, City> citysByName) {
		this.citysByName = citysByName;
	}

	public PriorityQueue<City> getAllCities() {
		return allCities;
	}

	public void setAllCities(PriorityQueue<City> allCities) {
		this.allCities = allCities;
	}

	// Generate values
	/**
	 * Generate info about temperature, rainfall, wind force and wind direction
	 * 
	 * @param hours
	 *            - hours to generate
	 */
	public void generatorData(int hours) {
		for (Entry<String, City> entry : this.getCitysByName().entrySet()) {
			City currentCity = entry.getValue();
			currentCity.setTemperature(GenerateDate.generateTempereture(hours));
			currentCity.setRainfall(GenerateDate.generateRainfall(hours));
			currentCity.setWindForce(GenerateDate.generateWindForce(hours));
			currentCity.setDirections(GenerateDate.generateDirections(hours));
		}
	}

	public void printAllCitiesInfo() {
		// Print all cities and all information
		for (Entry<String, City> entry : this.getCitysByName().entrySet()) {
			City currentCity = entry.getValue();
			currentCity.printAllInfoAboutCity();
		}
	}

	public void printInfoByCity(String city) {
		City currentCity = getCitysByName().get(city);
		currentCity.printAllInfoAboutCity();

	}

	public City cityWithMinTemperature() {
		return getAllCities().poll();
	}

	public City cityWithMaxTemperature() {
		return getAllCities().poll();

	}

}
