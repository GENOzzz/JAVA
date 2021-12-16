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
		System.out.println("그래픽 에디터 "+name+"을(를) 실행합니다.");
		while(true) {
			System.out.print("삽입(1) 삭제(2) 모두보기(3) 종료(4) >>");
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
					System.out.println("보기의 숫자만 입력해 주십시오.");
					break;
				}
				break;
			case "2":
				System.out.print("삭제할 도형의 위치 >>");
				int idx=ck.intcheck(sc.next());
				if(idx>-1&&idx<editor.size()) {
					editor.remove(idx);
				}else {
					System.out.println("해당하는 위치에 도형이 없습니다.");
				}
				break;
			case "3":
				if(editor.size()>-1) {
					for(int i=0;i<editor.size();i++) {
						editor.get(i).draw();
					}
				}else{
					System.out.println("도형이 없습니다.");
				}
				break;
			case "4":
				System.out.println(name+"을(를) 종료합니다.");
				return;
			default:
				System.out.println("보기의 숫자만 입력해 주십시오.");
			}
		}
	}

	public static void main(String[] args) {
		test7_10 t=new test7_10("도형그리기");
		t.run();

	}

}
