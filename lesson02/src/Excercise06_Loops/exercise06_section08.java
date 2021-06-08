package Excercise06_Loops;

public class exercise06_section08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = (int)(Math.random()*50 + 1);
		long num1 = 1;
		long num2 = 1;
		for(int i = 3; i<= index; i++) {
			num2 += num1;
			num1 = num2 - num1;
			}
		System.out.println("the Ficbonacci in the " + index +
				" place is " + num2);
		}
	}

