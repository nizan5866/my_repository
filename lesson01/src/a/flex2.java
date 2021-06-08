package a;

import java.util.Scanner;

public class flex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("num 1");
		int a = sc.nextInt();
		System.out.println("num 2");
		int b = sc.nextInt();
		int new_a = a;
		int new_b = b;
		for (int i = 1; i <= 3; i++) {
			while (new_a != new_b) {
				System.out.println(new_a);
				if (new_a < new_b) {
					new_a++;
				}
				else {
					new_a--;
				}
						
					
				}
			System.out.println("new num:");
			int c = sc.nextInt();
			new_b = c;
			if (c == new_a) {
				System.out.println(c);
			}
		}

	}

}
