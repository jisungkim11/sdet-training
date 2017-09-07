package basics;

public class SalaryCalculator {
	public static void main (String [] args){
		// lets create a variable to define our career
		// declare a variable
		String career;
		System.out.println("Program is starting");
		career = "software dev";
		System.out.println("my career is: " + career);
		
		//declare & define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as a " + career + " at the rate of $ " + rate + " is $" + salary);
		//compute our annual salary
	}
}
