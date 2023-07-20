package day6.practice;


import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;
 class Task1 {
    private String name;
    public Task1(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public static boolean findTaskByName(String name, List<Task1> tasks) {
        for (Task1 task : tasks) {
            if (task.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
	public static BooleanSupplier taskName(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
public class TaskManager {
    public static void main(String[] args) {
        ArrayList<Task1> tasks = new ArrayList<Task1>();
        tasks.add(new Task1("Task 1"));
        tasks.add(new Task1("Task 2"));
        tasks.add(new Task1("Task 3"));
        String nameToFind = "Task 2";
        boolean found = Task1.findTaskByName(nameToFind, tasks);
        System.out.println("Task '" + nameToFind + "' found: " + found);
    }
}