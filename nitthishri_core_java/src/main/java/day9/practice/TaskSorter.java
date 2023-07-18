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
	import java.util.List;

	class Task {
	    private int id;
	    private String description;
	    private LocalDate date;

	    public Task(int id, String description, LocalDate date) {
	        this.id = id;
	        this.description = description;
	        this.date = date;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public LocalDate getDate() {
	        return date;
	    }
	}

	public class TaskSorter {
	    public static void main(String[] args) {
	        // Create a list of tasks
	        List<Task> tasks = new ArrayList<>();
	        tasks.add(new Task(3, "Coding", LocalDate.parse("2022-10-22")));
	        tasks.add(new Task(5, "Product Design", LocalDate.parse("2022-10-01")));
	        tasks.add(new Task(1, "Software Design", LocalDate.parse("2022-10-07")));
	        tasks.add(new Task(3, "Coding", LocalDate.parse("2022-10-22")));

	        // Sort the tasks based on their dates
	        Collections.sort(tasks, Comparator.comparing(Task::getDate));

	        // Print the sorted tasks
	        for (Task task : tasks) {
	            System.out.println(task.getId() + "," + task.getDescription() + "," + task.getDate());
	        }
	    }
	}
