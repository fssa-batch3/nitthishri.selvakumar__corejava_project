package day2.practice;
public class Logger {
	public static void debug (String msg) {
		System.out.println("DEBUG: " + msg);
	}
	public static void log (String msg) {
		// TODO complete this code using the above template
		System.out.println("LOG: " + msg);
	}
	
	public static void error (String msg) {
		// TODO complete this code using the above template
		System.out.println("ERROR: " + msg);
	}
	
	public static void debug (int num) {
		// TODO Complete this code
		System.out.println("DEBUG: " + num);

	}
	
	public static void log (int num) {
		// TODO complete this code using the above template
		System.out.println("LOG: " + num);
	}
	
	public static void error (int num) {
		// TODO complete this code using the above template
		System.out.println("ERROR: " + num);
	}
	
	// Similarly write overloaded methods for error and info.
	  public static void main(String[] args) {
		  Logger input = new Logger();
		  input.error (32);
		  input.error ("nitthi");
		  input.debug(55);
		  input.debug("shree");
		  input.log(24);
		  input.log("niki");
		  
	  }
	  
}