package School;

import java.text.NumberFormat;
import java.util.Scanner;

public class University 
{

	public static void main(String[] args) 
	{
		
		String action;
		do { 
		Scanner input = new Scanner(System.in);
		System.out.println("Are You a Faculty Member \\ or a Staff Member \\ Or Do you Want to Quit");
		System.out.println("Enter Choice: ");
		action = input.next();
		if (action.equalsIgnoreCase("F")) {
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("What is Your First Name"); 
		String fn = input2.nextLine();
		
		Scanner last = new Scanner(System.in);
		System.out.println("What is Your Last Name"); 
		String ln = last.nextLine();
		
		Scanner dept = new Scanner(System.in);
		System.out.println("What Department Do You Work in"); 
		String d = dept.nextLine();
		
		Scanner rate = new Scanner(System.in);
		System.out.println("What is your Hourly Pay Rate"); 
		double r = rate.nextDouble();
		
		
		Faculty emp1 = new Faculty(fn,ln,d,r);
		
		System.out.println("Faculty Persons Name: " + fn + " " + ln + " Department: " + d 
		+ " Salary: " + r);
		
		}
		
		
		if (action.equalsIgnoreCase("S")) {
		Scanner input1 = new Scanner(System.in);
		System.out.println("What is Your First Name"); 
		String fn1 = input1.nextLine();
		
		Scanner last1 = new Scanner(System.in);
		System.out.println("What is Your Last Name"); 
		String ln1 = last1.nextLine();
		
		Scanner jobtitle = new Scanner(System.in);
		System.out.println("What is Your Job Title"); 
		String jt = jobtitle.nextLine();
		
		Scanner rate1 = new Scanner(System.in);
		System.out.println("What is your Hourly Pay Rate"); 
		double r1 = rate1.nextDouble();
		
		
		
		
		
		Staff emp2 = new Staff(fn1,ln1,jt,r1);
		
		System.out.println("Staff Persons Name: " + fn1 + " " + ln1 + " Job Title: " + jt + " "
		+ "Salary: " + r1);
		
		}
		}
		
		
		
	
		while (action.equalsIgnoreCase("Q"));
	
	

}
}
