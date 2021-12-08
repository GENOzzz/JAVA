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
		if(n==1) this.hand="가위";
		else if(n==2) this.hand="바위";
		else this.hand="보";
	}
	
	public String toString() {
		return name+"("+hand+")";
	}

}
