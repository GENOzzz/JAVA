package chapter13_Ex;

public class Ex_04 {	
	public static void main(String[] args) {
		long id = Thread.currentThread().getId();//������ ID ���
		String name=Thread.currentThread().getName();//������ name���
		int priority=Thread.currentThread().getPriority();//������ �켱������ ���
		Thread.State s = Thread.currentThread().getState();//������ ���� �� ���
		
		System.out.println("���� ������ �̸� = "+name);
		System.out.println("���� ������ ID = "+id);
		System.out.println("���� ������ �켱���� �� = "+priority);	
		System.out.println("���� ������ ���� ="+s);

	}

}
