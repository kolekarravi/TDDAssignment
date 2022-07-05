package com.yash.tdd.TddJunitExample;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Test;

public class SpringCalculater {

	Calculater cal = new Calculater();

	

/////-------------------------Assignment No TDD --------------------------------///////	

	// find two number hcf same or not
	// Q 1
	@Test
	public void test_given_checkHcfSameorNot() {

		int res = cal.checkHcfSameOrNot();
		assertEquals(res, 4);
	}

	// find two string check with Palindrome
	// Q 2
	@Test
	public void test_given_twocheckpalidrome() {

		boolean res = cal.isPalindrome();
		// System.out.println(res);
		assertEquals(res, true);
	}

	// find two database connection isTrue or false
	// Q 3
	@Test
	public void test_given_tocheckDatabaseConnection() throws ClassNotFoundException, SQLException {

		boolean res = cal.dbConnection();
		// System.out.println(res);
		assertEquals(res, true);
	}

	// Question 4
	@Test
	public void test_given_tocheckArmsStrongNumber() {

		boolean res = cal.toCheckArmstrongNo(153);
		// System.out.println(res);
		assertEquals(res, true);
	}

	// Q 6
	// to find vowels count in string (a, e, i, o, u)
	@Test
	public void test_given_tofind_VowelsInThisString() {

		int res = cal.findCountVowelsString();
		assertEquals(res, 22);
	}

	// Question 7
	// to check palidrome number yes or no
	@Test
	public void test_given_toCheckpalidromeNumber() {

		boolean res = cal.toCheckPlaidromeNo(454);
		// System.out.println(res);
		assertEquals(res, true);
	}

	// Q8 to find Array find even or Not
	@Test
	public void test_given_EvenNumberInArray() {

		int res = cal.toFindEvenNoArray();
		assertEquals(res, 3);

	}

	// Q9 to remove special charater and space
	@Test
	public void test_given_toRemoveSpecialcharater() {

		String res = cal.findstringWithoutSpace();
		System.out.println(res);
		assertEquals(res, "This Red car");

	}
	// Q10

	@Test
	public void test_find_concat_string() {
		String stringArray[] = { "apple", "orange", "banana", "lemon" };
		String res = cal.findConcatString(stringArray);
		System.out.println("outputdata  :" + res);
		assertEquals(res, "apple-orange-banana-lemon");

	}

}
