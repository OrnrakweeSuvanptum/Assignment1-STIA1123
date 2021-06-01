import java.util.Scanner;
public class Employee { //Employee is a subclass for TourismBusinessCompany
	
	Scanner sc = new Scanner(System.in);           //to answer question 1.2 Pre-Define Class for using Scanner
	
	 private String name, shift, position;
	 private int StaffID;
	 private double TotalNetSalary;
	 private double tax;
	 
	 Employee(){	      //to answer question 1.4 Constructor for using constructor with no-arguments
		 System.out.print("Enter shift: ");
		 this.shift = sc.next();
	 }
	 
	 Employee(String position){            //to answer question 1.4 Constructor for using constructor with one-arguments
		 this.position = position;
	 }
	 
	 Employee(String name, int StaffID){	   //to answer question 1.4 Constructor for using constructor with two-arguments
		 
		 this.name = name;
		 this.StaffID = StaffID;
	 }
	 
	 Employee(double TotalNetSalary, double tax){  //constructor with two-arguments
		 
		 this.TotalNetSalary = TotalNetSalary;
		 this.tax = tax;
		 Salary();
		 }
	 	 
	public double  Salary() {     //to answer question 1.3 User Define Class for using this method
		
		int workHours;
		double wagesPerHours, NumberOfDaysWork, TotalSalary, TotalNetSalary;
		double tax = 0.05;
		
		System.out.print("Enter wages per hours: RM");
		wagesPerHours= sc.nextDouble();
		System.out.print("Enter work hours per day: ");
		workHours = sc.nextInt();
		System.out.print("Enter NumberOfDaysWork: ");
		NumberOfDaysWork=sc.nextDouble();
		TotalSalary=((wagesPerHours*workHours)*NumberOfDaysWork);
		System.out.printf("Your TotalSalary : RM%.2f\n",TotalSalary);
		TotalNetSalary = TotalSalary - (TotalSalary*tax);
		System.out.printf("Your TotalNetSalary: RM%.2f\n",TotalNetSalary);
		return TotalNetSalary;
		
				
			}
	
	//to return all the private variable
	 public String getName() {
	        return this.name;
	    }
	 
	 public String getShift() {
		 	return this.shift;
	 }
	 
	 public String getPosition() {
		 return this.position;
	 }
 
	 public Integer getStaffID() {
	        return this.StaffID;
	    }

	 public double TotalNetSalary() {
		 return this.TotalNetSalary;
	 }
	 
	 public double getTax() {
		 return this.tax;
	 }
}
