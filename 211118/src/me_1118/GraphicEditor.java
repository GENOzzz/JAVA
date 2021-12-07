package me_1118;

import java.util.Scanner;

public class GraphicEditor {
	private Scanner sc=new Scanner(System.in);
	private String name;
	private Shape start=null,last=null;
	GraphicEditor(String name){
		this.name=name;
	}
	
	public void run() {
		System.out.println("�׷��� ������ "+name+"�� �����մϴ�.");
		int choice=0;
		int num=0;
		
		while(choice!=5) {
			System.out.print("����(1)  ����(2)  ��κ���(3)  ������ ���� (4) ����(5) >>> ");
			choice=sc.nextInt();
			switch(choice) {
			case 1://insert()
				System.out.print("Line(1)  Rect(2)  Circle(3)  :");
				num = sc.nextInt();
				if(num<1||num>3) {
					System.out.println("�ٽôٽôٽôٽôٽôٽôٽô�");
					break;
				}
				insert(num);
				break;
			case 2://delete()
				System.out.print("������ ������ ��ġ �Է� >>>>");
				num=sc.nextInt();
				if(!delete(num)) {
					System.out.println("������ �� �����ϴ�.");
				}
				break;
			case 3://show()
				Shape t=start;
				if(t==null) {
					System.out.println("�ƹ��͵� �����ϴٸ�.");
				}
				while(t!=null) {
					t.draw();
					t=t.getNext();
				}
				break;
				
			case 4://show()
				t=last;
				if(t==null) {
					System.out.println("�ƹ��͵� �����ϴٸ�.");
				}
				while(t!=null) {
					t.draw();
					t=t.getPre();
				}
				break;
			
			case 5:
				System.out.println(name+"��(��) �����մϴ�");
				break;
			default:
				System.out.println("1~4������ �Է��� �ֽʽÿ�.");
			}
		}
	}
		
	private void insert (int num){
			Shape obj=null;
				switch(num) {
				case 1:
					obj=new Line();
					break;
				case 2:
					obj=new Rect();
					break;
				case 3:
					obj=new Circle();
					break;
				}
				if(start==null) {
					start=last=obj;
				}
				
				else {
					System.out.print("���°�� �����ðڽ��ϱ�>>>");
					int n=sc.nextInt();
					if(!push(n,obj)) {
						System.out.println("������ �����ϴ�.");
					}
				}
	}
	public boolean push(int n,Shape obj) {//������ ShapeŸ�� obj�� �Է¹ް� ���ϴ� ������ �ִ� �Լ�.
		Shape cur=start;
		Shape pre=start;

		if(n==0) { //ù��°�� �ְ�������
			start.setPre(obj);
			obj.setNext(start);
			start=obj;
			return true;
		}
		if(n==1&&start==last) {//��ü�� �ϳ����̰�(0��° �ϳ�) �׹ٷ� �ڿ� �������
			start.setNext(obj);
			obj.setPre(start);
			last=obj;
			return true;
		}
		if(n==1) {//��ü�� �������϶� 0��° ������ ������ ���
			start.getNext().setPre(obj);
			obj.setNext(start.getNext());
			start.setNext(obj);
			obj.setPre(start);
			return true;
		}
		if(n>1) {
			for(int i=0;i<n;i++) {
				pre=cur;
				if(pre==null) {
					System.out.println("�ʰ��ʰ�");
					return false;
				}
				cur=cur.getNext();
				
			}
			if(pre==last) {//��ü�� �������� �װ�������
				obj.setPre(last);
				last.setNext(obj);
				last=obj;
				return true;
			}
			obj.setNext(cur);
			obj.setPre(pre);
			cur.setPre(obj);
			pre.setNext(obj);
			return true;
		}
		return true;
	}
	
	public boolean delete(int n) {
		Shape cur=start;
		Shape pre=start;
		if(start==null&&last==null) {
			return false;
		}
		if(n==0&&start==last) {//��ü�� �ϳ����̰� �� 0���� ������
			start=null;
			last=null;
			return true;
		}
		if(n==0&&start!=last) {//��ü�� �������϶� 0��°�� ������
			start=start.getNext();
			return true;
		}
		if(n==1&&start.getNext()==last) {//��ü�� 2���϶� 1��°�� ������
			start.setNext(null);
			last.setPre(null);
			last=start;
			return true;
		}
		for(int i=0;i<n;i++) {
			pre=cur;
			if(pre==null) {
				System.out.println("�ʰ�");
				return false;
			}
			cur=cur.getNext();
		}
		if(cur.getNext()==null) {//������ ��ü�� ����� ���
			last.setPre(pre.getPre());
			pre.setNext(null);
			last=pre;
			return true;
		}
		cur.getNext().setPre(cur.getPre());//�� �� ������ �ֵ��� ����� ���
		cur.getPre().setNext(cur.getNext());
		cur.setNext(null);
		cur.setPre(null);
		return true;
	}
	
	public static void main(String[] args) {
		GraphicEditor ge=new GraphicEditor("beauty");
		ge.run();
	}

}
