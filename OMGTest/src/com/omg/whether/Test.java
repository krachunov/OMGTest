package com.omg.whether;

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
		
		
		for (City city : wc.getCitys()) {
			city.print();
		}
	

	}

}
