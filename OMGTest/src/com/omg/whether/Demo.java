package com.omg.whether;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;
import java.util.Map.Entry;

import com.omg.whether.dataGenerator.GenerateDate;

public class Demo {

	public static void main(String[] args) {
		int hours = 24;
		WeatherConditions weatherInfo = new WeatherConditions();
		
		weatherInfo.addCity("Sofia");
		weatherInfo.addCity("Plovdi");
		weatherInfo.addCity("Varna");
		weatherInfo.addCity("Burgas");
		weatherInfo.addCity("Pleven");
		weatherInfo.addCity("Ruse");
		weatherInfo.addCity("Haskovo");
		weatherInfo.addCity("Blagoevgrad");
		weatherInfo.addCity("Vraca");
		weatherInfo.addCity("Sliev");

		// Generate random info
		weatherInfo.generatorData(hours);

		// Print all info about the cities
		weatherInfo.printAllCitiesInfo();

		// Print current city info
		System.out.println("The city who you want to see");

		// Print cities with max and min temperature
		String wantedCity = "Varna"; // chosen city
		weatherInfo.printInfoByCity(wantedCity);

		System.out.println("City with minimum temperature");
		City cityWithMinTemperature = weatherInfo.cityWithMinTemperature();
		System.out.printf("City %s temperature: %d\n", cityWithMinTemperature,
				cityWithMinTemperature.getMinTemerature());

		System.out.println("City with maximum temperature");
		City cityWithMaxTemperature = weatherInfo.cityWithMaxTemperature();
		System.out.printf("City %s temperature: %d\n", cityWithMaxTemperature,
				cityWithMaxTemperature.getMaxTemerature());

	}
}
