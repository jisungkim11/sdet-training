package datastructures;

public class Arrays {

	public static void main(String[] args) {
		String [] alphabet = {"a", "b", "c", "d","e","f","g"};
		
		System.out.println("The old fashioned way");
		for (int i=0; i< 5; i++){
			System.out.print(alphabet[i]+" ");
		}
		
		System.out.println("\nUsing the length variable");
		int size = alphabet.length;
		for (int n=0; n<size; n++){
			System.out.print(alphabet[n] + " ");
		}
		
		System.out.println("\nUsing the For-Each method");
		for(String letter : alphabet){
			System.out.print(letter + " ");
		}

		//multi dem arrays
		String [][] users = {
				{"john", "williams", "jw@email.com", "7484629385"},
				{"sammy", "choo", "sc@email.com", "7484472685"},
				{"james", "due", "jd@email.com", "7484629332"},
			};
		//size of multi array
		int numOfUsers  = users.length;
		int numOfFields = users[0].length;
		System.out.println("\nnum of users" + numOfUsers);
		System.out.println("num of fields" + numOfFields);
		
		
		//traverse the double array
		for (int i=0; i<numOfUsers;i++){
			//can do a nested for for j++ but we know the column attributes so...
			String firstName = users[i][0];
			String lastName = users[i][1];
			String email = users[i][2];
			String phone = users[i][3];
			System.out.println(firstName + " " + lastName + " " + email + " " + phone);
		}
		
		System.out.println("using For Each for double array");
		for (String [] user : users){
			System.out.print("[ ");
			for (String field : user){
				System.out.print(field + " ");
			}
			System.out.println(" ]");
		}
		
	}

}
