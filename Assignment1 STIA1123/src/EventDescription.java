import java.util.Scanner;
public class EventDescription {    //EventDescription is a subclass for TourismBusinessCompany
	
	Scanner sc = new Scanner(System.in);			  //to answer question 1.2 Pre-Define Class for using Scanner
	

	private double price, packagePrice, discount;
	private int typeOfPackage, deposit;
	private double totalPrice;
	
	EventDescription(){      //to answer question 1.4 Constructor for using constructor with no-arguments
	
		printtypeOfPackacge();
	}

	public void printtypeOfPackacge() {    //to answer question 1.3 User Define Class for using this method
		System.out.println("\t---Package---");
		System.out.println("1: Family Package\n"
							+ "-3days 2nights\n"
							+ "-5 members per family\n"
							+ "-1 homestay with breakfast\n"
							+ "-BBQ night\n"
							+ "-Night boat\n"
							+ "-Snorkeling\n"
							+ "-3 Jet Ski\n"
							+ "-Cable car\n"
							+ "-Sunset with dinner\n"
							+ "-Total Price: RM750-\n");
		
		System.out.println("2: Single Package\n"
							+ "-3days 2nights\n"
							+ "-2 persons per package\n"
							+ "-1 single room\n"
							+ "-Snorkeling\n"
							+ "-Jet Ski\n"
							+ "-Night boat fishing\n"
							+ "-Island hopping tour\n"
							+ "-Sunset cycling\n"
							+ "-Total Price: RM400-\n");
		
	}
	 public double calPrice() {    //to answer question 1.3 User Define Class for using this method
		 System.out.print("Please enter Package: ");
		 this.typeOfPackage = sc.nextInt();
		 if(typeOfPackage == 1) {
			 packagePrice = 700;
			 System.out.println("Package Price: RM" + packagePrice);
			 deposit = 100;
			 System.out.println("Deposit: RM" + deposit);
			 this.price = packagePrice+deposit;
			 System.out.println("Price: RM" + this.price);
		 }
		 else if(typeOfPackage == 2) {
			 packagePrice= 400;
			 System.out.println("Package Price: RM" + packagePrice);
			 deposit = 50;
			 System.out.println("Deposit: RM" + deposit);
			 this.price = packagePrice+deposit;
			 System.out.println("Price: " + this.price); 
		 }
		return this.price; 
	 }
	 
	 public double discount() {   //to answer question 1.3 User Define Class for using this method
		discount = 0.1;
		return this.discount;
	 }
	 
	 public double calTotalPrice() {    //to answer question 1.3 User Define Class for using this method
		 System.out.print("Enter package price after plus deposit: RM");
		 this.price = sc.nextDouble();
		 discount = this.price*discount();
		 System.out.println("Discount: RM" + discount);
		 totalPrice = this.price-(this.price*discount());
		 System.out.println("Total Price after discount: RM" + totalPrice);
		 return this.totalPrice;
	 }
}
