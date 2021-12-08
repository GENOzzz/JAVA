package RSP_main;

public class com {
	private String hand;
	
	public String getHand() {
		return hand;
	}
	public void setHand(String hand) {
		this.hand = hand;
	}

	public void hand() {
		int h=(int)(Math.random()*3+1);
		if(h==1) this.hand="가위";
		else if(h==2) this.hand="바위";
		else this.hand="보";
	}
	
	public String toString() {
		return "컴퓨터("+hand+")";
	}
	
	public boolean equals(Object obj) {
		com com=(com)obj;
		//같은 class안인데 왜 getHand()?? 질문 ㄱㄱ
		if(getHand().equals(com.getHand())) {return true;}
		else {return false;}
	}
}
