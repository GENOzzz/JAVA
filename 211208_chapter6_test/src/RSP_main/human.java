package RSP_main;

public class human extends com{
	private String name;
	private String hand;
	
	public String getName() {return name;}

	public void setName(String name) {this.name = name;}

	public String getHand() {return hand;}

	public void setHand(String hand) {this.hand = hand;}

	
	public human(String name){
		this.name=name;
	}
	
	public human() {
		
	}

	public void humanhand(int n){
		if(n==1) this.hand="����";
		else if(n==2) this.hand="����";
		else this.hand="��";
	}
	
	public String toString() {
		return name+"("+hand+")";
	}

}
