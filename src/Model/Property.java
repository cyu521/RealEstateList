package Model;


/*
 * De Yu
 * Dy87@drexel.edu
 * CS338:GUI, Assignment [#1]
 * 
 */
public class Property {
	private String address;
	private String city;
	private String bedrooms;
	private String bathrooms;
	private String squareFeet;
	private String yearBuilt;
	private String pricePerSqFt;

	// basic constructor
	public Property(String address, String city, String bedrooms,
			String bathrooms, String squareFeet, String yearBuilt,
			String pricePerSqFt) {
		this.address = address;
		this.city = city;
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
		this.squareFeet = squareFeet;
		this.yearBuilt = yearBuilt;
		this.pricePerSqFt = pricePerSqFt;

	}

	// string for list
	public String toString() {
		return address + ", " + city + ", " + bedrooms + ", " + bathrooms
				+ ", " + squareFeet + ", " + yearBuilt + ", $" + pricePerSqFt;
	}

	// string for array
	public String[] toStringArray() {
		String[] returnValue = { address, city, bedrooms, bathrooms,
				squareFeet, yearBuilt, pricePerSqFt };
		return returnValue;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBedrooms() {
		return bedrooms;
	}

	public void setBedrooms(String bedrooms) {
		this.bedrooms = bedrooms;
	}

	public String getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms(String bathrooms) {
		this.bathrooms = bathrooms;
	}

	public String getSquareFeet() {
		return squareFeet;
	}

	public void setSquareFeet(String squareFeet) {
		this.squareFeet = squareFeet;
	}

	public String getYearBuilt() {
		return yearBuilt;
	}

	public void setYearBuilt(String yearBuilt) {
		this.yearBuilt = yearBuilt;
	}

	public String getPricePerSqFt() {
		return pricePerSqFt;
	}

	public void setPricePerSqFt(String pricePerSqFt) {
		this.pricePerSqFt = pricePerSqFt;
	}

}
