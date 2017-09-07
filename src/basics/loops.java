package basics;

public class loops {
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
			int i = 0;
			//do loop does then test
			do{
			System.out.println(states[i]+"1");
			i = i + 1;
			}while (i<4);
			
			//while tests first
			int n = 0;
			while (n < 4){
				System.out.println(states[n] + "2");
				n++;
			}
			
			System.out.println("forloop:");
			//for loop: best for going thru array
			for (int x =0; x < 4; x++){
				System.out.println(states[x]);
			}
		}
	

}
