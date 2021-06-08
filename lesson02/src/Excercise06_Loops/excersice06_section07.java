package Excercise06_Loops;

public class excersice06_section07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num = (long)(Math.random()*101);
		long factorial = 1L;
		for (int i = 1; i<= num; i++) {
			factorial *= i;
		}
		System.out.println("the factorial of " + num + " is " + factorial);
	}
}
