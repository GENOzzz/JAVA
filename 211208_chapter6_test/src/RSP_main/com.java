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
		if(h==1) this.hand="����";
		else if(h==2) this.hand="����";
		else this.hand="��";
	}
	
	public String toString() {
		return "��ǻ��("+hand+")";
	}
	
	public boolean equals(Object obj) {
		com com=(com)obj;
		//���� class���ε� �� getHand()?? ���� ����
		if(getHand().equals(com.getHand())) {return true;}
		else {return false;}
	}
}
