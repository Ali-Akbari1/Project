package School;

import java.util.Scanner;

public class university 
{

	public static void main(String[] args) 
	{
		
		String action;
		do { 
			
		Scanner first = new Scanner(System.in);
		System.out.println("What is Your First Name"); 
		String fn = first.nextLine();
		
		Scanner last = new Scanner(System.in);
		System.out.println("What is Your Last Name"); 
		String ln = last.nextLine();
		
		Scanner sal = new Scanner(System.in);
		System.out.println("What is your Salary"); 
		double s = sal.nextDouble();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Are You a Faculty Member (F) \\ or a Staff Member (S) \\ Or Do you Want to Quit (Q)");
		System.out.println("Enter Choice: ");
		action = input.next();
		
		
		if (action.equalsIgnoreCase("F") || (action.equalsIgnoreCase("Faculty"))) {
		
		
		Scanner dept = new Scanner(System.in);
		System.out.println("What Department Do You Work in"); 
		String d = dept.nextLine();
		
		
		Faculty emp1 = new Faculty(fn,ln,d,s);
		
		System.out.println(emp1.toString());
		
		}
		
		
		if (action.equalsIgnoreCase("S") || (action.equalsIgnoreCase("Staff")))  {
		
		Scanner jobtitle = new Scanner(System.in);
		System.out.println("What is Your Job Title"); 
		String jt = jobtitle.nextLine();
		
		
		Staff emp2 = new Staff(fn,ln,jt,s);
		
		System.out.println(emp2.toString());
		
		}
		}
		
		
		
	
		while (action.equalsIgnoreCase("Q") || (action.equalsIgnoreCase("Quit")));
	
	

}
}
