package day9.practice;
//
//3,Coding,2022-10-22
//
//5,Product Design,2022-10-01
//
//1,Software Design, 2022-10-07
//
//3,Coding,2022-10-22
//
//Sample Output
//
//5,Product Design,2022-10-01
//
//1,Software Design, 2022-10-07
//
//3,Coding,2022-10-22
//
//3,Coding,2022-10-22

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskSorter implements Comparable<TaskSorter> {
	
	

	private int id;
	private String name;
	private LocalDate deadline;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	
	public TaskSorter(int id, String name, LocalDate deadline) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
	}

	@Override
	public int hashCode() {
		return Objects.hash(deadline, id, name);
	}
	@Override
	
	public int compareTo(TaskSorter o) {

		if (deadline.equals(o.getDeadline())) {
			return 0;
		} else {
			if (deadline.isAfter(o.getDeadline())) {
				return 1;
			} else {
				return -1;
			}
			// return ( this.balance > o.getBalance()) ? 1: -1;
		}
	}

	@Override
	public String toString() {
		return "SortingTask " + id +" "+  name +" "+deadline ;
	}
	
	public static ArrayList<TaskSorter> sortNumberTask(ArrayList<TaskSorter> taskList) throws IllegalArgumentException  {
		if(taskList==null) {
			throw new IllegalArgumentException("The array cannot be empty");
			
		}
		
		Collections.sort(taskList);
	for(TaskSorter task:taskList) {
		System.out.println(task);
		
	}
	return  taskList;

	}
	
	
	public static void main(String[] args) {

		ArrayList<TaskSorter> taskList = new ArrayList<>();

		taskList.add(new TaskSorter(1, "taseat", LocalDate.of(2023, 7, 19)));
		taskList.add(new TaskSorter(5, "tasklearn", LocalDate.of(2023, 7, 11)));
		taskList.add(new TaskSorter(2, "taseat", LocalDate.of(2023, 7, 15)));
		taskList.add(new TaskSorter(3, "tasklearn", LocalDate.of(2023, 7, 17)));
//		System.out.println(taskList);
		sortNumberTask(taskList);
	}


}
