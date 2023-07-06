package day1.solved;

public class Myclass {
    // Declare a static variable
    public static int staticVariable = 10;
    public int instanceVariable = 10;

    public static void main(String[] args) {
        // Access the static variable using the class name
        Myclass obj1 = new Myclass();
        obj1.staticVariable += 1;
        obj1.instanceVariable += 1;
        System.out.println("Static variable obj1: " + obj1.staticVariable);
        System.out.println("Instance variable obj1: " + obj1.instanceVariable);
        
        
        Myclass obj2 = new Myclass();
        obj2.staticVariable += 1;
        obj2.instanceVariable += 1;
 
        System.out.println("Static variable obj2: " + obj2.staticVariable);
        System.out.println("Instance variable obj2: " + obj2.instanceVariable);
        
    }
    }
