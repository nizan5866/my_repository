package Exercise05_conditons;

public class SalaryRaiser {

	public static void main(String[] args) {
		int salary = 5000 + (int)(Math.random()*1001);
		int updated_salary = (int)(salary * 1.1);
		if (6000 < updated_salary) {
			updated_salary = salary;			
		}
		System.out.println("salary = " + salary);
		System.out.println("updated salary = " + updated_salary);
	}
}
