package basics;

public class assignment1 {
	public static void main (String [] args){
		System.out.println(number1(5));
		
	}
	
	public static int number1 (int n){
		int x = 1;
		int sum = 0;
		while (x <= n){
			 sum = sum + x;
			x++;
		};
		return sum;
	}
	
	
	
}
