package test7_06;

public class Location {
	private String country;
	private int latitude;
	private int longitude;
	
	public String getCountry() {return country;}

	public void setCountry(String country) {this.country = country;}

	public int getLatitude() {return latitude;}

	public void setLatitude(int latitude) {this.latitude = latitude;}

	public int getLongitude() {return longitude;}

	public void setLongitude(int longitude) {this.longitude = longitude;}

	
	
	Location(String country, int latitude, int longitude){
		this.country=country;
		this.latitude=latitude;
		this.longitude=longitude;
	}
	
	public String toString() {
		return getCountry()+" "+getLatitude()+" "+getLongitude();
	}
}
