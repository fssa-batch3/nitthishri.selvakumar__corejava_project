package day10.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestValidationEmail {
	
	@Test
	public void testValidEmailException() { 
		
		Assertions.assertTrue(EmailValidator.isValidEmail("nitthishri@gmail.com"));
		
	}
	
	@Test
	public void testInvalidNullInput() {
		
		try {
			EmailValidator.isValidEmail(null);
			Assertions.fail("Test Invalid Null Input Method Is Failded");
		}catch(InvalidEmailException ex) {
			Assertions.assertEquals("The email cannot be null", ex.getMessage());
		}
		
	}
	
	@Test
	public void testInvalidEmailAddress() {
		
		try {
			EmailValidator.isValidEmail("nitthigmail.com");
			Assertions.fail("Test Invalid Email Address Method Is Failded");
		}catch(InvalidEmailException ex) {
			Assertions.assertEquals("Invalided Email Address", ex.getMessage());
		}
		
	}

}
