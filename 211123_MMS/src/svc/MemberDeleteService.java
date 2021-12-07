package svc;
import ui.MemberUI;
import vo.Member;
public class MemberDeleteService {
	public boolean deleteMember(int id) {
		boolean deleteSuccess=false;
		int index=-1;
		
		for(int i=0;i<MemberUI.memberArray.length;i++) {
			if(MemberUI.memberArray[i].getId()==id) {
				index=i;
			}
		}
		if(index != -1) {//삭제될 회원 객체를 찾았다.
			Member[]tempArray=MemberUI.memberArray;
			MemberUI.memberArray=new Member[MemberUI.memberArray.length-1];
			for(int i=0;i<tempArray.length;i++) {
				if(i<index) {//찾은 인덱스 값과 비교한다.
					MemberUI.memberArray[i]=tempArray[i];					
				}
				else if(i>index) {//삭제된곳보다 뒤쪽에 위치한 객체들은 자리를 한칸씩 앞으로 당김.
					MemberUI.memberArray[i-1]=tempArray[i];
				}
			}
			deleteSuccess=true;
		}else {
			System.out.println("해당 아이디의 회원이 없습니다.");
		}
		return deleteSuccess;
	}
}
