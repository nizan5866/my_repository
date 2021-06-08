package Excercise06_Loops;

public class excecise06_section02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = (int)(Math.random()*11);
		int num2 = (int)(Math.random()*11);
		int definer = 1;
		if(num2 < num1) {
			definer = -1;
		}
		for (int i = num1; i != num2; i += definer ) {
			System.out.println(i);
		}
		System.out.println(num2);
		System.out.println("num1 = " + num1 + "\n" + "num2 = " + num2);
	}
}
