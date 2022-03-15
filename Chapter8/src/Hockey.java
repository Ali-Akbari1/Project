import java.util.Scanner;

public class Hockey extends Puck{
	
	 public Hockey(double w) {
		super(w);
		
	}

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a weight between 4 and 5 ounces"); 
		double userInput = input.nextDouble();
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter a weight between 4 and 5 ounces"); 
		double userInput2 = input2.nextDouble();
		 Puck p1 = new Puck(userInput);
		 Puck p2 = new Puck(userInput2);
		 
		 System.out.println(p1.toString());
		 System.out.println(p2.toString());
		 
		 if (p1.equals(p2)) 
		 {
			 System.out.println("Objects weight are equal."); 
		 }
		 else 
		 {
			 System.out.println("Objects weight are not equal."); 
		 }
		 
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a weight between 4 and 5 ounces for spot object 1"); 
		double userInp = inp.nextDouble();
		Scanner inp2 = new Scanner(System.in);
		System.out.println("Enter a weight between 4 and 5 ounces for spot object 2"); 
		double userInp2 = inp2.nextDouble();
		 
		 Puck spot1 = new Puck(userInp);
		 Puck spot2 = new Puck(userInp2);
		 
		 if (spot1.compareTo(spot2) == 0) 
		 {
			 System.out.println(spot1.toString());
			 System.out.println(spot2.toString());
			 System.out.println("Spot Objects are equal");
		 }
		 else if (spot1.compareTo(spot2) < 0) 
		 {
			 System.out.println(spot1.toString());
			 System.out.println(spot2.toString());
			 System.out.println("Spot1 is smaller than spot2");
		 }
		 
		 else 
		 {
			 System.out.println(spot1.toString());
			 System.out.println(spot2.toString());
			 System.out.println("Spot1 is larger than spot2");
		 }
		 }
	
	

		}
	

