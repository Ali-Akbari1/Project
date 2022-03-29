package School;

public class Staff extends UEmployee {
	
	private double yearlySalary;
	private String jobtitle;

	public Staff(String fn, String ln, String j, double salary) {
		super(fn, ln);
		jobtitle = j;

	}
	
	public double pay(double weeks)
	{
		double payEarned;
		payEarned = yearlySalary/52*weeks;
		return payEarned;
	}

	public String toString()
	{
		return(super.toString() + ", Staff" + "Job Title: " + jobtitle
				+ "Salary: " + yearlySalary);
	}

}
