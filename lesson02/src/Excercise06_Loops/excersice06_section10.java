package Excercise06_Loops;

import java.util.Scanner;

public class excersice06_section10 {

	public static void main(String[] args) {
		/*this program runs the "7 boom" game*/
		Scanner sc = new Scanner(System.in);
		System.out.println("pick max number: ");
		int max = sc.nextInt(); //user chooses a max number to stop to program
		System.out.println(0); // the in zero will always be printed on positives

		for (int i = 1; i <= max; i++) {
			//find the numbers that being divided by 7 or
			//if the "7" digit appears in that number "i"  
			if (i % 7 == 0 || dig_7(i)) {
				boom();
			} else {
				//if the above isn't true, then print the number
				System.out.println(i);
			}
		}
		sc.close();
	}

	public static void boom() {
		System.out.println("~~$@%BOOM!!!");
	}
	/*this function returns boolean according to if the
	 * digit "7" appears in an integer number */
	public static boolean dig_7(int num) {
		int num_copy = num;
		while (1 <= num_copy) {
			if (num_copy % 10 == 7) {
				return true;
			} else {
				num_copy = (int) (num_copy / 10);
			}
		}
		return false;
	}
}
