package basics;

public class Strings {

	public static void main(String[] args) {
		// string API methods (pre-made stuff)
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Rings";
		
		if (bookTitle.contains(wordChoice)){
			System.out.println(bookTitle + " Contains " + wordChoice);
		}
		
		String browser = "Chrome";
		// (browser == "chrome")
		if (browser.equalsIgnoreCase("chrome")){
			System.out.println(browser + " without case sensitivity!");
		}
		
		String name = "Timeothy";
		String ssn = "123456789";
		System.out.print(name.substring(0,3));
		System.out.println(ssn.substring(5,9));
		System.out.println("length of ssn is: " + ssn.length());
		
		
	}

}
