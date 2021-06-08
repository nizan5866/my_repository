package excercise07;

import java.util.Arrays;

public class Excersice07_targil05 {

	public static void main(String[] args) {
		int[][] stud_grades = new int[20][];
		for (int i = 0; i < 20; i++) {
			stud_grades[i] = random_arry(10, 101);
		}
		int temp_c_sum = 0;
		for (int[] i : stud_grades) {
			int temp_s_sum = 0;
			for (int j : i) {
				temp_s_sum += j;
			}
			float stud_avrg = temp_s_sum / 10F;
			temp_c_sum += stud_avrg;
			System.out.println("student" + Arrays.toString(i) + "avrg grade is: " + stud_avrg);

		}
		float class_avrg = temp_c_sum / 20F;
		System.out.println("\n" + "class avrg grade is: " + class_avrg);
	}

	/** random arrys func */
	public static int[] random_arry(int length, int max) {
		int[] arry = new int[length];
		for (int i = 0; i < arry.length; i++) {
			arry[i] = (int) (Math.random() * max);
		}
		return arry;
	}
}
