package quiz;

public class Quiz5 {

	public static void main(String[] args) {
		int age = 40;
		int age2 = 41;
		
		boolean result1 = age <= 40;
		System.out.println("본인의 나이가 40세 이하인가요?" + result1);
		
		boolean result2 = age == 40;
		System.out.println("본인의 나이가 40세 인가요?" + result2);
		
		boolean result3 = age2 != 40;
		System.out.println("본인의 나이가 40세 아닌가요?" + result3);
	}

}
