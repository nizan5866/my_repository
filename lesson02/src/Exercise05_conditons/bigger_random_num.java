package Exercise05_conditons;

public class bigger_random_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = (int)(Math.random()*100 + 1);
		int num2 = (int)(Math.random()*100 + 1);
		int big;
		if (num1 > num2) {
			big = num1;
		}else {
			big = num2;
		}
		System.out.println("num1 is: " + num1);
		System.out.println("num2 is: " + num2);
		System.out.println("bigger number is: " + big);

	}

}
