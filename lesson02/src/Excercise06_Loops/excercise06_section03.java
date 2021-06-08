package Excercise06_Loops;

public class excercise06_section03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*31);
		for (int i = 0; i <= num; i += 2) {
			System.out.println(i);
		}
		System.out.println("num generated was: " + num);
		
	}

}
