package com.user.registration;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MultipleEmailTest {
	private String email;
	public static ValidationOperation operation;
	public static User user;
	
	public MultipleEmailTest(String email) {
		super();
		this.email = email;
	}
	
	@BeforeClass
	public static void init() {
		operation = new ValidationOperation();
		user = new User();
	}
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[]{
				"abc@yahoo.com",
				"abc-100@yahoo.com",
				"abc.100@yahoo.com",
				"abc111@abc.com",
				"abc-100@abc.net",
				"abc.100@abc.com.au",
				"abc@1.com",
				"abc@gmail.com.com",
				"abc+100@gmail.com"});
	}
	
	@Test
	public void testValidEmails() {
		user.setEmailId(email);
		assertEquals(true,operation.isValidEmailId(user));
	}
	

}
