
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int user;
		
			System.out.println("\t---WECLCOME TO OUR SERVICE---");
			TourismBusinessCompany TBS = new TourismBusinessCompany();   //TBS is a new object TourismBusinessCompany
			TBS.setCompanyName("WEE TOURISM ENTERPRISE");
			TBS.setAddress("No252, Jalan Bunga Mawar, Pantai Cenang Langkawi, Kedah");
			TBS.setPosscode("07000");
			TBS.setLocation("Pantai Cenang, Langkawi");
			TBS.setTelNumber("044550493");
			TBS.setFax("044550934");
			TBS.setWebsite("www.weetourism.com.my");
		
			System.out.println("Company Name: " + TBS.getCompanyName());
			System.out.println("Address: " + TBS.getAddress());
			System.out.println("Posscode: " + TBS.getPosscode());
			System.out.println("Location: " + TBS.getLocation());
			System.out.println("Telephone Number: " + TBS.getTelNumber());
			System.out.println("Fax: " + TBS.getFax());
			System.out.println("Website: " + TBS.getWebsite());
			System.out.println();
			
		System.out.println("1.Admin user\n"
					+ "2.Customer user\n");
		System.out.print("Please enter user: ");
		user = sc.nextInt();	
		if(user == 1) {
			
			System.out.println();
			System.out.println("\tEmployee");
			Employee a = new Employee();                      //a is a new object for Employee
			Employee b = new Employee("NADHIRAH", 280806);	    //b is a new object for Employee	
			Employee c = new Employee("Customer Services");        //c is a new object for Employee
			System.out.println("Staff Name : " + b.getName());
			System.out.println("Staff ID : " + b.getStaffID());
			System.out.println("Shift: " + a.getShift());
			System.out.println("Position: " + c.getPosition());
			b.Salary();
			System.out.println();
			
			System.out.println("\tEventDescription");
			EventDescription ED = new EventDescription();     //ED is a new object for EventDescription
			
			System.out.println("\tAdvertisement");
			Advertisement ads = new Advertisement();
			ads.calCostOfAdsPlatform();
			ads.calTotalCost();
			System.out.println();
			
			System.out.println("\tPromotion Service");
			PromotionService ps = new PromotionService();		//ps ia a new object for PromotionService
			ps.setStartDate("1 JUN");
			ps.setEndDate("30 JUN");
			System.out.println("Start date Promotion for every year: " + ps.getStartDate());
			System.out.println("End date Promotion for every year: " + ps.getStartDate() + "\n");
		}
		else if(user == 2) {
			CustomerRegistration cr = new CustomerRegistration();		//cr is a new object for CustomerRegistration
			System.out.println();
			System.out.println("\tCustomer Information");
			System.out.println("Customer name: " + cr.getCustName());
			System.out.println("Customer Identity Number: " + cr.getIdentityNumber());
			System.out.println("Customer email: " + cr.getEmail());
			System.out.println();
			
			System.out.println("\tPackage Information");
			EventDescription ED = new EventDescription();
			ED.calPrice();
			ED.calTotalPrice();
			System.out.println();
			
			System.out.println("\tPromotion");
			PromotionService ps = new PromotionService();
			ps.choosePromotion();	
		}
		}	
		
	}



