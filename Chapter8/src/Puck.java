import java.awt.EventQueue;

import javax.swing.JFrame;

public class Puck extends Disk{
	
	private double weight;
	private boolean standard,youth;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public Puck(double w) {
	
		weight = w;
		
		if (weight >= 5 && weight <= 5.5) 
		{
			standard = true;
			}
		if (weight >= 4 && weight<= 4.5) 
		{ 
			standard = false;
			}
		}
	
	public double getWeight() 
	{
		return (weight);
		}	
	
	public String getDivision()
	{
		String div;
		if (standard)
		{
			div = "Puck is Standard";
		}
		else
		{
			div = "Puck is Youth";
		}
		return div;
		
	}

		public String toString()
		{
			String puck;
			
			puck = "The Puck has a weight of " + getWeight() + " ounces, and the division of the "+ getDivision();
			return(puck);
		}
//check circle class
		 public boolean equals(Object obj) {
			 Puck testObj = (Puck)obj;
			 
			 if(testObj.getDivision() == getDivision()) {
			 return(true);
			 } else {
			 return(false);
			 }
			 }
	}