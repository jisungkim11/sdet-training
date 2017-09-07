package basics;

public class arrays {
	public static void main (String [] args){
		//declare and define an array
		String[] cities = {
				"New York", "San Fran", "Miami", "Dallas" 
		};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		//declare the array
		String[] states = new String[5];
		states[0] = "Cali";
		states[1] = "Calif";
		states[2] = "Cdalfi";
		states[3] = "Calssi";
		System.out.println(states[2]);

	}
}
