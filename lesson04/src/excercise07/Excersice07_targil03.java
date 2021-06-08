package excercise07;

import java.util.Arrays;

public class Excersice07_targil03 {

	public static void main(String[] args) {
		int[] int_arry = random_arry(50, 101);
		int[] new_arry = new int[50];
		new_arry[0] = int_arry[0];
		int counter = 1;
		slick: for (int i = 1; i<50 ; i++) {
			for (int j = 0; j < counter; j++) {
				if (int_arry[i] == new_arry[j]) {
					continue slick;
				}
			}
			new_arry[counter] = int_arry[i];
			counter++;
		}
		int[] new_new_arry = new int[counter];
		for (int i = 0; i < counter; i++) {
			new_new_arry[i] = new_arry[i];
		}
		int[] new_new_new_arry = Arrays.copyOf(new_arry, counter); 
		System.out.println(Arrays.toString(new_new_arry));  //one of this will work
		System.out.println(Arrays.toString(new_new_new_arry)); //but this one is better
	}

	public static int[] random_arry(int length, int max) {
		int[] arry = new int[length];
		for (int i = 0; i < arry.length; i++) {
			arry[i] = (int) (Math.random() * max);
		}
		return arry;
	}
}
