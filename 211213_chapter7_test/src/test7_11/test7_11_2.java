package test7_11;

import java.util.*;
import java.util.stream.Collectors;

public class test7_11_2 {
	Scanner sc=new Scanner(System.in);
	HashMap<String, String> hn=new HashMap<String, String>();
	test7_11_2(){
		hn.put("�ѱ�","����");
		hn.put("�̱�","������");
		hn.put("ĳ����","��Ÿ��");
		hn.put("ȣ��","�õ��");
		hn.put("����","����");
		hn.put("����","������");
		hn.put("��Ż����","�θ�");
		hn.put("�Ϻ�","����");
		hn.put("���þ�","��ũ��");
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
				hnQuiz();
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
		System.out.println("���� "+hn.size()+"���� ������ �ԷµǾ� �ֽ��ϴ�.");
		while(true) {
			System.out.print("������ ������ �Է��� �ֽʽÿ�(���� "+hn.size()+")>>");
			String country=sc.next();
			if(country.equals("�׸�")) break;
			String capital=sc.next();
			if(hn.entrySet().stream().anyMatch(nation->nation.getKey().equals(country))) {//���ٽ�.
				System.out.println("�����ϴ� �����Դϴ�.");
			}else {
				hn.put(country, capital);
			}
		}
	}
	
	public void hnQuiz() {
		while(true) {
			int quiz=(int)(Math.random()*hn.size());
			List<String>nations=hn.keySet().stream().peek(a->System.out.print(a))//print�� list�� �� aȮ��.
					.collect(Collectors.toList());//keySet.stream�� list�� ����� nation�� �ѱ�
			System.out.print(nations.get(quiz)+"�� ������ ??");
			String answer=sc.next();
			if(answer.equals("�׸�")) break;
			if(answer.equals(hn.get(nations.get(quiz)))){
				System.out.println("�����Դϴ�!");
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�!");
			}
		}
	}
	
	public static void main(String[]args) {
		test7_11_2 t=new test7_11_2();
		t.vnrun();
	}
}
