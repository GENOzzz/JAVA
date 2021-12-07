package pack211116;

interface PhoneInterface{	//인터페이스 선언
	final int TIMEOUT=10000;//상수 필드 선언
	void sendCall();		//추상 메소드 >>>인터페이스 이므로 abstract 생략가능.
	void receiveCall();		//추상메소드
	default void printLogo() {	//dafault 메소드
		System.out.println("***PONE***");
	}
}

interface MobilePhoneInterface extends PhoneInterface{ //인터페이스 선언 및 인터페이스 상속
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface{ //인터페이스 선언
	public void play();
	public void stop();
}

class PDA{
	public int calculate(int a, int b) { //클래스 선언
		return a+b;
	}
}

//Ex5_9 클래스는 PDA를 상속받고,(만일 PDA클래스가 추상 클래스였다면 그에 따른 추상내용또한 모두 구현하여야 한다.)
//MobilePhoneInterface와 MP3Interface 인터페이스에 선언된 추상 메소드를 모두 구현하여야 한다.
public class Ex5_9 extends PDA implements MobilePhoneInterface, MP3Interface{
	//MobilePhonInterface의 추상 메소드 구현
	public void sendCall() {	//인터페이스 구현시 접근제어는 public을 사용하여야 함. 생략시 오류 발생.
		System.out.println("전화 갑니다 전화 받으세요-----");
	}
	public void receiveCall() {
		System.out.println("-----전화 옵니다 전화 받으세요");
	}
	//MobilePhonInterface는 PhoneInterface를 상속받았기에 
	//MobilePhonInterface을 상속받은 Ex5_9에서 PhoneInterface의 추상 메소드도 구현하여야함.
	public void sendSMS() {
		System.out.println("문자 갑니다 ````````");
	}
	public void receiveSMS() {
		System.out.println("````````문자 옵니다");
	}
	//MP3Interface의 추상 메소드 구현
	public void play() {
		System.out.println("음악을 재생합니다.");
	}
	public void stop() {
		System.out.println("음악을 정지합니다.");
	}
	//추가로 작성한 메소드(Ex5_9의 메소드) <<<슈퍼클래스에서 상속받거나 인터페이스에서 상속받은게 아니기 때문에 접근제어 생략가능.(default)
	void schedule() {
		System.out.println("일정 관리합니다.");
	}
	
	public static void main(String[] args) {
		Ex5_9 smphon=new Ex5_9();
		smphon.printLogo();
		smphon.sendCall();
		smphon.play();
		System.out.println("3과 5를 더하면 "+ smphon.calculate(3,5));
		smphon.schedule();
		
		MobilePhoneInterface ygphon = new Ex5_9();
		ygphon.receiveCall();

	}

}
