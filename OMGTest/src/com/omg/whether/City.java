package com.omg.whether;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class City {
	private String cityName;
	private List<Integer> temperature;
	private List<Double> rainfall;
	private List<Double> windForce;
	private Direction[] directions;
	private int maxTemerature;
	private int minTemerature;

	private static int DIRECTIONS = 4;
	private static int HOURS = 24;

	// Create city with empty lists
	public City(String cityName) {
		this.cityName = cityName;
		this.temperature = new ArrayList<Integer>();
		this.rainfall = new ArrayList<Double>();
		this.windForce = new ArrayList<Double>();
		this.directions = new Direction[DIRECTIONS];
	}

	public List<Integer> getTemperature() {
		return temperature;
	}

	public void setTemperature(List<Integer> temperature) {
		this.temperature = temperature;
	}

	public List<Double> getRainfall() {
		return rainfall;
	}

	public void setRainfall(List<Double> rainfall) {
		this.rainfall = rainfall;
	}

	public List<Double> getWindForce() {
		return windForce;
	}

	public void setWindForce(List<Double> windForce) {
		this.windForce = windForce;
	}

	public Direction[] getDirections() {
		return directions;
	}

	public void setDirections(Direction[] directions) {
		this.directions = directions;
	}

	public String getCityName() {
		return cityName;
	}

	public int getMaxTemerature() {
		return maxTemerature;
	}

	/**
	 * Get max value from list of temperature and set variable maxTemerature
	 */
	public void setMaxTemerature() {
		this.maxTemerature = Collections.max(getTemperature());
	}

	public int getMinTemerature() {
		return minTemerature;
	}

	/**
	 * Get minimum value from list of temperature and set variable minTemerature
	 */
	public void setMinTemerature() {
		this.minTemerature = Collections.min(getTemperature());
	}

	public void printAllInfoAboutCity() {
		System.out.println(getCityName());
		for (int i = 0; i < HOURS; i++) {
			System.out
					.printf("Hour: %d: Temperature: %dC Rain fall: %.1fmm wind force: %.1fm/s directions: %s\n",
							i, getTemperature().get(i), getRainfall().get(i),
							getWindForce().get(i), getDirections()[i]);
		}
		System.out.println();
	}

	@Override
	public String toString() {
		return getCityName();
	}
}
