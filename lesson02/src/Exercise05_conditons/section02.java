package Exercise05_conditons;

public class section02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*101);
		if ( 50 < num) {
			System.out.println("Big!");
		}
		else if (num < 50) {
			System.out.println("Small!");
		}
		else if (num == 50) {
			System.out.println("Bingo!");
		}

	}

}
