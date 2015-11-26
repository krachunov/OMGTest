package com.omg.whether;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class City implements Comparable<City>{
	private String cityName;
	private List<Integer> temperature;
	private List<Double> rainfall;
	private List<Double> windForce;
	private Direction[] directions;
	private int maxTemerature;
	private int minTemerature;
	// TODO - Save min and max temperature for every city

	private static int DIRECTIONS = 4;
	private static int HOURS = 24;

	public City(String cityName) {
		this.cityName = cityName;
		this.temperature = new ArrayList<Integer>();
		this.rainfall = new ArrayList<Double>();
		this.windForce = new ArrayList<Double>();
		this.directions = new Direction[DIRECTIONS];
	}

	public City(String cityName, List<Double> rainfall, List<Double> windForce,
			Direction[] directions) {

		this.cityName = cityName;
		this.rainfall = rainfall;
		this.windForce = windForce;
		this.directions = directions;
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

	public void setMaxTemerature(int maxTemerature) {
		this.maxTemerature = maxTemerature;
	}

	public int getMinTemerature() {
		return minTemerature;
	}

	public void setMinTemerature(int minTemerature) {
		this.minTemerature = minTemerature;
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
	public int compareTo(City o) {
		return (this.getMinTemerature() < o.getMinTemerature()) ? 1: (this.getMinTemerature() > o.getMinTemerature()) ? -1: 0;
	}



}
