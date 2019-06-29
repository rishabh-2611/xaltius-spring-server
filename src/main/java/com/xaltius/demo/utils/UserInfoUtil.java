package com.xaltius.demo.utils;

import java.util.Calendar;

public class UserInfoUtil {

	public int getAge(int dob_year) {
		Calendar today = Calendar.getInstance();
		int current_year = today.get(Calendar.YEAR);
		int age = current_year - dob_year;

		return age;
	}

	public String getBackgroundClassName(int dob_year) {

		int age = getAge(dob_year);

		if (age <= 20)
			return "bg-light-blue";
		else if (age >= 21 && age <= 50)
			return "bg-light-red";
		else
			return "bg-light-grey";
	}
}
