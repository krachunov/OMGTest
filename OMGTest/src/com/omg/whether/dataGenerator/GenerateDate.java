package com.omg.whether.dataGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.omg.whether.Direction;

public class GenerateDate {
	public static List<Integer> generateTempereture(int hours) {
		List<Integer> temperetureList = new ArrayList<Integer>();
		Random random = new Random();
		int singleTemperature;
		for (int i = 0; i < hours; i++) {
			singleTemperature = random.nextInt(25) + 1;
			temperetureList.add(singleTemperature);
		}
		return temperetureList;
	}

	public static List<Double> generateRainfall() {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<Integer> generateTemperature() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Direction[] generateDirections() {
		// TODO Auto-generated method stub
		return null;
	}

}
