package action;

import java.util.Scanner;
import svc.MemberSearchService;
import util.ConsoleUtil;
import vo.Member;
import vo.SearchData;

public class MemberSearchAction implements Action{
	boolean reset=false; //while�� �ݺ��� ���� reset ����.
	@Override
	public void execute(Scanner scan) throws Exception{
		ConsoleUtil consoleUtil=new ConsoleUtil();
		SearchData searchData=consoleUtil.getSearchData(scan);//�Է¹��� ���̵�,��,�̸�,��̸� �����ϰ� ����.
		Member member=null;			//member�� null�� ������� �ٽ� ��ġ�ϱ����� �̸� ����
		Member[]memberArray= new Member[0];//���ϵ���
		MemberSearchService memberSearchService = new MemberSearchService();
		while(!reset) {
			if(searchData.getSearchCondition().equals("���̵�")||searchData.getSearchCondition().equals("1")) {
				member = memberSearchService.searchMemberById(searchData.getSearchValue());
				consoleUtil.printSearchMember(member);
			}else if(searchData.getSearchCondition().equals("�г���")||searchData.getSearchCondition().equals("3")) {
				member=memberSearchService.searchMemberByNick(searchData.getSearchValue());
				consoleUtil.printSearchMemberArrayN(member);
			}else if(searchData.getSearchCondition().equals("�̸�")||searchData.getSearchCondition().equals("2")) {
				memberArray = memberSearchService.searchMemberByName(searchData.getSearchValue());
				consoleUtil.printSearchMemberArray(memberArray);
			}else if(searchData.getSearchCondition().equals("���")||searchData.getSearchCondition().equals("4")) {
				memberArray=memberSearchService.searchMemberByHobby(searchData.getSearchValue());
				consoleUtil.printSearchMemberArrayH(memberArray);
			}
			reset=true;//�� ���ǿ��� ���������� reset�� true��
			if(member==null&&memberArray.length==0) {//�ٵ� ����� �迭 ��� ��������(���ǿ� �ش��ϴ� ��ü�� �������).
				reset=false;	//reset�� �ٽ� false�� ����
				System.out.print(searchData.getSearchCondition()+" ���Է� ��Ź�帳�ϴ�. : ");
				searchData.setSearchValue(scan.next());//����ڷκ��� ���Է� �޾� while �����
			}
		}
	}
}