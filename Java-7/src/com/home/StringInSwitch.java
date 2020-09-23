package com.home;

import java.util.Scanner;

public class StringInSwitch {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			while (true) {
				scanner = new Scanner(System.in);
				System.out.println("Enter name of a day: ");
				String dayOfWeek = scanner.next();
				String dayTypeOfWeek = getTypeOfDayWithSwitchStatement(dayOfWeek);
				System.out.println(dayTypeOfWeek);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static String getTypeOfDayWithSwitchStatement(String dayOfWeek) {
		String typeOfDay;
		switch (dayOfWeek) {
		case "Monday":
			typeOfDay = "Start of work week..";
			break;

		case "Tuesday":
		case "Wednesday":
		case "Thursday":
			typeOfDay = "Mid week..";
			break;

		case "Friday":
			typeOfDay = "End of work week..";
			break;

		case "Saturday":
		case "Sunday":
			typeOfDay = "Weekend";
			break;
			
		default:
			throw new IllegalArgumentException("Invalid day of week: "+dayOfWeek);
		}
		return typeOfDay;

	}

}
