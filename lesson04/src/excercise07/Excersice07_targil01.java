package excercise07;
import java.util.Arrays;
public class Excersice07_targil01 {

	public static void main(String[] args) {
		int[] ints_list = new int[10];
		int sum = 0;
		for (int i = 0; i < ints_list.length; i++) {
			ints_list[i] = (int)(Math.random()*101);
			sum += ints_list[i];
		}
		float avrg = (float)sum/ints_list.length;
		System.out.println(Arrays.toString(ints_list) + "\n"
				+ "the sum is: " + sum + "\n" +
				"the average is: " + avrg);
	}

}
