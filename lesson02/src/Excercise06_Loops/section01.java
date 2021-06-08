package Excercise06_Loops;

public class section01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*30 + 1);
		System.out.println("num picked is: " + num);
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}	
	}
}
