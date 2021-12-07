package ui;

import java.util.Scanner;

import action.Action;
import action.MemberDeleteAction;
import action.MemberListAction;
import action.MemberUpdateAction;
import action.MemberRegistAction;
import action.MemberSearchAction;
import controller.MemberController;
import vo.Member;

public class MemberUI {
	public static Member [] memberArray = new Member[0];
	
	public static void main(String[] args) {
		MemberController memberController = new MemberController();
		boolean stop = false;
		Scanner sc=new Scanner(System.in);
		do {
			Action action =  null;
			System.out.println("@@@@@@@ȸ�� ������ ����@@@@@@@");
			System.out.println("1.ȸ������");//C(Create)
			System.out.println("2.ȸ�� ��� ����");//R(Read)
			System.out.println("3.ȸ�� ���� ����");//U(Update)
			System.out.println("4.ȸ�� ���� ����");//D(Delete)
			System.out.println("5.ȸ�� ���� �˻�");//R(Read)
			System.out.println("6.���α׷� ����");
			
			System.out.print("�޴� ��ȣ : ");
			switch(sc.next()) {
			case "1":
				action=new MemberRegistAction();
				break;
			case "2":
				if(memberArray.length==0) {
					System.out.println("���� ȸ������� �����ϴ�.");
					break;
				}
				action=new MemberListAction();
				break;
			case "3":
				if(memberArray.length==0) {
					System.out.println("���� ȸ������� �����ϴ�.");
					break;
				}
				action=new MemberUpdateAction();
				break;
			case "4":
				if(memberArray.length==0) {
					System.out.println("���� ȸ������� �����ϴ�.");
					break;
				}
				action=new MemberDeleteAction();
				break;
			case "5":
				if(memberArray.length==0) {
					System.out.println("���� ȸ������� �����ϴ�.");
					break;
				}
				action=new MemberSearchAction();
				break;
			case "6":
				stop=true;
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default:
				System.out.println("1~6 ������ ���ڸ� �Է��� �����մϴ�.");
				break;
			}
			if(action !=null) {
				memberController.processRequest(sc,action);
			}
		}while(!stop);
		sc=null;
	}
}