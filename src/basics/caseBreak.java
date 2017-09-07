package basics;

public class caseBreak {
	public static void main (String [] args){
		String dayOfWeek = "Tuesday";
		
		switch (dayOfWeek) {
		case "Monday" : 
			System.out.println("Today is monday");
			break; //without a break, once a case matches, it will execute until break or end of list
		case "Tuesday" : 
			System.out.println("Today is tudsay");
			break;
		case "Monday2" : 
			System.out.println("Today is monday");
			break;
		case "Monday3" : 
			System.out.println("Today is monday");
			break;
			//default is a like else if
		default :
			System.out.println("default");
			break;
		}
	}
}
