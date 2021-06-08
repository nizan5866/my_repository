package Excercise06_Loops;

public class excersice06_section09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = (int)(Math.random()*50 + 1);
		long num1 = 1;
		long num2 = 1;
		int counter = 1;
		System.out.println("a[1] 1");
		while (num2 <= value) {
			counter++;
			System.out.println("a[" + counter + "] " + num2);
			num2 += num1;
			num1 = num2 - num1;	
		}
		System.out.println("the max value is: " + value);
	}
}
