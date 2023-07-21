package day7.practice;


import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestUniqueTask {
	
// we check the valid task name
	
@Test

	public void testValidTaskName() {
		
		Assertions.assertTrue(UniqueTask.validatetaskName("Taskplay"));
	}
	
	
	
	
//	we pass the invalid input and throw the  Exception
	
@Test

	public void testInValidTaskName() {
		
// In this Line check the input empty or null
		try {
			UniqueTask.validatetaskName(null);
			Assertions.fail("Validate failed");
		} catch (IllegalArgumentException e) {
			Assertions.assertEquals(" The taskName cannot be null or empty", e.getMessage());
		}
		
//  This line we check the Task name minimum 2 char and maximum 50 char or not
		try {
			UniqueTask.validatetaskName("to");
			Assertions.fail("Validate failed");
		} catch (IllegalArgumentException e) {
			Assertions.assertEquals("The  task name should be  minimum 2 letters and maximum 50 letters", e.getMessage());
		}
	}
	
	
//	we check the date or valid date
	
@Test

	public void testValidTaskDate() {
//		 in this line we get the current date from localDate.now method
		 LocalDate currentDate = LocalDate.now();
//		 in this line  input date should be in future so we check the input date is future or past from using currentDate.plusDays() method
	        LocalDate futureDate = currentDate.plusDays(6);
		Assertions.assertTrue(UniqueTask.validateTaskDate(futureDate));
	}
	
//	If we got the invalid input and catch  the Exception
	
	
@Test

	public void testInValidTaskDate() {
		
//		First check the date is empty or null
		try {
			UniqueTask.validateTaskDate(null);
			Assertions.fail("Validatepriority failed");
		} catch (IllegalArgumentException e) {
			Assertions.assertEquals("Task date cannot be empty or  null", e.getMessage());
		}
//		 in this line we get the current date from localDate.now method
		 LocalDate currentDate = LocalDate.now();
//		 in this line  input date should be in future so we check the input date is past from using currentDate.minusDays() method
	        LocalDate lastDate = currentDate.minusDays(6);
	       
	    	try {
	    		UniqueTask.validateTaskDate(lastDate);
				Assertions.fail("Validate failed");
			} catch (IllegalArgumentException e) {
				Assertions.assertEquals("Task date should be in the prasent", e.getMessage());
			}
	}
	
//	Check the task method is valid without duplicate
	
	
@Test

	public void testValidMethod() {
		ArrayList<UniqueTask> taskList = new ArrayList<>();
		taskList.add(new UniqueTask(4, "wakeupearly", LocalDate.of(2023, 07, 19)));
		taskList.add(new UniqueTask(5, "Walking", LocalDate.of(2023, 07, 17)));
		taskList.add(new UniqueTask(6, "Ofice", LocalDate.of(2023, 07, 20)));
		Assertions.assertTrue(UniqueTask.validateDuplicatemethod(taskList));
	}
	
//	Check the task method is valid with duplicate
	
@Test

	public void testInValidMethod() {
		ArrayList<UniqueTask> taskList = new ArrayList<>();
		UniqueTask t1 = new UniqueTask(1, "wakeupearly", LocalDate.of(2023, 07, 16));
		   taskList.add(t1);
		   taskList.add(t1);
		   taskList.add(new UniqueTask(2, "Walking", LocalDate.of(2023, 07, 17)));
		   taskList.add(new UniqueTask(3, "Office", LocalDate.of(2023, 07, 15)));
		try {
		Assertions.fail("Validate failed");
		}
		catch (IllegalArgumentException e) {
			Assertions.assertEquals("duplicate task was found", e.getMessage());
		}
	}
}