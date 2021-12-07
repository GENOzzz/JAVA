package action;

import java.util.Scanner;
import svc.MemberListService;
import util.ConsoleUtil;
import vo.Member;

public class MemberListAction implements Action{
	@Override
	public void execute(Scanner scan){
		ConsoleUtil consoleUtil=new ConsoleUtil();
		MemberListService memberListService = new MemberListService();
		Member [] memberArray = memberListService.getMemberArray();//저장된 배열을 가져온다.
		consoleUtil.printMemberList(memberArray);
	}
}
