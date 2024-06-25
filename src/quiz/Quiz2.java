package quiz;

public class Quiz2 {

	public static void main(String[] args) {
		int x = 10; // x = 11
		int y = 20; // y = 19
		int result = (x++) + (--y); //result = 10 + 19 = 29
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(result);
	}

}
