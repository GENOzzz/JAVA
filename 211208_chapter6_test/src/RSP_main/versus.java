package RSP_main;

public class versus {
	private human human = new human();
	private com com=new com();
	public void versuss(human human,com com) {
		this.human=human;
		this.com=com;
		if(com.equals(human))System.out.println("�����ϴ�.");
		else {
			if(human.getHand().equals("����")) {
				if(com.getHand().equals("��")) {
					System.out.println(human.getName()+"(��)�� �̰���ϴ�.");
				}else {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}
			}else if(human.getHand().equals("����")) {
				if(com.getHand().equals("����")) {
					System.out.println(human.getName()+"(��)�� �̰���ϴ�.");
				}else {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}
			}else {
				if(com.getHand().equals("����")) {
					System.out.println(human.getName()+"(��)�� �̰���ϴ�.");
				}else {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}
			}
		}
	}
}
