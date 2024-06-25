package main;

public class Ex4 {

	public static void main(String[] args) {
		int mathScore = 93;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;
		System.out.println(totalScore);
		
		int avgScore1 = totalScore / 2 ;
		System.out.println(avgScore1);
		
		double avgScore2 = totalScore / 2 ;
		System.out.println(avgScore2);
		
		double avgScore3 = totalScore / 2.0 ;
		System.out.println(avgScore3);
	}

}
