package com.omg.whether;

import java.util.Map.Entry;

import com.omg.whether.dataGenerator.GenerateDate;

public class Demo {

	public static void main(String[] args) {
		int hours = 24;
		WeatherConditions wc = new WeatherConditions();
		wc.addCity("Sofia");
		wc.addCity("Plovdi");
		wc.addCity("Varna");
		wc.addCity("Burgas");
		wc.addCity("Pleven");
		wc.addCity("Ruse");
		wc.addCity("Haskovo");
		wc.addCity("Blagoevgrad");
		wc.addCity("Vraca");
		wc.addCity("Sliev");

		// Generate values
		for (Entry<String, City> entry : wc.getCitysByName().entrySet()) {
			City currentCity = entry.getValue();
			currentCity.setTemperature(GenerateDate.generateTempereture(hours));
			currentCity.setRainfall(GenerateDate.generateRainfall(hours));
			currentCity.setWindForce(GenerateDate.generateWindForce(hours));
			currentCity.setDirections(GenerateDate.generateDirections(hours));
		}
		// Print all cities and all information
		for (Entry<String, City> entry : wc.getCitysByName().entrySet()) {
			City currentCity = entry.getValue();
			currentCity.print();

		}

	}

}
