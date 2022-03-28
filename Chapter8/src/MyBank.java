import java.util.Scanner;

public class MyBank extends Account


{


	public MyBank(double bal, String fName, String lName, String str, String city, String st, String zip) {
		super(bal, fName, lName, str, city, st, zip);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 

	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is the balance of your Personal Account?"); 
		double balance = input.nextDouble();
		
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
		System.out.println("What Street Do You Live in"); 
		String street = st.nextLine();
		
		Scanner zip = new Scanner(System.in);
		System.out.println("What is Your Zip Code"); 
		String zp = zip.nextLine();
		
		
		
		Account pct = new PersonalAcct(balance, fnam, lnam, null, ct, street, zp);
		
		System.out.println("Account Holder: " + fnam + " " +  lnam + " The Balance of the Personal Account is: " + balance
				+ " The Account Holder lives in: " + ct + " " +  street + " " + zp); 
		
		
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("What is the balance of your Business Account?"); 
		double balance1 = input.nextDouble();
		
		Scanner fname1 = new Scanner(System.in);
		System.out.println("What is Your First Name?"); 
		String fnam1 = fname1.nextLine();
		
		
		Scanner lname1 = new Scanner(System.in);
		System.out.println("What is Your Last Name?"); 
		String lnam1 = lname1.nextLine();
		
		Scanner city1 = new Scanner(System.in);
		System.out.println("What City Do You Live in?"); 
		String ct1 = city1.nextLine();
		
		
		Scanner st1 = new Scanner(System.in);
		System.out.println("What Street Do You Live in"); 
		String street1 = st1.nextLine();
		
		Scanner zip1 = new Scanner(System.in);
		System.out.println("What is Your Zip Code"); 
		String zp1 = zip1.nextLine();
		
		
		
		Account bct = new BusinessAcct(balance1, fnam1, lnam1, null, ct1, street1, zp1);
		
		System.out.println("Account Holder: " + fnam1 + " " +  lnam1 + " The Balance of the Business Account is: " + balance1
				+ " The Account Holder lives in: " + ct1 + " " +  street1 + " " + zp1); 
		
		
		
	}
	
	
}
