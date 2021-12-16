package test7_10;

import java.util.*;


public class test7_10 {
	Check ck=new Check();
	Scanner sc=new Scanner(System.in);
	Vector<Shape>editor=new Vector<Shape>();
	String name;
	test7_10(String name){
		this.name=name;
	}
	public void run() {
		System.out.println("�׷��� ������ "+name+"��(��) �����մϴ�.");
		while(true) {
			System.out.print("����(1) ����(2) ��κ���(3) ����(4) >>");
			String choose=sc.next();
			switch(choose) {
			case "1":
				System.out.print("Line(1) Rect(2) Circle(3) >> ");
				String figure=sc.next();
				switch(figure) {
				case "1":
					editor.add(new Line());
					break;
				case "2":
					editor.add(new Rect());
					break;
				case "3":
					editor.add(new Circle());
					break;
				default:
					System.out.println("������ ���ڸ� �Է��� �ֽʽÿ�.");
					break;
				}
				break;
			case "2":
				System.out.print("������ ������ ��ġ >>");
				int idx=ck.intcheck(sc.next());
				if(idx>-1&&idx<editor.size()) {
					editor.remove(idx);
				}else {
					System.out.println("�ش��ϴ� ��ġ�� ������ �����ϴ�.");
				}
				break;
			case "3":
				if(editor.size()>-1) {
					for(int i=0;i<editor.size();i++) {
						editor.get(i).draw();
					}
				}else{
					System.out.println("������ �����ϴ�.");
				}
				break;
			case "4":
				System.out.println(name+"��(��) �����մϴ�.");
				return;
			default:
				System.out.println("������ ���ڸ� �Է��� �ֽʽÿ�.");
			}
		}
	}

	public static void main(String[] args) {
		test7_10 t=new test7_10("�����׸���");
		t.run();

	}

}
