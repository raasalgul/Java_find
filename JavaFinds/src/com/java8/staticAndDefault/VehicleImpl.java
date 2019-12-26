package com.java8.staticAndDefault;

import java.util.Arrays;
import java.util.List;

public class VehicleImpl implements Vehicle{

	public static void main(String[] args) {
		Vehicle vehicle = new VehicleImpl();
		List<String>list=Arrays.asList("Sathish","Kumar");
		list.stream().forEach(System.out::println);
		String overview = vehicle.getOverview();
		System.out.println(overview);
		System.out.println(Vehicle.producer());
	}
}
