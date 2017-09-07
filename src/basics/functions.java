package basics;

public class functions {

	public static void main (String [] args) {
		System.out.println("Program is starting");
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers (numA, numB);
		System.out.println("the product was passed and resturned; value = "+ multipleNumbers(numB, numA) );
	}
	
	static void printName() {
		System.out.println("hello");
	}
	
	static void addNumbers(int numberA, int numberB) {
		int sum = numberA + numberB;
		System.out.println(sum);
	}

	static int multipleNumbers(int numberB, int numberA){
		int product = numberB * numberA;
		addNumbers(product, product+10);
		return product;
	}

}
