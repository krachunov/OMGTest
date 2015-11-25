package com.omg.whether.dataGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.omg.whether.Direction;

public class GenerateDate {

	private static Random random = new Random();

	public static List<Integer> generateTempereture(int hours) {
		List<Integer> temperetureList = new ArrayList<Integer>();
		int singleTemperature;
		for (int i = 0; i < hours; i++) {
			singleTemperature = random.nextInt(25) + 1;
			temperetureList.add(singleTemperature);
		}
		return temperetureList;
	}

	public static List<Double> generateRainfall(int hours) {
		List<Double> rainFallList = new ArrayList<Double>();
		double singleRainfall;
		for (int i = 0; i < hours; i++) {
			singleRainfall = random.nextDouble() * 80;
			rainFallList.add(singleRainfall);
		}
		return rainFallList;
	}

	public static List<Integer> generatewindForce() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Direction[] generateDirections(int hours) {
		Direction[] directionList = new Direction[hours];
		for (int i = 0; i < hours; i++) {
			directionList[i] = Direction.getRandom();
		}
		return directionList;
	}

}
