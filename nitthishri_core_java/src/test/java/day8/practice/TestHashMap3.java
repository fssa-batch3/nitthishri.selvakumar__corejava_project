package day8.practice;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestHashMap3 {
	
	
	@Test
	public void testValidCount() {

		 String input = "Ram,Ram,Superman,Spider,hey,hello,Spider";
	        Map<String, Integer> countMap = HashMap3.countRepetation(input);

	        Assertions.assertEquals(2, countMap.get("Ram"));
	        Assertions.assertEquals(1, countMap.get("Superman"));
	        Assertions.assertEquals(2, countMap.get("Spider"));
	        Assertions.assertEquals(1, countMap.get("hey"));
	        Assertions.assertEquals(1, countMap.get("hello"));

	}
	
	
	
	
	@Test
	public void testInValidCount() {

		try {
			HashMap3.countRepetation(null);
			Assertions.fail("Validatevcount failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("A string cannot be null or empty", ex.getMessage());
		}

	

	}
	
	
	

}