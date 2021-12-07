package svc;

import java.util.Scanner;

import ui.MemberUI;
import vo.Member;

public class MemberSearchService {
	Scanner scan=new Scanner(System.in);
	public Member searchMemberById(String searchValue) {
		Member member=null;
			for(int i=0;i<MemberUI.memberArray.length;i++) {//ȸ�� ���� ��ŭ �ݺ�
				if(MemberUI.memberArray[i].getId()==Integer.parseInt(searchValue)) {
					member=MemberUI.memberArray[i];//�Է¹��� ȸ���� ID�� ������ ID�� ������
					break;
				}
			}
		return member;//�ش� ��� ����
	}
	public Member searchMemberByNick(String searchValue) {
		Member member=null;
		for(int i=0;i<MemberUI.memberArray.length;i++) {
			if(MemberUI.memberArray[i].getNick().equals(searchValue)) {
				member=MemberUI.memberArray[i];//�Է¹��� ȸ���� Nick�� ������ Nick�� ������
				break;
			}
		}
		return member;//�ش� ��� ����
	}
	public Member[] searchMemberByName(String searchValue) {
		Member[]searchMemberArray=null;
		int count=0;//�ߺ��Ǵ� ȸ���� count
		Member[]tempArray=new Member[MemberUI.memberArray.length];
		for(int i=0;i<MemberUI.memberArray.length;i++) {
			if(searchValue.equals(MemberUI.memberArray[i].getName())) {
				tempArray[count++]=MemberUI.memberArray[i];//������ �̸��� ȸ���� temp�迭�� ����
			}
		}
		searchMemberArray=new Member[count];//temp�迭�� ũ�⸸ŭ �迭ũ�� ����
		for(int i=0;i<count;i++) {
			searchMemberArray[i]=tempArray[i];//temp�迭�� ������ִ� ȸ�� ����.
		}
		return searchMemberArray;//�ش� �迭 ����.
	}
	
	public Member[] searchMemberByHobby(String searchValue) {
		Member[]searchMemberArray=null;
		int count=0;
		Member[]tempArray=new Member[MemberUI.memberArray.length];
		for(int i=0;i<MemberUI.memberArray.length;i++) {
			if(searchValue.equals(MemberUI.memberArray[i].getHobby())) {
				tempArray[count++]=MemberUI.memberArray[i];//������ ����� ȸ������ temp�� ����
			}
		}
		searchMemberArray=new Member[count];
		for(int i=0;i<count;i++) {
			searchMemberArray[i]=tempArray[i];//temp�迭�� ����Ǿ��ִ� ȸ�� ����
		}
		return searchMemberArray;
	}
}