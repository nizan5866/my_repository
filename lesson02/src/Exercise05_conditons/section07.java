package Exercise05_conditons;

public class section07 {
	public static void main(String[] args) {
		int year = (int)(Math.random()*(-4001)+Math.random()*2022);
		System.out.println("the year picked is: " + year);
		if((year % 4 == 0 && year % 100 != 0) || 
				(year % 100 == 0 && year % 400 == 0)) {
			System.out.println("it's a leap year");	
		}else{
			System.out.println("it's not a leap year");
		}
	}

}
