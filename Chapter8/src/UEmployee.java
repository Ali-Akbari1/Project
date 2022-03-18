
public abstract class UEmployee {

	
	private String firstName;
	private String lastName;
	private double salary;
	


public UEmployee(String fn, String ln)//constructor method 
{
	firstName = fn;
	lastName = ln;
}


public String toString()//prints UEmployee Object 
{
	return("University Employee Name: " + firstName + " " + lastName);
}

abstract double pay(double period);

public static void main(String[] args) 

{
	
}


}

