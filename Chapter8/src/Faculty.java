
public class Faculty extends UEmployee {
	
	//getdept and setdept and a tostring for both faculty and staff 
	private String dept;

	public Faculty(String fn, String ln, double rate, String d) {
		super(fn, ln, rate);
		dept = d;
	}

}
