
public class PersonalAcct extends Account {
	
	private double minbal = 100;

	public PersonalAcct(double bal, String fName, String lName, String str, String city, String st, String zip) {
		super(bal, fName, lName, str, city, st, zip);
		
		
		if (bal < minbal) 
		{
			
			bal = bal - 2; 
			
		}

	}
	

}
