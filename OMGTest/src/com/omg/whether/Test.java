package com.omg.whether;

import java.util.Map.Entry;

import com.omg.whether.dataGenerator.GenerateDate;

public class Test {

	public static void main(String[] args) {
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
			currentCity.setTemperature(GenerateDate.generateTempereture());
			currentCity.setRainfall(GenerateDate.generateRainfall());
			currentCity.setTemperature(GenerateDate.generateTemperature());
			currentCity.setDirections(GenerateDate.generateDirections());
		}

	}

}
