package day7.practice;


import java.util.ArrayList;
import java.util.HashSet;
/*
* Question#1: Create an ArrayList<Integer> of numbers with duplicate entries.
*  Use an HashSet<Integer> to remove the duplicates and display the Unique values
*/
public class Duplicate {
public static void main(String[] args) {
	
//	Create a  ArrayList integer
	
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	
//	Add the List of the numbers with duplication
	numbers.add(1);
	numbers.add(3);
	numbers.add(5);
	numbers.add(5);
	numbers.add(7);
	removeDuplicate(numbers);
}
	
	public static void removeDuplicate(ArrayList<Integer> listarr) throws IllegalArgumentException{
		if (listarr == null) {
			throw new IllegalArgumentException("Array cannot be null or empty");
		}
		// Set stores unique elements and ignores duplication
		HashSet<Integer> uniqueNum = new HashSet<Integer>(listarr);
		System.out.println("Using Hasset to remove the duplicate numbers");
		for (Integer arr : uniqueNum ) {
			System.out.print(arr);
		}
	}
	
	public static boolean Duplicatemethod(ArrayList<Integer> listarr, HashSet<Integer> uniqueNum)
			throws IllegalArgumentException {
		HashSet<Integer> str = new HashSet<>(listarr);
		if (str.equals(uniqueNum)) {
			return true;
			
		}
		else {
			throw new IllegalArgumentException("Array does not contains all the unique elements");
		}
		
	}
}