package com.omg.whether;

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
		System.out.println("Enter the city who you want to see");
		try (Scanner sc = new Scanner(System.in)) {
			String wantedCity = sc.nextLine();
			weatherInfo.printInfoByCity(wantedCity);
		}

		System.out.println("City with minimum temperature");
		weatherInfo.cityWithMinTemperature();

		System.out.println("City with maximum temperature");
		weatherInfo.cityWithMaxTemperature();
	}
}
