package main;

public class Ex8 {

	public static void main(String[] args) {
		int motherAge = 56;
		int fatherAge = 50;
		String str = (motherAge > fatherAge)? "엄마" : "아빠";
		System.out.println(str);
		
		char ch = (motherAge > fatherAge) ? 'm' : 'f';
		System.out.println(ch);
		
		boolean bool = (motherAge > fatherAge) ? true : false;
		System.out.println(bool);
	}

}
