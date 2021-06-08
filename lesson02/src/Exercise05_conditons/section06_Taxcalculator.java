package Exercise05_conditons;

public class section06_Taxcalculator {
	public static void main(String[] args) {
		int salary = (int)(Math.random()*200000);
		int tax_payment = 0;
		String tax_percent = "0%";
		if(salary < 23000) {
			tax_percent = "10%";
			tax_payment = (int)(salary*0.1);
		}
		else if(salary < 50000) {
			tax_percent = "20%";
			tax_payment = (int)(salary*0.2);
		}
		else if(salary < 100000) {
			tax_percent = "30%";
			tax_payment = (int)(salary*0.3);
		}else {
			tax_percent = "40%";
			tax_payment = (int)(salary*0.4);
		}
		int new_salary = salary - tax_payment;
		System.out.println("employee salary: " + salary + "$");
		System.out.println("tax percent: " + tax_percent);
		System.out.println("tax payment: " + tax_payment + "$");
		System.out.println("final income: " + new_salary + "$");
	}

}
