package day10.misc;

class Divider {
	public static int divisor(int a, int b) throws IllegalArgumentException {
		if (b == 0) {
			throw new IllegalArgumentException("divible operation can't happen");

		}
		int c = a / b;
		return c;
	}

}

public class DivsionOperation {
	public static void main(String[] args) {
		Divider.divisor(5, 0);

	}
}
