package excercise07;

import java.util.Arrays;

public class Excersice07_targil02 {

	public static void main(String[] args) {
		int[] arry1 = random_arry(50, 101);
		for (int i = 0; i < 100; i++) {
			if (i % 10 == 0) {
				System.out.println();
			}
			System.out.print("	" + arry1[i]);
			
		}
		System.out.println("\n");
		int[] max_index = maxnumplusindex(arry1);
		;
		System.out.println("	(max number, number index) = " + 
		Arrays.toString(max_index));

	}

	public static int[] random_arry(int length, int max) {
		int[] arry = new int[max];
		for (int i = 0; i < arry.length; i++) {
			arry[i] = (int) (Math.random() * max);
		}
		return arry;
	}

	public static int[] maxnumplusindex(int[] arry) {
		int max_num = arry[0];
		int max_index = 0;
		for (int i = 1; i < arry.length; i++) {
			if (max_num < arry[i]) {
				max_num = arry[i];
				max_index = i;
			}
			
		}
		int [] yes = {max_num, max_index};
		return yes;
		
	}

}
