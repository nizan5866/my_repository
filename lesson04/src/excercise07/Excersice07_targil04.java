package excercise07;

import java.util.Arrays;

public class Excersice07_targil04 {

	public static void main(String[] args) {
		int[] arry = random_arry(10,11);
		int[] rev_arry = new int[10];
		for (int i = arry.length -1; 0 <= i; i--) {
			rev_arry[arry.length -1 -i] = arry[i];

	}
		System.out.println(Arrays.toString(arry));
		System.out.println(Arrays.toString(rev_arry));
	}

	public static int[] random_arry(int length, int max) {
		int[] arry = new int[length];
		for (int i = 0; i < arry.length; i++) {
			arry[i] = (int) (Math.random() * max);
		}
		return arry;
	}

}
