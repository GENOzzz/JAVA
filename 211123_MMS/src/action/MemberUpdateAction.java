package action;

import java.util.Scanner;
import svc.MemberUpdateService;
import util.ConsoleUtil;
import vo.Member;

public class MemberUpdateAction implements Action{
	@Override
	public void execute(Scanner scan) {
		ConsoleUtil consoleUtil = new ConsoleUtil();
		int id = consoleUtil.getId("¼öÁ¤ÇÒ",scan);
		MemberUpdateService memberUpdateService=new MemberUpdateService();
		Member oldMember = memberUpdateService.getOldMember(id);
		Member newMember = consoleUtil.getNewMember(oldMember,scan);
		boolean updateSuccess=memberUpdateService.updateMember(newMember);
		if(updateSuccess) {
			consoleUtil.printUpdateSuccessMessage(newMember.getId());
		}else {
			consoleUtil.printUpdateFailMessage(newMember.getId());
		}
	}
}
