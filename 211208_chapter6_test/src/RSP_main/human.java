package RSP_main;

public class human extends com{//name�� hand�� ���� human class �Ŀ� equals�� ����Ͽ� ���ϱ����� com���
	private String name;
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public human() {}
	
	public human(String name){//������
		this.name=name;
	}
	

	public void humanhand(int n){//�Է¹��� ������ ���� hand�� ���ϴ� �Լ�
		if(n==1) super.setHand("����");
		else if(n==2) super.setHand("����");
		else super.setHand("��");
	}
	
	public String toString() {//toString�������̵�
		return name+"("+getHand()+")";
	}

}
