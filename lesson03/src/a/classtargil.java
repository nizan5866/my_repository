package a;

import java.util.Arrays;
import java.util.Scanner;

public class classtargil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// program that presents the available and occupied
		// sits places. 5 roles with 12 seats in them
		String[][] movie_hall = new String[5][12];
		for (int i = 0; i < 5; i++) {
			seats: for (int j = 0; j < 12; j++) {
				int random = (int) (Math.random() * 2 + 1);
				switch (random) {
				case 1:
					movie_hall[i][j] = "X";
					break;
				case 2:
					movie_hall[i][j] = "0";
					break;
				}
			}

		}

		Scanner sc = new Scanner(System.in);
		while (true) {
			for (int i = 0; i < 5; i++) {
				System.out.println((i + 1) + " -> " + Arrays.toString(movie_hall[i]));
			}
			System.out.println("please choose line number 1-5 :");
			int line = sc.nextInt();
			System.out.println(line + " ->" + Arrays.toString(movie_hall[line - 1]));
			System.out.println("please choose a seat 1-12");
			int seat = sc.nextInt();
			if (movie_hall[line - 1][seat - 1] == "0") {
				movie_hall[line - 1][seat - 1] = "you sit here";
				break;
			} else {
				System.out.println("the seat you chose is taken! choose another" + "\n");
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + " -> " + Arrays.toString(movie_hall[i]));
		}
		sc.close();
	}
}
