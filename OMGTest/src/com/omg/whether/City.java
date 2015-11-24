package com.omg.whether;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class City {
	private String cityName;
	private List<Double> rainfall;
	private List<Double> windForce;
	private Direction[] directions;

	private static int DIRECTIONS = 4;
	private static int HOURS = 24;

	public City(String cityName) {
		this.cityName = cityName;
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
//			System.out.println("Hour: " + i + " Rain fall: "+ getRainfall().get(i) + " wind force: "+ getWindForce().get(i) + " directions: "+ getDirections()[i]);
//			System.out.printf("Hour:  %d  Rain fall: %d wind force:  %d directions: %d",i,getRainfall().get(i),getWindForce().get(i),getDirections()[i]);
			System.out.printf("%nHour: ",i);
		}
		System.out.println();
	

	}

}
