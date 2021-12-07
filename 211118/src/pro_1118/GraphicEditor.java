package pro_1118;

import java.util.Scanner;

public class GraphicEditor {
	private Scanner sc=new Scanner(System.in);
	private String name;
	private Shape start=null,last=null;
	public GraphicEditor(String name) {
		this.name=name;
	}
	public void run() {
		System.out.println("�׷��ȿ�����"+name+"�� �����մϴ�.");
		int choice=0; //���� ���� ��κ��� ���� ���� ��ȣ
		int num=0;	//��� ���� ��ȣ
		
		while(choice!=4) {
			System.out.print("����(1)  ����(2)  ��κ���(3)  ����(4) >>> ");
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
			case 4:
				System.out.println(name+"��(��) �����մϴ�");
				break;
			default:
				System.out.println("1~4������ �Է��� �ֽʽÿ�.");
			}
			
		}
	}
	
	private void insert(int num) {
		Shape obj = null;
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
			last.setNext(obj);
			last=obj;
		}
	}
	
	private boolean delete(int num) {
		Shape cur=start,pre=start;
		if(start==null) {
			return false;
		}
		for(int i=0;i<num;i++) {
			pre=cur;
			cur=cur.getNext();
			if(cur==null) {
				return false;
			}
		}
		if(start == last) {
			start=last=null;
			return true;
		}
		if(cur==start) {
			start=start.getNext();
		}
		else if(cur == last) {
			last=pre;
			last.setNext(null);
		}
		else {
			pre.setNext(cur.getNext());
		}
		return true;
	}
	
	
	
	public static void main(String[] args) {
		GraphicEditor ge=new GraphicEditor("beauty");
		ge.run();
	}

}
