package RSP_main;

public class com {//hand갖고있는 com class
	private String hand;
	
	public String getHand() {
		return hand;
	}
	public void setHand(String hand) {
		this.hand = hand;
	}

	public void hand() {//함수 호출시 hand의 종류를 정하는 함수
		int h=(int)(Math.random()*3+1);
		if(h==1) this.hand="가위";
		else if(h==2) this.hand="바위";
		else this.hand="보";
	}
	
	public String toString() {//toString오버라이딩
		return "컴퓨터("+hand+")";
	}
	
	public boolean equals(Object obj) {//두객체가 같은지 비교하여
		com com=(com)obj;
		//같은 class안인데 왜 getHand()?? 질문 ㄱㄱ
		if(getHand().equals(com.getHand())) {return true;}//서로의 hand가 같으면 true 반환.
		else {return false;}
	}
}
