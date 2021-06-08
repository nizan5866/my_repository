package useful_funcs;

import java.util.Scanner;

public class Try_funcs {

	public static void main(String[] args) {
		int[] arry = { 1 };
		Scanner sc = new Scanner(System.in);
		System.out.println("enter: ");
		Object input = sc.nextLine();
		System.out.println(Arrays_f.is_int(input));

		sc.close();

	}

}
