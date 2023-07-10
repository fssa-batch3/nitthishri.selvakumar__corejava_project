package day3.practice;

 class Employee {
	 
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

	private int id;
     private String name;
 
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}


public class TestEmployee {
 
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "naresh");
        Employee e2 = new Employee(2, "suresh");
        System.out.println("id " + "=" +e1.getId()+","+"  "+"name" + "="+e1.getName() );
        System.out.println("id " + "=" +e2.getId()+","+"  "+"name" + "="+e2.getName() );
    }
}


//output is:

//id=1, name=naresh

//id=2, name=suresh