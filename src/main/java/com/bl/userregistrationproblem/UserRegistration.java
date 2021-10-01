package com.bl.userregistrationproblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void checkValidFirstName(String firstName) {

		boolean isFirstName;
		String firstNameRegex = "[A-Z]{1}[a-z]{2,}";
		Pattern patternObject = Pattern.compile(firstNameRegex);
		if (firstName == null) {
			isFirstName = false;
		}
		Matcher matcherObject = patternObject.matcher(firstName);
		isFirstName = matcherObject.matches();

		if (isFirstName)
			System.out.println(firstName + " is a Valid First Name");
		else
			System.err.println(firstName + " is an Invalid First Name");
	}

	public static void checkValidLastName(String lastName) {

		boolean isLastName = true;
		String lastNameRegex = "[A-Z]{1}[a-z]{2,}";
		Pattern patternObject = Pattern.compile(lastNameRegex);
		if (lastName == null) {
			isLastName = false;
		}
		Matcher matcherObject = patternObject.matcher(lastName);
		isLastName = matcherObject.matches();

		if (isLastName)
			System.out.println(lastName + " is a Valid Last Name");
		else
			System.err.println(lastName + " is an Invalid Last Name");
	}

	public static void checkValidEmail(String email) {

		boolean isEmail = true;
		String emailRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
		Pattern patternObject = Pattern.compile(emailRegex);
		if (email == null) {
			isEmail = false;
		}
		Matcher matcherObject = patternObject.matcher(email);
		isEmail = matcherObject.matches();

		if (isEmail)
			System.out.println(email + " is a Valid Email address\n");
		else
			System.err.println(email + " is an Invalid Email address");
	}

	public static void checkValidMobileNumber(String mobileNumber) {

		boolean isMobileNumber = true;
		String mobileRegex = "^[0-9]{2}\\s{1}[0-9]{10}$";
		Pattern patternObject = Pattern.compile(mobileRegex);
		if (mobileNumber == null) {
			isMobileNumber = false;
		}
		Matcher matcherObject = patternObject.matcher(mobileNumber);
		isMobileNumber = matcherObject.matches();

		if (isMobileNumber)
			System.out.println(mobileNumber + " is a Valid  Mobile Number\n");
		else
			System.err.println(mobileNumber + " is an Invalid Mobile Number");
	}

	public static void checkValidPassword(String password) {

		boolean isPassword = true;
		String passwordRegex = "^(?=.*[A-Z])([a-zA-Z0-9]){8,}$";
		Pattern patternObject = Pattern.compile(passwordRegex);
		if (password == null) {
			isPassword = false;
		}
		Matcher matcherObject = patternObject.matcher(password);
		isPassword = matcherObject.matches();

		if (isPassword)
			System.out.println(password + " is a Valid  Password\n");
		else
			System.err.println(password + " is an Invalid Password");
	}

	public static void main(String[] args) {

		System.out.println("---------- Welcome To User Registration ----------");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Your First Name");
		String firstName = scanner.next();
		checkValidFirstName(firstName);

		System.out.println("Enter Your Last Name");
		String lastName = scanner.next();
		checkValidLastName(lastName);

		System.out.println("Enter Your Email Address");
		String email = scanner.next();
		checkValidEmail(email);

		System.out.println("Enter Your Mobile Number");
		String mobileNumber = scanner.next();
		checkValidMobileNumber(mobileNumber);

		System.out.println("Enter Your Password");
		String password = scanner.next();
		checkValidPassword(password);

		scanner.close();

	}
}
