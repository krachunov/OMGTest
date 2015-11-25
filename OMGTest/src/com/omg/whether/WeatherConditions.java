package com.omg.whether;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

import com.omg.whether.dataGenerator.GenerateDate;

public class WeatherConditions {

	private Map<String, City> citysByName;
	private List<City> allCities;

	// TODO Save city in order - min max
	// Use sort and comparator

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

	public void setCitysByName(Map<String, City> citysByName) {
		this.citysByName = citysByName;
	}

	public List<City> getAllCities() {
		return allCities;
	}

	public void setAllCities(List<City> allCities) {
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
		getAllCities().sort(new Comparator<City>() {

			@Override
			public int compare(City o1, City o2) {
				return (o1.getMinTemerature() < o2.getMinTemerature()) ? 1
						: (o1.getMinTemerature() > o2.getMinTemerature()) ? -1
								: 0;
			}
		});
		return getAllCities().get(0);
	}

	public City cityWithMaxTemperature() {
		getAllCities().sort(new Comparator<City>() {

			@Override
			public int compare(City o1, City o2) {
				return (o1.getMinTemerature() < o2.getMinTemerature()) ? -1
						: (o1.getMinTemerature() > o2.getMinTemerature()) ? 1
								: 0;
			}
		});
		return getAllCities().get(0);

	}

}
