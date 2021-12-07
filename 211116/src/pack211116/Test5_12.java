package pack211116;
import java.util.Scanner;

abstract class Shapee{
	private Shapee next;
	public Shapee() {next=null;}
	public void setNext(Shapee obj) {next=obj;};//링크연결
	public Shapee getNext() {return next;}
	public abstract void draw();//추상 메소드
}

class Line extends Shapee{ //Shapee를 상속받은 Line 클래스 생성
	public void draw() {
		System.out.println("─");
	}
}

class Rect extends Shapee{ //Shapee를 상속받은 Rect 클래스 생성
	public void draw() {
		System.out.println("□");
	}
}

class Circle extends Shapee{ //Shapee를 상속받은 Circle 클래스 생성
	public void draw() {
		System.out.println("○");
	}
}


public class Test5_12 {
	Scanner scan=new Scanner(System.in);
	int count=0;	//연결될때 셀 count선언
	Shapee start;	//링크를 연결해주고 끊을때 붙여줄 Shpee타입 레퍼런스 선언
	Shapee last;
	
	void push() {
		System.out.println("Line(1)  Rect(2)  Circle(3)");
		String a=scan.next();
		switch(a) {
		case("1"):
			if(start==null) {
				start=new Line();
				last=start;
			}
			else {
				last.setNext(new Line());
				last=last.getNext();
			}
			break;
		case("2"):
			if(start==null) {
				start=new Rect();
				last=start;
			}
			else {
				last.setNext(new Rect());
				last=last.getNext();
			}
			break;
		case("3"):
			if(start==null) {
				start=new Circle();
				last=start;
			}
			else {
				last.setNext(new Circle());
				last=last.getNext();
			}
			break;
		default:
			System.out.println("1~3만 입력해 주십시오");
		}
	}
	
	void del() {
		Shapee temp=start;
		System.out.print("삭제할 도형의 위치 >>>");
		int pos=scan.nextInt();
		if(pos-1==0) {
			if(start==null) {
				System.out.println("삭제할 수 없습니다.");
			}
			else{
				start=start.getNext();
			}
		}
		else if(pos-1!=0&&pos-1>0) {
			while(true) {
				if(count != pos-1) {
					count++;
					temp=temp.getNext();
				}
				else {
					if(temp.getNext()!=null) {
						if(temp.getNext().getNext()==null) {
							last=temp;
						}
						temp.setNext(temp.getNext().getNext());
					}
					else {
						System.out.println("삭제할 수 없습니다.");
					}
					break;
				}
			}
		}
		else {
			System.out.println("삭제할 수 없습니다.");
		}
	}
	
	void show() {
		Shapee temp=start;
		while(true) {
			if(temp!=null) {
				if(temp.getNext()==null) {
					temp.draw();
					break;
				}
				else {
					temp.draw();
					temp=temp.getNext();
				}
			}
			else {
				System.out.println("아무것도 없는데 왜 보실려고 하시죠");
				break;
			}
		}
	}
	void run(){
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
			edit();
	}
	
	public void edit() {
		while(true) {
			System.out.print("삽입(1)  삭제(2)  모두 보기(3)  종료(4) >>>");
			String a=scan.next();
			switch(a) {
			case("1"):
				push();
				continue;
			case("2"):
				del();
				continue;
			case("3"):
				show();
				continue;
			case("4"):
				System.out.print("beauty를 종료합니다");
				break;
			default:
				System.out.println("1~4만 입력해 주십시오");
				continue;
			}break;
		}
	}
	
	public static void main(String[] args) {
		Test5_12 a = new Test5_12();
		a.run();
	}

}
