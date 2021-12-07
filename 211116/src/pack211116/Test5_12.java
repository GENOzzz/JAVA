package pack211116;
import java.util.Scanner;

abstract class Shapee{
	private Shapee next;
	public Shapee() {next=null;}
	public void setNext(Shapee obj) {next=obj;};//��ũ����
	public Shapee getNext() {return next;}
	public abstract void draw();//�߻� �޼ҵ�
}

class Line extends Shapee{ //Shapee�� ��ӹ��� Line Ŭ���� ����
	public void draw() {
		System.out.println("��");
	}
}

class Rect extends Shapee{ //Shapee�� ��ӹ��� Rect Ŭ���� ����
	public void draw() {
		System.out.println("��");
	}
}

class Circle extends Shapee{ //Shapee�� ��ӹ��� Circle Ŭ���� ����
	public void draw() {
		System.out.println("��");
	}
}


public class Test5_12 {
	Scanner scan=new Scanner(System.in);
	int count=0;	//����ɶ� �� count����
	Shapee start;	//��ũ�� �������ְ� ������ �ٿ��� ShpeeŸ�� ���۷��� ����
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
			System.out.println("1~3�� �Է��� �ֽʽÿ�");
		}
	}
	
	void del() {
		Shapee temp=start;
		System.out.print("������ ������ ��ġ >>>");
		int pos=scan.nextInt();
		if(pos-1==0) {
			if(start==null) {
				System.out.println("������ �� �����ϴ�.");
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
						System.out.println("������ �� �����ϴ�.");
					}
					break;
				}
			}
		}
		else {
			System.out.println("������ �� �����ϴ�.");
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
				System.out.println("�ƹ��͵� ���µ� �� ���Ƿ��� �Ͻ���");
				break;
			}
		}
	}
	void run(){
		System.out.println("�׷��� ������ beauty�� �����մϴ�.");
			edit();
	}
	
	public void edit() {
		while(true) {
			System.out.print("����(1)  ����(2)  ��� ����(3)  ����(4) >>>");
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
				System.out.print("beauty�� �����մϴ�");
				break;
			default:
				System.out.println("1~4�� �Է��� �ֽʽÿ�");
				continue;
			}break;
		}
	}
	
	public static void main(String[] args) {
		Test5_12 a = new Test5_12();
		a.run();
	}

}
