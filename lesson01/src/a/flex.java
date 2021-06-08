package a;
import java.util.Scanner;
public class flex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int srulik = (int)(Math.random() * 10)+1;
		int counter = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number from 1-10:");
		int freewill = sc.nextInt();
		boolean flexy = true;
		while (flexy) {
		while (srulik != freewill) {
			counter++;
			srulik = (int)(Math.random() * 10)+1;
		}
		System.out.println("times taken is: " + counter);
		System.out.println("go again? (0 - no / 1 - yes):");
		int shrudi = sc.nextInt();
		System.out.println(shrudi == 0);
		if (shrudi == 0) {
			flexy = false;
		}
		}
		sc.close();
		
	}	
	}
