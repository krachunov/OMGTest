package com.omg.whether;

import java.util.Map.Entry;

import com.omg.whether.dataGenerator.GenerateDate;

public class Test {

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

		for (Entry<String, City> entry : wc.getCitysByName().entrySet()) {
			City currentCity = entry.getValue();
			currentCity.setTemperature(GenerateDate.generateTempereture(hours));
			 currentCity.setRainfall(GenerateDate.generateRainfall(hours));
			// currentCity.setTemperature(GenerateDate.generateTemperature());
			// currentCity.setDirections(GenerateDate.generateDirections());
		}
		for (Entry<String, City> entry : wc.getCitysByName().entrySet()) {
			City currentCity = entry.getValue();
			currentCity.print();

		}

	}

}
