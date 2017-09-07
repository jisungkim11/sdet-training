package basics;

public class FibonaciApp {

	public static void main(String[] args) {
		// sum of the 2 previous numbers
		//fib(0) = 0
		//fib(1) = 1
		//fib(2) = fib(1) + fib(0) 
		//fib(3) = fib(2) + fib(1) and so on
		System.out.println(fib(3));
		

	}
	
	public static int fib(int n){
		if (n==0){
			return 0;
		}
		else if(n==1){
			return 1;
		}
		return (fib(n-1) + fib(n-2));
	}//wtf? i dont get this...

}
