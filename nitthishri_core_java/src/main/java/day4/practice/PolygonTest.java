package day4.practice;

public class PolygonTest {
	
		public static void main(String[] args) {
			Polygon1 rec;
			

			try {
				
			     rec = new Rectangle (10, 5);
				System.out.println(rec.circumference());
				RightAngelTringle ratt = new RightAngelTringle(20.0, 10.0);
				System.out.println(ratt.circumference());
				
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}

