
public class Faculty extends UEmployee {
	
	
	private String dept;
	private double hourlyPayRate;

	public Faculty(String fn, String ln, String d, double rate) {
		super(fn, ln);
		dept = d;
		hourlyPayRate = rate;
	}
	
	public double pay(double hours)
	{
		double payEarned;
		
		if (hours > 40)
		{
			payEarned = (hourlyPayRate*40)+ (hourlyPayRate* 1.5) *(hours -40);
		}
		else 
		{
			payEarned = hours * hourlyPayRate;
		}
		return payEarned;

	}
	
	public String toString()
	{
	return(super.toString()+ ", Faculty" + "Department: " + dept
			+ "Salary: " + hourlyPayRate);
	}
}

