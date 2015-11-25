package com.omg.whether;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class City {
	private String cityName;
	private List<Integer> temperature;
	private List<Double> rainfall;
	private List<Double> windForce;
	private Direction[] directions;

	private static int DIRECTIONS = 4;
	private static int HOURS = 24;

	public City(String cityName) {
		this.cityName = cityName;
		this.temperature = new ArrayList<Integer>();
		this.rainfall = new ArrayList<Double>();
		this.windForce = new ArrayList<Double>();
		this.directions = new Direction[DIRECTIONS];
		;
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

	public void print() {
		System.out.println(getCityName());
		for (int i = 0; i < HOURS; i++) {
			System.out.printf("Hour: %d: Temperature: %d Rain fall: %.1f wind force: %.1f directions: %s\n", i,getTemperature().get(i),getRainfall().get(i),getWindForce().get(i),getDirections()[i]);
		}
		System.out.println();

	}

}
