import java.awt.EventQueue;

import javax.swing.JFrame;

public class Puck extends Disk implements Comparable{
	
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
			youth = false;
			}
		if (weight >= 4 && weight<= 4.5) 
		{ 
			standard = false;
			youth = true;
			}
		if (weight > 5.5&&weight< 4) {
			standard = false;
			youth = false;
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
		else if (youth)
		{
			div = "Puck is Youth";
		}
		else 
		{
			div = "Puck size is neither youth nor standard";
		}
		return div;
		
	}

		public String toString()
		{
			String puck;
			
			puck = "The Puck has a weight of " + getWeight() + " ounces, and the division of the "+ getDivision();
			return(puck);
		}
		
		 public boolean equals(Object p) 
		 {
			 Puck testObj = (Puck)p;	 
			 if(testObj.getWeight() == weight) 
			 {
			 return(true);
			 } else 
			 {
			 return(false);
			 }
			 }
		 
		 public int compareTo(Object d) 
		 {
			 Puck testPuck = (Puck)d;
			 
			if (weight < testPuck.getWeight()) 
			 {
				 return(-1); 
			 }
			 else if (weight == testPuck.getWeight()) 
			 {
				 return(0);
			 }
			 else 
			 {
				 return(1);
			 }
		 }

		 
	}