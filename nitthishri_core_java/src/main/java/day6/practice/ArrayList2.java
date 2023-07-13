package day6.practice;

// Add logic to remove duplicate tasks from the ArrayList

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
public class ArrayList2{
	public static void main(String[] args) {
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
		System.out.println(cityList);
        ArrayList<String> uniqueList = new ArrayList<String>(new HashSet<String>(cityList));
        System.out.println(uniqueList);
	}
}

