package day6.solved;
import java.util.Arrays;
import java.util.List;

public class ArrList {
	public static void main(String[] args) {
		String[] deptNames = new String[3];
		deptNames[0] = "CSE";
		deptNames[1] = "EEE";
		deptNames[2] = "MECH";
	List<String> list =Arrays.asList(deptNames);
		System.out.println(list);
	}

}
