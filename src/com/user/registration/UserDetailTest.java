package com.user.registration;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class UserDetailTest {
	
	public static ValidationOperation operation;
	public static User user;
	
	@BeforeClass
	public static void init() {
		operation = new ValidationOperation();
		user = new User();
	}
	
	@Test
	public void test_firstname_is_valid() {
		boolean result = operation.isValidFirstName(user);
		assertEquals(true, result);
	}
	
	@Test
	public void test_lastname_is_valid() {
		boolean result = operation.isValidLastName(user);
		assertEquals(true, result);
	}
	
	@Test
	public void test_email_is_valid() {
		boolean result = operation.isValidEmail(user);
		assertEquals(true, result);
	}
	
	@Test
	public void test_phone_is_valid() {
		boolean result = operation.isValidPhone(user);
		assertEquals(true, result);
	}
	
	@Test
	public void test_password_is_valid() {
		boolean result = operation.isValidPassword(user);
		assertEquals(true, result);
	}
	
	@Test
	public void test_firstname_is_invalid() {
		boolean result = operation.isValidFirstName(user);
		assertEquals(false, result);
	}
	
	@Test
	public void test_lastname_is_invalid() {
		boolean result = operation.isValidLastName(user);
		assertEquals(false, result);
	}
	
	@Test
	public void test_email_is_invalid() {
		boolean result = operation.isValidEmail(user);
		assertEquals(false, result);
	}
	
	@Test
	public void test_phone_is_invalid() {
		boolean result = operation.isValidPhone(user);
		assertEquals(false, result);
	}
	
	@Test
	public void test_password_is_invalid() {
		boolean result = operation.isValidPassword(user);
		assertEquals(false, result);
	}
}
