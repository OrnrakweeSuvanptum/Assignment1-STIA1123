
public class Advertisement {  //Advertisement is a sublcass for TourismBusinessCompany
 
	private double costOfAdsPlatform, tax, totalCost;
	
	Advertisement(){                    //to answer question 1.4 Constructor for using constructor with no-arguments
		printAdvertisementPlatform();
		printCostOfAdsPlatform();
		printAdsInfo();
	}
	
	public void printAdvertisementPlatform() {    //to answer question 1.3 User Define Class for using this method
		
		System.out.println("---Platform for Advertisement---");
		System.out.println("\t1.Television");
		System.out.println("\t2.Social Media:\n"
							+ "\t-Facebook\n"
							+ "\t-Instagram"); 
		System.out.println("\t3.Banner");
		System.out.println("--------------------------------");
		}
	 
	public void printCostOfAdsPlatform() {        //to answer question 1.3 User Define Class for using this method
		
		System.out.println("Cost per month");
		System.out.println("1.Television: RM10000\n"
							+ "2.Social Media: RM70\n"
							+ "3.Banner: RM40\n");
	}
	
	public void printAdsInfo() {   //to answer question 1.3 User Define Class for using this method 
		System.out.println("#This Advertisement advertise our package that company provide to the customer\n"
							+ "#Advertise our promotion\n");
		
	}
	public double calCostOfAdsPlatform() {      //to answer question 1.3 User Define Class for using this method
		double TelevisionCost, BannerCost, SocMedCost;
		
		TelevisionCost =  10000;
		SocMedCost = 70;
		BannerCost = 40;
		
		costOfAdsPlatform = TelevisionCost+SocMedCost+BannerCost; 
		System.out.println("Cost for advertisment platform per month: RM" + costOfAdsPlatform);
		
		return this.costOfAdsPlatform;
	
	} 
	
	public double calTotalCost() {    //to answer question 1.3 User Define Class for using this method
		
		costOfAdsPlatform = 10110;
		tax = 0.05;
		tax = costOfAdsPlatform*tax;
		totalCost = costOfAdsPlatform+tax;
		
		System.out.println("Tax: RM" + tax);
		System.out.println("Total Cost for advertisement per month: RM" +totalCost);
		
		return this.totalCost;
	}
	
	
}
