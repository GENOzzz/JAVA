package RSP_main;

public class human extends com{//name�� hand�� ���� human class �Ŀ� equals�� ����Ͽ� ���ϱ����� com���
	private String name;
	private String hand;
	
	public String getName() {return name;}

	public void setName(String name) {this.name = name;}

	public String getHand() {return hand;}

	public void setHand(String hand) {this.hand = hand;}

	
	public human() {}
	
	public human(String name){//������
		this.name=name;
	}
	

	public void humanhand(int n){//�Է¹��� ������ ���� hand�� ���ϴ� �Լ�
		if(n==1) this.hand="����";
		else if(n==2) this.hand="����";
		else this.hand="��";
	}
	
	public String toString() {//toString�������̵�
		return name+"("+hand+")";
	}

}
