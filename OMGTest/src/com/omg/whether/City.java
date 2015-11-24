package com.omg.whether;

public class City {
	private String cityName;
	private double[] rainfall;
	private double[] windForce;
	private Direction[] directions;

	private static int hour = 24;

	public City(String cityName) {
		this.cityName = cityName;
		this.rainfall = new double[hour];
		this.windForce = new double[hour];
		this.directions = new Direction[hour];
		;
	}

	public City(String cityName, double[] rainfall, double[] windForce,
			Direction[] directions) {

		this.cityName = cityName;
		this.rainfall = rainfall;
		this.windForce = windForce;
		this.directions = directions;
	}

	public double[] getRainfall() {
		return rainfall;
	}

	public void setRainfall(double[] rainfall) {
		this.rainfall = rainfall;
	}

	public double[] getWindForce() {
		return windForce;
	}

	public void setWindForce(double[] windForce) {
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

}
