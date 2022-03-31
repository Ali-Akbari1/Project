package CarDealership;

import java.util.Scanner;

public class Dealership 
{
	
	
	//https://www.fueleconomy.gov/feg/noframes/43299.shtml
	
	//Car c = new Car (28,36,5,60);
	
	
	//https://www.fueleconomy.gov/feg/byclass/Standard_Pickup_Trucks_4WD2021.shtml
	//https://www.carindigo.com/chevrolet/silverado-1500/cargo-space
	
	//Truck t = new Truck(14,18,5,89);

	//https://www.jdpower.com/cars/shopping-guides/common-minivan-dimensions#:~:text=The%20cargo%20area%20is%20typically,feet%20of%20average%20cargo%20space.
	//https://www.fueleconomy.gov/feg/byclass/Minivan_4WD2021.shtml
	
	//Minivan m = new Minivan(30,35,8,140);
	
	
	public static void main(String[] args)
	{
		String action;
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("Would You Like To Check Car (C) Or Truck (T) Or Minivan (M) Or Quit(Q)");
			System.out.println("Enter Choice: ");
			action = input.next();
			
			
			if (action.equalsIgnoreCase("C") || (action.equalsIgnoreCase("Car"))) 
			{
				Car c = new Car (28,36,5,60);
				System.out.println(c.toString());
				
			}
			
			
			if (action.equalsIgnoreCase("T") || (action.equalsIgnoreCase("Truck"))) 
			{
				Truck t = new Truck(14,18,5,89);
				System.out.println(t.toString());
			}
			
			
			if (action.equalsIgnoreCase("M") || (action.equalsIgnoreCase("Minivan"))) 
			{
				Minivan m = new Minivan(30,35,8,140);
				System.out.println(m.toString());
			
		}
		}
		while (action.equalsIgnoreCase("Q") || (action.equalsIgnoreCase("Quit")));
		
	}
}
