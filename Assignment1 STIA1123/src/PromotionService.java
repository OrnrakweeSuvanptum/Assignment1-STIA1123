import java.util.Scanner;
public class PromotionService {  //PromotionService is a subclass for TourismBusinessCompany

	Scanner sc = new Scanner(System.in);		  //to answer question 1.2 Pre-Define Class for using Scanner
	
	private int choice;
	private String typeOfPromotion, startDate, endDate, choosePromotion;
	
	PromotionService(){   
		
		printTypeOfPromotion();
		printPromotionInfo();
	}
	
	public void printTypeOfPromotion() {    //to answer question 1.3 User Define Class for using this method
		
		System.out.println("---Type Of Promotion---\n"
							+ "\t1.Voucher\n"
							+ "\t2.Cashback Promotion");
		System.out.println("-----------------------");
						
	}
	
	public void printPromotionInfo() {      //to answer question 1.3 User Define Class for using this method
		 
		System.out.println("1.Voucher: 15% off for 1 package\n"
						   + "2.Cashback Promotion: 10% cashback of 1 purchase\n");
	}
	
	//Setter method
	public void setStartDate(String startDate) {  
		this.startDate = startDate;
	}
	
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	public String choosePromotion() {    //to answer question 1.3 User Define Class for using this method
		System.out.print("Please enter your choice: ");
		this.choice = sc.nextInt();
		if(choice == 1) {
			typeOfPromotion = "'Voucher'";
			System.out.println("Your Promotion is " + typeOfPromotion);
		}
		else if(choice == 2) {
			typeOfPromotion = "'Cashback Promotion'";
			System.out.println("Your Promotion is " + typeOfPromotion);
		}
		return this.choosePromotion;
	}
	
	//Getter method
	public String getStartDate() {
		return this.startDate;
	}
	
	public String getEndDate() {
		return this.endDate;
	}
}
