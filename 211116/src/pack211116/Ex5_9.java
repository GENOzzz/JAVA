package pack211116;

interface PhoneInterface{	//�������̽� ����
	final int TIMEOUT=10000;//��� �ʵ� ����
	void sendCall();		//�߻� �޼ҵ� >>>�������̽� �̹Ƿ� abstract ��������.
	void receiveCall();		//�߻�޼ҵ�
	default void printLogo() {	//dafault �޼ҵ�
		System.out.println("***PONE***");
	}
}

interface MobilePhoneInterface extends PhoneInterface{ //�������̽� ���� �� �������̽� ���
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface{ //�������̽� ����
	public void play();
	public void stop();
}

class PDA{
	public int calculate(int a, int b) { //Ŭ���� ����
		return a+b;
	}
}

//Ex5_9 Ŭ������ PDA�� ��ӹް�,(���� PDAŬ������ �߻� Ŭ�������ٸ� �׿� ���� �߻󳻿���� ��� �����Ͽ��� �Ѵ�.)
//MobilePhoneInterface�� MP3Interface �������̽��� ����� �߻� �޼ҵ带 ��� �����Ͽ��� �Ѵ�.
public class Ex5_9 extends PDA implements MobilePhoneInterface, MP3Interface{
	//MobilePhonInterface�� �߻� �޼ҵ� ����
	public void sendCall() {	//�������̽� ������ ��������� public�� ����Ͽ��� ��. ������ ���� �߻�.
		System.out.println("��ȭ ���ϴ� ��ȭ ��������-----");
	}
	public void receiveCall() {
		System.out.println("-----��ȭ �ɴϴ� ��ȭ ��������");
	}
	//MobilePhonInterface�� PhoneInterface�� ��ӹ޾ұ⿡ 
	//MobilePhonInterface�� ��ӹ��� Ex5_9���� PhoneInterface�� �߻� �޼ҵ嵵 �����Ͽ�����.
	public void sendSMS() {
		System.out.println("���� ���ϴ� ````````");
	}
	public void receiveSMS() {
		System.out.println("````````���� �ɴϴ�");
	}
	//MP3Interface�� �߻� �޼ҵ� ����
	public void play() {
		System.out.println("������ ����մϴ�.");
	}
	public void stop() {
		System.out.println("������ �����մϴ�.");
	}
	//�߰��� �ۼ��� �޼ҵ�(Ex5_9�� �޼ҵ�) <<<����Ŭ�������� ��ӹްų� �������̽����� ��ӹ����� �ƴϱ� ������ �������� ��������.(default)
	void schedule() {
		System.out.println("���� �����մϴ�.");
	}
	
	public static void main(String[] args) {
		Ex5_9 smphon=new Ex5_9();
		smphon.printLogo();
		smphon.sendCall();
		smphon.play();
		System.out.println("3�� 5�� ���ϸ� "+ smphon.calculate(3,5));
		smphon.schedule();
		
		MobilePhoneInterface ygphon = new Ex5_9();
		ygphon.receiveCall();

	}

}
