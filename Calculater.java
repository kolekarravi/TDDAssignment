package com.yash.tdd.TddJunitExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Calculater {

	// ***********************--Assignment TDD--**********************//
	// Question 1 TDD

	public int checkHcfSameOrNot() {

		int a = 12;
		int b = 16;
		int i, hcf = 0;

		for (i = 1; i <= a || i <= b; i++) {
			if (a % i == 0 && b % i == 0)
				hcf = i;
		}
		System.out.println("HCF of given two numbers is ::" + hcf);
		return hcf;
	}

	// Question 2 tow check palidrome
	public static boolean isPalindrome() {
		String str1 = "ABA";
		String str2 = "ABA";

		String rev1 = "";

		boolean ans1 = false;

		for (int i = str1.length() - 1; i >= 0; i--) {
			rev1 = rev1 + str1.charAt(i);
		}

		if (str1.equals(rev1)) { // checking first string
			if (str1.equals(str2)) { // second string
				ans1 = true;
			}
		}
		return ans1;
	}

	// Question 3
	public static boolean dbConnection() throws SQLException, ClassNotFoundException {
		boolean flag = false;
		String email;
		String pass;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/rest";
			String user = "root";
			String password = "root";
			String emaildata = "kolekarravindra88@gmail.com";
			String passw = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			// String query="Insert into
			// movie(name,actor,actress,director,releaseDate,ratingPoint) values
			// (?,?,?,?,?,?);";
			String query = "Select * from LoginTable where Email='kolekarravindra88@gmail.com' and PassWord='1234'; ";

			PreparedStatement pstmt = con.prepareStatement(query);

			ResultSet rst = pstmt.executeQuery();
			// pstmt.executeQuery();
			while (rst.next()) {
				email = rst.getString("Email");
				pass = rst.getString("PassWord");
				// get data form database
				System.out.println(email);
				System.out.println(pass);

				if (email.equals(emaildata) && pass.equals(passw)) {

					flag = true;

				} else {

					flag = false;

				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return flag;

	}

	// Question 4
	// to check Armstrong or not
	public static boolean toCheckArmstrongNo(int number) {

		boolean flag = false;

		int originalNumber, remainder, result = 0;

		originalNumber = number;

		while (originalNumber != 0) {
			remainder = originalNumber % 10;
			result += Math.pow(remainder, 3);
			originalNumber /= 10;
		}

		if (result == number)
			// System.out.println(number + " is an Armstrong number.");
			flag = true;
		else
			flag = false;
		// System.out.println(number + " is not an Armstrong number.");

		return flag;
	}

	// Question 6
	// find vowel count match in string
	public int findCountVowelsString() {
		int count = 0;
		String sentence = "Hi how are you welcome to tutorialspoint";

		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
				count++;
			}
		}
		System.out.println("Number of vowels in the given sentence is " + count);

		return count;
	}

	// Question 7
	// to check palindrome no yes or no
	public static boolean toCheckPlaidromeNo(int n) {

		boolean flag = false;
		int r, sum = 0, temp;

		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			flag = true;
		else
			flag = false;

		return flag;
	}

	// Question 8
	// to check even no in array
	public int toFindEvenNoArray() {
		int evenCount = 0;
		int a[] = { 1, 2, 5, 6, 3, 2 };

		System.out.println("Even Numbers:");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
				evenCount++;
			}
		}

		return evenCount;
	}

	// question 9
	// to remove special charater and space
	public String findstringWithoutSpace() {
		String value = "This @ Red $car-";
		value = value.replaceAll("[^a-zA-Z]", " ").replaceAll("\\s+", " ");
		value = value.trim();
		System.out.println(value);
		return value;
	}

	// Question 10
	public String findConcatString(String value[]) {
		List<String> liststr = Arrays.asList(value); // List of String array
		String str = liststr.stream().collect(Collectors.joining("-")); // performs joining operation
		System.out.println(str);
		return str;
	}

}
