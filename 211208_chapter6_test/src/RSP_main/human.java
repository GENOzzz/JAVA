package RSP_main;

public class human extends com{//name과 hand를 가진 human class 후에 equals를 사용하여 비교하기위해 com상속
	private String name;
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public human() {}
	
	public human(String name){//생성자
		this.name=name;
	}
	

	public void humanhand(int n){//입력받은 정수에 따라 hand를 정하는 함수
		if(n==1) super.setHand("가위");
		else if(n==2) super.setHand("바위");
		else super.setHand("보");
	}
	
	public String toString() {//toString오버라이딩
		return name+"("+getHand()+")";
	}

}
