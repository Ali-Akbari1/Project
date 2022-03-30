

package School;

public class Faculty extends UEmployee {
	
	
	private String dept;

	public Faculty(String fn, String ln, String d, double s) {
		super(fn, ln,s);
		dept = d;
	}
	
	
	String getDept() 
	{
		return dept;
	}
	
	public String toString()
	{
	return(super.toString()+ " Faculty Department: " + getDept());
	}
}

