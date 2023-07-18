package day9.practice;

import java.util.ArrayList;
import java.util.Collections;


public class HashmapWorkout{
	public static void main(String[] args) {
		ArrayList<Integer> DemoNumbers = new ArrayList<Integer>();
        DemoNumbers.add(1);
        DemoNumbers.add(5);
        DemoNumbers.add(2);
        DemoNumbers.add(7);
        DemoNumbers.add(23);
        DemoNumbers.add(678);
        
        Collections.sort(DemoNumbers);
        for(int ex : DemoNumbers) {
        	 System.out.print(ex+" ");	
        }
       
	}

}
