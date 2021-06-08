package Exercise05_conditons;

public class section05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = (int)(Math.random()*11);
		int num2 = (int)(Math.random()*11);
		int num3 = (int)(Math.random()*11);
		int max = num1;
		if (num1 + num2 <= 2*num3) {
			max = num3;
		}
		else if(num1 + num3 <= 2*num2) {
			max = num2;
		}
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
		System.out.println("biggest number is: " + max);
	}

}
