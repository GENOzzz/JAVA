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
			System.out.println("@@@@@@@회원 데이터 관리@@@@@@@");
			System.out.println("1.회원가입");//C(Create)
			System.out.println("2.회원 목록 보기");//R(Read)
			System.out.println("3.회원 정보 수정");//U(Update)
			System.out.println("4.회원 정보 삭제");//D(Delete)
			System.out.println("5.회원 정보 검색");//R(Read)
			System.out.println("6.프로그램 종료");
			
			System.out.print("메뉴 번호 : ");
			switch(sc.next()) {
			case "1":
				action=new MemberRegistAction();
				break;
			case "2":
				if(memberArray.length==0) {
					System.out.println("현재 회원목록이 없습니다.");
					break;
				}
				action=new MemberListAction();
				break;
			case "3":
				if(memberArray.length==0) {
					System.out.println("현재 회원목록이 없습니다.");
					break;
				}
				action=new MemberUpdateAction();
				break;
			case "4":
				if(memberArray.length==0) {
					System.out.println("현재 회원목록이 없습니다.");
					break;
				}
				action=new MemberDeleteAction();
				break;
			case "5":
				if(memberArray.length==0) {
					System.out.println("현재 회원목록이 없습니다.");
					break;
				}
				action=new MemberSearchAction();
				break;
			case "6":
				stop=true;
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("1~6 까지의 숫자만 입력이 가능합니다.");
				break;
			}
			if(action !=null) {
				memberController.processRequest(sc,action);
			}
		}while(!stop);
		sc=null;
	}
}
