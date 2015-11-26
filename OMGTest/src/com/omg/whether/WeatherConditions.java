package com.omg.whether;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

import com.omg.whether.dataGenerator.GenerateDate;

public class WeatherConditions {

	private Map<String, City> citysByName;
	private List<City> allCities;

	public WeatherConditions() {
		this.citysByName = new TreeMap<String, City>();
		this.allCities = new ArrayList<City>();
	}

	public void addCity(String cityName) {
		City newCity = new City(cityName);
		getCitysByName().put(cityName, newCity);
		getAllCities().add(newCity);

	}

	public Map<String, City> getCitysByName() {
		return citysByName;
	}

	public List<City> getAllCities() {
		return allCities;
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
			currentCity.setMaxTemerature();
			currentCity.setMinTemerature();
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

		return Collections.min(getAllCities(), new Comparator<City>() {

			@Override
			public int compare(City o1, City o2) {
				return (o1.getMinTemerature() < o2.getMinTemerature()) ? 1
						: (o1.getMinTemerature() > o2.getMinTemerature()) ? -1
								: 0;
			}
		});
	}

	public City cityWithMaxTemperature() {
		return Collections.max(getAllCities(), new Comparator<City>() {

			@Override
			public int compare(City o1, City o2) {
				return (o1.getMaxTemerature() < o2.getMaxTemerature()) ? 1
						: (o1.getMaxTemerature() > o2.getMaxTemerature()) ? -1
								: 0;
			}
		});
	}
}
