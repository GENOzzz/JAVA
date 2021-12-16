package test7_11;

import java.util.*;

public class test7_11_1 {
	Scanner sc=new Scanner(System.in);
	Vector<Nation> vn=new Vector<Nation>();
	test7_11_1(){
		vn.add(new Nation("�ѱ�","����"));
		vn.add(new Nation("�̱�","������"));
		vn.add(new Nation("ĳ����","��Ÿ��"));
		vn.add(new Nation("ȣ��","�õ��"));
		vn.add(new Nation("����","����"));
		vn.add(new Nation("����","������"));
		vn.add(new Nation("��Ż����","�θ�"));
		vn.add(new Nation("�Ϻ�","����"));
		vn.add(new Nation("���þ�","��ũ��"));
	}
	
	public void vnrun() {
		System.out.println("���� ���߱� ��� �����մϴ�");
		while(true) {
			System.out.print("�Է�(1) ����(2) ����(3)>>>");
			String choice=sc.next();
			switch(choice) {
			case "1":
				npush();
				break;
			case"2":
				vnQuiz();
				break;
			case"3":
				System.out.println("�����մϴ�.");
				return;
			default:
				System.out.println("������ ���ڸ� �Է��� �ֽʽÿ�.");
			}
		}
	}
	
	public void npush() {
		System.out.println("���� "+vn.size()+"���� ������ �ԷµǾ� �ֽ��ϴ�.");
		while(true) {
			System.out.print("������ ������ �Է��� �ֽʽÿ�(���� "+vn.size()+")>>");
			String name=sc.next();
			if(name.equals("�׸�")) break;
			String capital=sc.next();
			if(vn.stream().anyMatch(nation -> nation.getCountry().equals(name))) {
				System.out.println("�̹� �����ϴ� ���� �Դϴ�.");
			}else {
				Nation newNation=new Nation(name,capital);
				vn.add(newNation);
			}
//			Nation newNation=new Nation(name,capital);
//			if(vn.contains(newNation)) {
//				System.out.println("�̹� �����ϴ� �����Դϴ�.");
//			}else {
//				vn.add(newNation);
//			}

		}
	}
	
	public void vnQuiz() {
		while(true) {
			int quiz=(int)(Math.random()*vn.size());
			System.out.print(vn.get(quiz).getCountry()+"�� ������ ??");
			String answer=sc.next();
			if(answer.equals("�׸�")) break;
			if(answer.equals(vn.get(quiz).getCapital())) {
				System.out.println("�����Դϴ�!");
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�!");
			}
		}
	}
	
	public static void main(String[]args) {
		test7_11_1 t=new test7_11_1();
		t.vnrun();
	}
}
