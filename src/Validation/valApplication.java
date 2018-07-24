package Validation;

//Created by Brian Seyferth on 7/23/2018

import java.util.Scanner;

public class valApplication {

	//Specification 1 tests whether first letter is capital, it only contains letters
	//and has a length between 0-30.
	public static String getName(Scanner scnr, String prompt) {
		boolean isValid = true;
		String input1 = "";
		//sets up a loop to continue if it is not valid
		do {
			System.out.println(prompt);
			input1 = scnr.nextLine();
		
		if (!input1.matches("[A-Z][a-z]+") || input1.length() <= 0 || input1.length() > 30) {
			System.out.println("The name is invalid. Please try again.");
			isValid = true;
		} else {
			isValid = false;
		}
		} while (isValid ==true);
		return input1;
	}
	
	//Specification 2 Email address verifies that each part is correct
	//and it contains both an @ and .
	public static String getEmail(Scanner scnr, String prompt) {
		boolean isValid = true;
		String input1 = "";
		
		//sets up a loop to continue if it is not valid
		do {
			System.out.println(prompt);
			input1 = scnr.nextLine();
			
			// if statement verifies the format required
			if (!input1.matches("[A-Za-z0-9]{5,30}@[A-Za-z0-9]{5,10}\\.[A-Za-z0-9]{2,3}")) {
				System.out.println("The email is invalid. Pleaase try again.");
				isValid = true;
			} else {
				isValid = false;
			}
		} while (isValid ==true);
		return input1;
	}
	
	//Specification 3 phone number and it verifies the correct format
	public static String getPhoneNumber(Scanner scnr, String prompt) {
		boolean isValid = true;
		String input1 = "";
		
		//sets up a loop to continue if it is not valid
		do {
			System.out.println(prompt);
			input1 = scnr.nextLine();
			
			// if statement verifies the format required
			if (!input1.matches("[0-9]{3}-[0-9]{3}-[0-9]{4}")) {
				System.out.println("The phone number is invalid. Please try again.");
				isValid = true;
			} else {
				isValid = false;
			}
		} while (isValid ==true);
		return input1;
	}
	
	public static String getDate(Scanner scnr, String prompt) {
		boolean isValid = true;
		String input1 = "";
		
		//sets up a loop to continue if it is not valid
		do {
			System.out.println(prompt);
			input1 = scnr.nextLine();
			
			// if statement verifies the format required
			if (!input1.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")) {
				System.out.println("The date is invalid. Please try again.");
				isValid = true;
			} else {
				isValid = false;
			}
		} while (isValid ==true);
		return input1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		char result = 'y';
		
		//do loop sets up the re-rum question
		do {
			
		//shows how all the validation methods work	
		String name = getName(scnr, "Enter you name, it must start with a capital letter \nand have between 0-30 characters:");
		String email = getEmail(scnr,"Enter your email:");
		String phoneNumber = getPhoneNumber(scnr, "Enter your phone number: ###-###-####");
		String date = getDate(scnr, "Enter a date: DD/MM/YYYY");
		
		//prints out the results for the user
		System.out.println(name);
		System.out.println(email);
		System.out.println(phoneNumber);
		System.out.println(date);
		
		//asks if they want to re-run
		System.out.println("Would you like to run the program again? (y to continue)");
		result = scnr.next().charAt(0);

		} while (result == 'y');
		
		//alerts the user they are leaving the program
		System.out.println("Goodbye!");
	}

}
