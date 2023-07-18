package day8.practice;

import java.util.HashMap;
import java.util.Map;

public class HashMap3{
	public static void main(String[] args) {
		String[] arr = {"Ram", "Ram", "Superman", "spider", "hey", "hello", "hey", "Spider"};
		Map<String,Integer> countMap =new  HashMap<String,Integer>();
		for(int i=0; i<arr.length; i++) {
			if(countMap.get(arr[i])==null) {
				countMap.put(arr[i],1);
			}
			else {
				int count = countMap.get(arr[i]);
				count++;
				countMap.put(arr[i], count);
			}
		}
		System.out.println(countMap);
	}

}
