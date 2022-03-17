
public class UEmployee {
// move salary to faculty and staff
	private String firstName;
	private String lastName;
	private double salary;
	


public UEmployee(String fn, String ln, double rate)//constructor method 
{
	firstName = fn;
	lastName = ln;
	salary = rate;
}


public double pay(double hours)
{
	double payEarned;
	hours = salary;
	
	if (hours > 40)
	{
		payEarned = (salary*40)+ (salary* 1.5) *(hours -40);
	}
	else 
	{
		payEarned = hours * salary;
	}
	return payEarned;

}

public String toString()//prints UEmployee Object 
{
	return("University Employee Name: " + firstName + " " + lastName + "Salary:" + salary);
}

public static void main(String[] args) 
{
}
}
