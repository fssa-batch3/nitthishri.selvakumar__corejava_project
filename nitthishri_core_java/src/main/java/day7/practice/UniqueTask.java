package day7.practice;

    

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
/*
* Question#2: Create an ArrayList<TaskUnique> of TaskUnique with tasks having the same name and deadline.
* Use a HashSet<TaskUnique> to remove duplicate tasks.
*/
public class UniqueTask {
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
  public UniqueTask(int id, String name, LocalDate deadline) {
      this.id = id;
      this.name = name;
      this.deadline = deadline;
  }
  @Override
  public String toString() {
      return "Duplicate [id=" + id + ", name=" + name + ", deadline=" + deadline + "]";
  }
  public static void main(String[] args) {
      ArrayList<UniqueTask> tasks = new ArrayList<>();
      UniqueTask t1 = new UniqueTask(1, "wakeupearly", LocalDate.of(2023, 7, 16));
      tasks.add(t1);
      tasks.add(t1);
      tasks.add(new UniqueTask(2, "Walking", LocalDate.of(2023, 7, 17)));
      tasks.add(new UniqueTask(3, "Office", LocalDate.of(2023, 7, 15)));
      System.out.println(tasks);
      UniqueTask(tasks);
  }
  private static void UniqueTask(ArrayList<UniqueTask> tasks) {
	// TODO Auto-generated method stub
	
}
public static void taskDuplicate(ArrayList<TaskUnique> tasks) {
      HashSet<UniqueTask> uniqueTasks = new HashSet<TaskUnique>(tasks);
      System.out.println(uniqueTasks);
  }
}