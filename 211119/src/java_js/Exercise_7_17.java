package java_js;
class Unit{//����Ŭ����  Army����
	int x,y;//������ġ
	void move(int x,int y) { //���� �޼ҵ� move()
		this.x=x;
		this.y=y;
	}
	void stop() {//����޼ҵ� stop() ���� ��ġ�� ����
	}
}

class Marine extends Unit{//����
	void stimPack() {
		System.out.println("�������� ����մϴ�.");
	}
}

class Tank extends Unit{//��ũ
	void changeMode() {
		System.out.println("���ݸ�带 ��ȯ�մϴ�");
	}
	
}

class Dropship extends Unit{ //���ۼ�
	void load() {
		System.out.println("���õ� ����� �¿�ϴ�.");
	}
	void unload(){
		System.out.println("���õ� ����� �����ϴ�.");
	}
}


public class Exercise_7_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
