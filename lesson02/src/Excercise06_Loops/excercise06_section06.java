package Excercise06_Loops;

public class excercise06_section06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*1000001);
		if (is_poly(num)) {
			System.out.println(num + " is palindrome");	
		}else {
			System.out.println(num + " is not palindrome");
		}
		int num2 = (int)(Math.random()*1000001);
		int counter = 0;
		while (false == is_poly(num2)) {
			counter++;
			num2 = (int)(Math.random()*1000001);
		}
		System.out.println(num2 + " is Pal. took " + counter + " times" );
	}
	public static boolean is_poly(int num) {
		return num == backwards_num(num);
	}
	public static int backwards_num(int num) {
		int num_copy = num;
		int reverse_num = 0;
		while (1 <= num_copy) {
			reverse_num = reverse_num*10 + num_copy % 10;
			num_copy = (int)(num_copy/10);
		}
		return reverse_num;
	}

}
