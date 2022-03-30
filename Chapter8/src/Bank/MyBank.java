
package Bank;


import java.util.Scanner;

public class MyBank extends Account


{


	public MyBank(double bal, String fName, String lName, String str, String city, String st, String zip) {
		super(bal, fName, lName, str, city, st, zip);
		
	}
	
	
	public static void main(String[] args) 

	{
		
		String action;
		
		do {
		
		Scanner fname = new Scanner(System.in);
		System.out.println("What is Your First Name?"); 
		String fnam = fname.nextLine();
		
		
		Scanner lname = new Scanner(System.in);
		System.out.println("What is Your Last Name?"); 
		String lnam = lname.nextLine();
		
		Scanner city = new Scanner(System.in);
		System.out.println("What City Do You Live in?"); 
		String ct = city.nextLine();
		
		
		Scanner st = new Scanner(System.in);
		System.out.println("What Street Do You Live on?"); 
		String street = st.nextLine();
		
		Scanner zip = new Scanner(System.in);
		System.out.println("What is Your Zip Code?"); 
		String zp = zip.nextLine();
		

		Scanner input = new Scanner(System.in);
		System.out.println("Would You Like To Check Your Personal (P) Or Business Account (B) Or Quit(Q)");
		System.out.println("Enter Choice: ");
		action = input.next();
		
		if (action.equalsIgnoreCase("P") || (action.equalsIgnoreCase("Personal"))) {
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("What is the balance of your Personal Account?"); 
		double balance = input1.nextDouble();
		
		
		
		Account pct = new PersonalAcct(balance, fnam, lnam, null, ct, street, zp);
		
		
		
		if (balance < 100) 
		{
			
			balance = balance - 2; 
			
			System.out.println("Balance is under 100 Dollars, 2 Dollars Must Be Charged to the Account");
			
		}
		
		System.out.println("Account Holder: " + fnam + " " +  lnam + " The Balance of the Personal Account is: " + balance
				+ " The Account Holder lives in: " + ct + " " +  street + " " + zp); 
		
		}
		
		
		
		if (action.equalsIgnoreCase("B") || (action.equalsIgnoreCase("Business"))) {
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("What is the balance of your Business Account?"); 
		double balance1 = input2.nextDouble();
		
		
		
		Account bct = new BusinessAcct(balance1, fnam, lnam, null, ct, street, zp);
		
		
		if (balance1 < 500) 
		{
			
			balance1 = balance1 - 10; 
			
			System.out.println("Balance is under 500 Dollars, 10 Dollars Must Be Charged to the Account");
			
			
		}
		
		System.out.println("Account Holder: " + fnam + " " +  lnam + " The Balance of the Business Account is: " + balance1 
				+ " The Account Holder lives in: " + ct + " " +  street + " " + zp); 
		
		
		
	}
		}
		
		while (action.equalsIgnoreCase("Q") || (action.equalsIgnoreCase("Quit")));
	}
}

	
