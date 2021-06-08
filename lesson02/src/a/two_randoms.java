package a;

public abstract class two_randoms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = (int)(Math.random()*101) + 1;
		int num2 = (int)(Math.random()*101) + 1;
		int summ = num1 + num2;
		float avrg = summ / 2F;
		float reminder = (num1+num2)/10;
		float triangle_area = (num1*num2)/2;
		System.out.println("num1: " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("nums sum: " + summ);
		System.out.println("nums average: " + avrg);
		System.out.println("((num1 + num2) / 10): " + reminder);
		System.out.println("triangle"
				+ " area where num1 = base, num2 = height:" + triangle_area);
		

	}

}
