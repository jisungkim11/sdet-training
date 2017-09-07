package oop;

public class BankAccount {

		// define some variables
		String accountNumber;
		String routingNumber;
		String name;
		String ssn;
		String accountType;
		double balance = 0;
		//Constructor definitions: Unique methods
			//1) they are used to define/setup/initialize properties of a object
			//2) IMPLICITLY called (automatically) upon INSTANTIATION (creation)
			//3) same name as the class itself (i.e. BankAccount(); ) 
			//4) have NO RETURN TYPE (no void)
		BankAccount(){
			System.out.println("New acct created");
		}
		//Overloading : using same method name (ie. BankAccount(); ) with different arguement (parameters)
		BankAccount(String accountType){
			System.out.println("new account: " + accountType);
		}
		BankAccount(String accountType, double initialDeposit){
			System.out.println("New accout: " + accountType);
			System.out.println("deposit of: " + initialDeposit);
			String Msg = null;
			if (initialDeposit < 1000){
				Msg = "Error: <1000";
			}else{
				Msg = "cool: " + initialDeposit;
			}
			System.out.println(Msg);
			balance = initialDeposit;
		}
		
		//define methods
		void deposit(){
			
		}
		
		void withdraw(){
			
		}
		void checkBalance(){
			System.out.println("balance " + balance);
		}
		void getStatus(){
			
		}
		@Override
		public String toString(){
			return "[" + name + "."+accountNumber+"."+balance + "]";
			
		}

}
