package week3day3;

import day1.Vehicle;

public class BMW extends Vehicle {

	// inheritence is ( aquring properties parent to child )
	public void speedOmeter() {
		System.out.println("speedOmeter");

	}

	public void autoDrive() {
		System.out.println("autoDrive");

	}

	public void logo() {
		System.out.println("logo");

	}

	public static void main(String[] args) {
		BMW obj = new BMW();
		obj.applyBreak();
		obj.applyEngine();
		obj.applyMirror();
		obj.applyTyre();
		obj.autoDrive();
		obj.speedOmeter();
		obj.logo();
		
	}

}
