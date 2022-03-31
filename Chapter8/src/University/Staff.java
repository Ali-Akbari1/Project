package University;

public class Staff extends UEmployee {
	
	private String jobtitle;

	public Staff(String fn, String ln, String j, double s) {
		super(fn, ln,s);
		jobtitle = j;

	}
	
	String getJobTitle() 
	{
		return jobtitle;
	}
	


	public String toString()
	{
		return(super.toString() + " Staff Member Job Title: " + getJobTitle());
	}

}
