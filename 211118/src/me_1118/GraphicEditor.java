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
		System.out.println("그래픽 에디터 "+name+"을 실행합니다.");
		int choice=0;
		int num=0;
		
		while(choice!=5) {
			System.out.print("삽입(1)  삭제(2)  모두보기(3)  역으로 보기 (4) 종료(5) >>> ");
			choice=sc.nextInt();
			switch(choice) {
			case 1://insert()
				System.out.print("Line(1)  Rect(2)  Circle(3)  :");
				num = sc.nextInt();
				if(num<1||num>3) {
					System.out.println("다시다시다시다시다시다시다시다");
					break;
				}
				insert(num);
				break;
			case 2://delete()
				System.out.print("삭제할 도형의 위치 입력 >>>>");
				num=sc.nextInt();
				if(!delete(num)) {
					System.out.println("삭제할 수 없습니다.");
				}
				break;
			case 3://show()
				Shape t=start;
				if(t==null) {
					System.out.println("아무것도 없습니다만.");
				}
				while(t!=null) {
					t.draw();
					t=t.getNext();
				}
				break;
				
			case 4://show()
				t=last;
				if(t==null) {
					System.out.println("아무것도 없습니다만.");
				}
				while(t!=null) {
					t.draw();
					t=t.getPre();
				}
				break;
			
			case 5:
				System.out.println(name+"을(를) 종료합니다");
				break;
			default:
				System.out.println("1~4까지만 입력해 주십시오.");
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
					System.out.print("몇번째에 넣으시겠습니까>>>");
					int n=sc.nextInt();
					if(!push(n,obj)) {
						System.out.println("넣을수 없습니다.");
					}
				}
	}
	public boolean push(int n,Shape obj) {//순서와 Shape타입 obj를 입력받고 원하는 순서에 넣는 함수.
		Shape cur=start;
		Shape pre=start;

		if(n==0) { //첫번째에 넣고싶은경우
			start.setPre(obj);
			obj.setNext(start);
			start=obj;
			return true;
		}
		if(n==1&&start==last) {//객체가 하나뿐이고(0번째 하나) 그바로 뒤에 넣을경우
			start.setNext(obj);
			obj.setPre(start);
			last=obj;
			return true;
		}
		if(n==1) {//객체가 여러개일때 0번째 다음에 삽입할 경우
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
					System.out.println("초과초과");
					return false;
				}
				cur=cur.getNext();
				
			}
			if(pre==last) {//객체를 마지막에 쌓고싶은경우
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
		if(n==0&&start==last) {//객체가 하나뿐이고 그 0번을 지울경우
			start=null;
			last=null;
			return true;
		}
		if(n==0&&start!=last) {//객체가 여러개일때 0번째를 지울경우
			start=start.getNext();
			return true;
		}
		if(n==1&&start.getNext()==last) {//객체가 2개일때 1번째를 지울경우
			start.setNext(null);
			last.setPre(null);
			last=start;
			return true;
		}
		for(int i=0;i<n;i++) {
			pre=cur;
			if(pre==null) {
				System.out.println("초과");
				return false;
			}
			cur=cur.getNext();
		}
		if(cur.getNext()==null) {//마지막 객체를 지우는 경우
			last.setPre(pre.getPre());
			pre.setNext(null);
			last=pre;
			return true;
		}
		cur.getNext().setPre(cur.getPre());//그 외 나머지 애들을 지우는 경우
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
