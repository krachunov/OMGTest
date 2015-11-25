package com.omg.whether;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

import com.omg.whether.dataGenerator.GenerateDate;

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

}
