package Exercise05_conditons;

public class section03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*101);
		if (50 < num) {
			System.out.println("Big!");
		}else {
			System.out.println("Small!");
		}
		if (num % 2 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}

	}

}
