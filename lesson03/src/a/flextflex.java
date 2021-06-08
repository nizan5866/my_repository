package a;

import java.util.Arrays;
import java.util.Scanner;

public class flextflex {
	public static void main(String[] args) {
		int[] arr = new int[7];
		int[][] art = { { 5, 2 }, { 1, 3 }, { 1, 2, 3 } };
		Object[][] gootch = { { "Nitzan", 27 }, { "Tzlil", 23 } };
		for (Object i: gootch) {
			System.out.println((gootch[0] == i));
		}
//		for (int i = 0; i < gootch.length; i++) {
//			System.out.println(Arrays.toString(gootch[i]));
//		}
//		for (int[] i : art) {
//			for (int j : i) {
//				System.out.println(j);
//	}
//		}
//		
//		for (Object[] i : gootch) {
//			for (Object j : i) {
//				System.out.println(j);
//			}
//		}
//		int[] random25 = new int[25];
//		int sum = 0;
//		for (int i = 0; i < 25; i++) {
//			int random_num = (int) (Math.random() * 101);
//			random25[i] = random_num;
//			sum += random_num;
//		}
//		System.out.println(Arrays.toString(random25) + "\n" + "sum is: " + sum);

//		Scanner sc = new Scanner(System.in);
//		String[] name_list = new String[5];
//		for (int i = 0; i < 5; i++) {
//			System.out.println("name number [" + (i+1) + "]");
//			name_list[i] = sc.nextLine();
//		}
//		System.out.println(Arrays.toString(name_list));
//		sc.close();

	}
}
