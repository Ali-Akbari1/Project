
public class Manager extends Employee 
{
	private double yearlySalary;
	
	public Manager(String fn, String ln, double salary)
	{
		super(fn,ln);
		
	}
	public double pay(double weeks)
	{
		double payEarned;
		payEarned = yearlySalary/52*weeks;
		return payEarned;
	}
	
	public String toString()
	{
		return(super.toString() + ", manager"
				+ "Salary: " + yearlySalary);
	}
}
