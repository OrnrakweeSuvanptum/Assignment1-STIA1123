
public class TourismBusinessCompany { //super class

	
	
	private String companyName, address, location, website, telNumber, fax, posscode;
	
	
		//Setter method
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		
		public void setAddress(String address) {
			this.address = address;
		}
		
		public void setPosscode(String posscode) {
			this.posscode = posscode;
		}
		
		public void setLocation(String location) {
			this.location = location;
		}
		
		public void setTelNumber(String telNumber) {
			this.telNumber = telNumber;
		}
		
		public void setFax(String fax) {
			this.fax = fax;
		}
		
		public void setWebsite(String website) {
			this.website = website;
		}
		
	
	//Getter Method
	public String getCompanyName() {
		return this.companyName;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getPosscode() {
		return this.posscode;
	}
	
	public String getLocation() {
		return this.location;
	}
	
	public String getTelNumber() {
		return this.telNumber;
	}
	
	public String getFax() {
		return this.fax;
	}
	
	public String getWebsite() {
		return this.website;
	}

	
}

