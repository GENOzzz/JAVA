package util;

import java.util.InputMismatchException;
import java.util.Scanner;

import vo.Member;
import vo.SearchData;
import util.intcheck;

public class ConsoleUtil {

	public Member getNewMember(java.util.Scanner scan){
		intcheck intcheck=new intcheck();
		Member newMember=new Member();
		System.out.println("======�� ȸ�� ���� ���======(�������)"); //��ü�� ����� �Ͱ� ����ϴ°��� ������ �����ϰ� �ڵ带 �ۼ��Ұ�.
		System.out.print("ȸ�� ���̵� : ");							//��ü�� ���鶧 ������ ��ü�� �����������(���̵� ���������� �̸���,��ȭ��ȣ ���� �´� �������� ���)
		int id =intcheck.checkk(scan.next());					//��ü�� ����Ҷ� �̹� ������� ��ü�� ����� �������� �ƴ��� ���.
		System.out.print("ȸ�� �̸� : ");
		String name=scan.next();
		System.out.print("ȸ�� �̸��� : ");
		String email = scan.next();
		System.out.print("ȸ�� �ּ� : ");
		String addr = scan.next();
		System.out.print("ȸ�� ��� : ");
		String hobby = scan.next();
		System.out.print("ȸ�� ��ȭ��ȣ : ");
		String tel = scan.next();
		System.out.print("ȸ�� �г��� : ");
		String nick = scan.next();
		System.out.print("ȸ�� ���� : ");
		int age = intcheck.checkk(scan.next());

		newMember.setId(id);
		newMember.setName(name);
		newMember.setEmail(email);
		newMember.setAddr(addr);
		newMember.setHobby(hobby);
		newMember.setTel(tel);
		newMember.setNick(nick);
		newMember.setAge(age);
		return newMember;
	}
	public void printRegistSuccessMessage(int id) {
		System.out.println(id + "ȸ�� ��� ����");
	}
	public void printRegistFailMessage(int id) {
		System.out.println(id + "ȸ�� ��� ����");
	}
	public void printMemberList(Member[] memberArray) {
		if(memberArray.length==0) {
			System.out.println("�߰��� ȸ�� ������ �����ϴ�.");
		}else {
			for(int i=0;i<memberArray.length;i++) {
				System.out.println(memberArray[i]);
			}
		}
	}
	public int getId(String msgKind,java.util.Scanner scan) {//msgKind =>"������","�˻���" ��
		intcheck intcheck=new intcheck();
		System.out.print(msgKind + "���̵� : ");
		int s=intcheck.checkk(scan.next());
		return s;
		//����ڰ� �Է��� ���̵� �ٷ� return�� �ش�. 
	}
	public Member getNewMember(Member oldMember,java.util.Scanner scan) throws InputMismatchException{
		intcheck intcheck=new intcheck();
		Member member=new Member();
		if(oldMember==null) {
			System.out.println("���̵� �������� �ʽ��ϴ�.��");
		}
		else {
			while(true) {
				try {
					System.out.println("====�� ȸ�� ���� ����====");
					System.out.println("���̵�,�г����� ����Ұ�____");
					System.out.println("ȸ�� ���̵� : "+oldMember.getId());
					System.out.println("���� �̸� : "+oldMember.getName());
					System.out.print("�� ȸ�� �̸�  : ");
					String name=scan.next();
					System.out.println("���� �̸��� : "+oldMember.getEmail());
					System.out.print("�� ȸ�� �̸��� : ");
					String email=scan.next();
					System.out.println("���� �ּ� : "+oldMember.getAddr());
					System.out.print("�� ȸ�� �ּ� : ");
					String addr = scan.next();
					System.out.println("���� ��� : "+oldMember.getHobby());
					System.out.print("�� ȸ�� ��� : ");
					String hobby = scan.next();
					System.out.println("���� ��ȭ��ȣ : "+oldMember.getTel());
					System.out.print("�� ȸ�� ��ȭ��ȣ : ");
					String tel = scan.next();
					System.out.println("���� ���� : "+oldMember.getAge());
					System.out.print("�� ȸ�� ���� : ");
					int age=intcheck.checkk(scan.next());
					
					member.setId(oldMember.getId());
					member.setNick(oldMember.getNick());
					member.setName(name);
					member.setEmail(email);
					member.setAddr(addr);
					member.setHobby(hobby);
					member.setTel(tel);
					member.setAge(age);
					
					break;
				}catch(Exception e) {
					scan.next();
					e.printStackTrace();
					throw e;
				}
		}
		}return member;
	}
	public void printUpdateSuccessMessage(int id) {
		System.out.println(id + " ȸ�� ���� ���� ����");
	}
	public void printUpdateFailMessage(int id) {
		System.out.println("ȸ�� ���� ���� ����");
	}
	public void printDeleteSuccessMessage(int id) {
		System.out.println(id + "ȸ�� ���� ���� ����");
	}
	public void printDeleteFailMessage(int id) {
		System.out.println(id + " ȸ�� ���� ���� ����");
	}
	public SearchData getSearchData(java.util.Scanner scan) {
		intcheck intcheck = new intcheck();
		String searchCondition=null;
		String searchValue=null;
		System.out.println("�˻� ������ �����Ͻÿ�.");
		System.out.println("1. ���̵�");
		System.out.println("2. �̸�");
		System.out.println("3. �г���");
		System.out.println("4. ���");
		while(true) {
			System.out.print("�˻� ���� : ");
			searchCondition = scan.next();//�˻� ���� ����
			searchValue=null; //�˻� ��
			if(searchCondition.equals("���̵�")||searchCondition.equals("1")){
				System.out.print("�˻��� ���̵� : ");
				int s=intcheck.checkk(scan.next());//�������� �ƴ��� Ȯ���� ��
				String c=String.valueOf(s);//�ٽ� String���� Ÿ�� ��ȯ��
				searchValue=c; //searchValue�� ����.
				break;
			}else if(searchCondition.equals("�̸�")||searchCondition.equals("2")) {
				System.out.print("�˻��� �̸� : ");
				searchValue = scan.next();
				break;
			}else if(searchCondition.equals("�г���")||searchCondition.equals("3")) {
				System.out.print("�˻��� �г��� : ");
				searchValue=scan.next();
				break;
			}else if(searchCondition.equals("���")||searchCondition.equals("4")) {
				System.out.print("�˻��� ��� : ");
				searchValue=scan.next();
				break;
			}else {
				System.out.println("�ǹٸ� �˻��� ��Ź�帳�ϴ�.");
			}
		}
		//������ ���� �ΰ��̹Ƿ� ������ ���� �Ӽ����� ������ Ŭ���� ����
		SearchData searchData = new SearchData();
		searchData.setSearchCondition(searchCondition);	
		searchData.setSearchValue(searchValue);
		return searchData;
	}
	
	public void printSearchMember(Member member) {
		if(member == null) {
			System.out.println("�˻��� ����� �����ϴ�.");
		}else{
			System.out.println("���̵� : "+member.getId()+"�� �˻��� ��� ");
			System.out.println(member);
		}
	}
	public void printSearchMemberArray(Member[]memberArray) {
		if(memberArray.length==0) {
			System.out.println("�̸����� �˻��� ����� �����ϴ�.");
		}else {
			System.out.println("�̸����� �˻��� ��� ");
			for(int i=0;i<memberArray.length;i++) {
				System.out.println(memberArray[i]);
			}
		}
	}
	public void printSearchMemberArrayN(Member member) {
		if(member==null) {
			System.out.println("�г������� �˻��� ����� �����ϴ�.");
		}else {
			System.out.println("�г��� : "+member.getNick()+"���� �˻��� ���");
			System.out.println(member);
		}
	}
	public void printSearchMemberArrayH(Member[]memberArray) {
		if(memberArray.length==0) {
			System.out.println("��̷� �˻��� ����� �����ϴ�.");
		}else {
			System.out.println("��̷� �˻��� ���");
			for(int i=0;i<memberArray.length;i++) {
				System.out.println(memberArray[i]);
			}
		}
	}
}