package com.employee;

public class MainClass {

	public static void main(String[] args) {
		
		double attendance = Math.floor( (Math.random() * 10) % 2);
		
		if (attendance == 0) {
			System.out.println("Employee is absent");
		}
		else {
			System.out.println("Employess is present");
		}
	}

}