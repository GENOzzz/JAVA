package svc;

import ui.MemberUI;
import vo.Member;

public class MemberRegistService {
	public boolean registMember(Member newMember) throws Exception{
		boolean registSuccess=true;
		for(int i=0;i<MemberUI.memberArray.length;i++) {
			if(MemberUI.memberArray[i].getId()==newMember.getId()) {
				System.out.println(newMember.getId()+"�� �̹� �����ϴ� ���̵��Դϴ�.");
				registSuccess=false;
				break;
			}else if(MemberUI.memberArray[i].getNick().equals(newMember.getNick())) {
				System.out.println(newMember.getId()+"�� �̹� �����ϴ� �г����Դϴ�.");
				registSuccess=false;
				break;
			}
		}
		if(registSuccess) {
			Member [] tempArray = MemberUI.memberArray;
			MemberUI.memberArray = new Member[MemberUI.memberArray.length+1];
			for(int i=0;i<tempArray.length;i++) {
				MemberUI.memberArray[i]=tempArray[i];
			}
			MemberUI.memberArray[MemberUI.memberArray.length-1]=newMember;
		}
		return registSuccess;
	}
}
