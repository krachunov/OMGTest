package com.omg.whether.dataGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.omg.whether.Direction;

public class GenerateDate {
	private static final int RANGE_RAIN_FALL = 80;
	private static final int RANGE_WIND_FORCE = 200;
	private static final int RANGE_TEMPERATURE = 25;

	private static Random random = new Random();

	public static List<Integer> generateTempereture(int hours) {
		List<Integer> temperetureList = new ArrayList<Integer>();
		int singleTemperature;
		for (int i = 0; i < hours; i++) {
			singleTemperature = random.nextInt(RANGE_TEMPERATURE);
			temperetureList.add(singleTemperature);
		}
		return temperetureList;
	}

	public static List<Double> generateRainfall(int hours) {
		List<Double> rainFallList = new ArrayList<Double>();
		double singleRainfall;
		for (int i = 0; i < hours; i++) {
			singleRainfall = random.nextDouble() * RANGE_RAIN_FALL;
			rainFallList.add(singleRainfall);
		}
		return rainFallList;
	}

	public static List<Double> generateWindForce(int hours) {
		List<Double> windForeList = new ArrayList<Double>();
		double singleWindForce;
		for (int i = 0; i < hours; i++) {
			singleWindForce = random.nextDouble() * RANGE_WIND_FORCE;
			windForeList.add(singleWindForce);
		}
		return windForeList;
	}

	public static Direction[] generateDirections(int hours) {
		Direction[] directionList = new Direction[hours];
		for (int i = 0; i < hours; i++) {
			directionList[i] = Direction.getRandom();
		}
		return directionList;
	}
}
