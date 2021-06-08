package Excercise06_Loops;

public class excercise06_section04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = (int)(Math.random()*401);
		int den = (int)(Math.random()*22);
		for (int i = 0; i <= max; i += den) {
			System.out.println(i);
		}
		System.out.println("max num picked: " + max);
		System.out.println("den picked: " + den);
	}
}
