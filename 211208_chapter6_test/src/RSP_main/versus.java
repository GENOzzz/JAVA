package RSP_main;

public class versus {
	private human human = new human();
	private com com=new com();
	public void versuss(human human,com com) {
		this.human=human;
		this.com=com;
		if(com.equals(human))System.out.println("비겼습니다.");
		else {
			if(human.getHand().equals("가위")) {
				if(com.getHand().equals("보")) {
					System.out.println(human.getName()+"(이)가 이겼습니다.");
				}else {
					System.out.println("컴퓨터가 이겼습니다.");
				}
			}else if(human.getHand().equals("바위")) {
				if(com.getHand().equals("가위")) {
					System.out.println(human.getName()+"(이)가 이겼습니다.");
				}else {
					System.out.println("컴퓨터가 이겼습니다.");
				}
			}else {
				if(com.getHand().equals("바위")) {
					System.out.println(human.getName()+"(이)가 이겼습니다.");
				}else {
					System.out.println("컴퓨터가 이겼습니다.");
				}
			}
		}
	}
}
