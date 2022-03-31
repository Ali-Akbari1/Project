package University;

public abstract class UEmployee {

	
	private String firstName;
	private String lastName;
	private double salary;
	


public UEmployee(String fn, String ln, double s)//constructor method 
{
	firstName = fn;
	lastName = ln;
	salary = s;
}


public String toString()//prints UEmployee Object 
{
	return("University Employee Name: " + firstName + " " + lastName + " Salary: " + salary);
}



}

