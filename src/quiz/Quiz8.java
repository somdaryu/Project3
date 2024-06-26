package quiz;

public class Quiz8 {

	public static void main(String[] args) {
		int x = 80;
		boolean result1 = 50 < x && x < 100;
		System.out.println("x가 50<x<100에 포함됩니까?" +result1);
		
		int y = 5;
		boolean result2 = y < 10 || 30 < y;
		System.out.println("y가 10보다 작거나 30보다 큽니까?" +result2);
	}

}
