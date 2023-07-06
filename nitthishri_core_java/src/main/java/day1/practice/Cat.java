package day1.practice;

public class Cat {
	private int Age;
    private String colour;
    private String speaks;
	
 

	public int getAge() {
		return Age;
	}

	public void setAge(int Age) {
		this.Age = Age;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	   public String getSpeaks() {
			return speaks;
		}

		public void setSpeaks(String speaks) {
			this.speaks = speaks;
		}
	

    public static void main(String[] args) {
        // Create two Dog objects
    	Cat cat1 = new Cat();
    	cat1.setAge(4);
    	cat1.setColour("White");
    	cat1.setSpeaks("Meow!");
        Cat cat2 = new Cat();
        cat2.setAge(3);
        cat2.setColour("Black");
        cat2.setSpeaks("Meow!");

        // Print the attributes of each Dog
        System.out.println("Cat 1:");
        System.out.println("Age: " + cat1.getAge());
        System.out.println("Color: " + cat1.getColour());
        System.out.println("Speaks: " + cat1.getSpeaks());
        
        System.out.println("Cat 2:");
        System.out.println("Age: " + cat2.getAge());
        System.out.println("Color: " + cat2.getColour());
        System.out.println("Speaks: " + cat2.getSpeaks());
    }
    	
    }


//    get the age of the cat
 