package test7_11;

public class Nation {
	private String country;
	private String capital;
	
	public String getCountry() {return country;}

	public void setCountry(String country) {this.country = country;}

	public String getCapital() {return capital;}

	public void setCapital(String capital) {this.capital = capital;}

	Nation(String country,String capital){
		this.country=country;
		this.capital=capital;
	}
	
	public String toString() {
		return getCountry()+" "+getCapital();
	}
	
	public boolean equals(Object obj) {
		if(getCountry().equals(((Nation) obj).getCountry())) return true;
		else return false;
	}
}
