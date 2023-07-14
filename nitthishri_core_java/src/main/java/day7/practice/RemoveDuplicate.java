package day7.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate{
	public static void main(String[] args) {
		
        ArrayList cityList = new ArrayList();
        cityList.add("Chennai");
        cityList.add("Bangalore");
        cityList.add("Mumbai");
        cityList.add("Chennai");
        cityList.add("Mumbai");
        
        Set<String> city = new HashSet<String>(cityList);
        city.addAll(cityList);
        System.out.println(city);
         
	}
	

}
