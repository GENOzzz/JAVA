package action;

import java.util.Scanner;
import svc.MemberSearchService;
import util.ConsoleUtil;
import vo.Member;
import vo.SearchData;

public class MemberSearchAction implements Action{
	boolean reset=false; //while문 반복을 위한 reset 선언.
	@Override
	public void execute(Scanner scan) throws Exception{
		ConsoleUtil consoleUtil=new ConsoleUtil();
		SearchData searchData=consoleUtil.getSearchData(scan);//입력받은 아이디,닉,이름,취미를 저장하고 있음.
		Member member=null;			//member를 null로 들고오면 다시 서치하기위해 미리 선언
		Member[]memberArray= new Member[0];//이하동문
		MemberSearchService memberSearchService = new MemberSearchService();
		while(!reset) {
			if(searchData.getSearchCondition().equals("아이디")||searchData.getSearchCondition().equals("1")) {
				member = memberSearchService.searchMemberById(searchData.getSearchValue());
				consoleUtil.printSearchMember(member);
			}else if(searchData.getSearchCondition().equals("닉네임")||searchData.getSearchCondition().equals("3")) {
				member=memberSearchService.searchMemberByNick(searchData.getSearchValue());
				consoleUtil.printSearchMemberArrayN(member);
			}else if(searchData.getSearchCondition().equals("이름")||searchData.getSearchCondition().equals("2")) {
				memberArray = memberSearchService.searchMemberByName(searchData.getSearchValue());
				consoleUtil.printSearchMemberArray(memberArray);
			}else if(searchData.getSearchCondition().equals("취미")||searchData.getSearchCondition().equals("4")) {
				memberArray=memberSearchService.searchMemberByHobby(searchData.getSearchValue());
				consoleUtil.printSearchMemberArrayH(memberArray);
			}
			reset=true;//위 조건에서 빠져나오면 reset을 true로
			if(member==null&&memberArray.length==0) {//근데 멤버와 배열 모두 비었을경우(조건에 해당하는 객체가 없을경우).
				reset=false;	//reset을 다시 false로 변경
				System.out.print(searchData.getSearchCondition()+" 재입력 부탁드립니다. : ");
				searchData.setSearchValue(scan.next());//사용자로부터 재입력 받아 while 재실행
			}
		}
	}
}
