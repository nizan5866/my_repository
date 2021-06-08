package Excercise06_Loops;

public class excersice06_section05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*10000);
		System.out.println("digits number of " + 
				num + " -> " + number_of_digits(num));
		System.out.println("the first left of the number : " + 
				num + " is " + left_digit(num));
		System.out.println("sum of digits of the number: " +
				num + " is " + dig_sum(num));
		System.out.println("the num: " + num + " backwards is " +
				backwards_num(num));
	}
	public static int number_of_digits(int num) {
		int num_copy = num;
		int sum_digits = 0;
		while (num_copy != 0) {
			sum_digits++;
			num_copy = (int)(num_copy/10);
		}
		return sum_digits;
	}
	public static int left_digit(int num) {
		int num_copy = num;
		while (num_copy >= 10) {
			num_copy = (int)(num_copy/10);
		}
		return num_copy;
	}
	public static int dig_sum(int num) {
		int num_copy = num;
		int digits_sum = 0;
		while (1 <= num_copy) {
			digits_sum += num_copy % 10;
			num_copy = (int)(num_copy/10);
		}
		return digits_sum;
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
