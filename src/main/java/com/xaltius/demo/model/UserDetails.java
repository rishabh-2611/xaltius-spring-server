package com.xaltius.demo.model;

public class UserDetails {

	private String name;
	private int day;
	private int month;
	private int year;

	public UserDetails() {
		super();
	}

	// Getters & Setters
	// For Name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// For DOB_day
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	// For DOB_month
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	// For DOB_year
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
