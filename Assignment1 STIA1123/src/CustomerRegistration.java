import java.util.Scanner;

public class CustomerRegistration {				//CustomerRegistration is a subclass for TourismBusinessCompany
	Scanner s = new Scanner(System.in);             //to answer question 1.2 Pre-Define Class for using Scanner
	
	private String CustName, IdentityNumber, Email;

	
	CustomerRegistration(){										 //to answer question 1.4 Constructor for using constructor with no-arguments		
		
		System.out.print("Please Enter Your Name : ");
		this.CustName = s.nextLine();
		System.out.print("Please Enter Your Identity Number :");
		this.IdentityNumber = s.nextLine();
		System.out.print("Please Enter Your Email :");
		this.Email = s.nextLine();
		
		
	}
	
	//to return all the private variable
	public String getCustName() {
		return this.CustName;
	}
	
	public String getIdentityNumber() {
		return this.IdentityNumber;
	}
	
	public String getEmail() {
		return this.Email;
	}
	
	

}