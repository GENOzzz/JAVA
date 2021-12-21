package chapter13_Ex;

import java.awt.*;
import javax.swing.*;

class TimerThread extends Thread {
	private JLabel timerLabel;//Ÿ�̸� ���� ��µǴ� ���̺�
	
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel;//Ÿ�̸� ī��Ʈ�� ����� ���̺�
	}
	//������ �ڵ�. run()�� �����ϸ� ������ ����
	@Override
	public void run() {
		int n=0;//Ÿ�̸� ī��Ʈ��
		while(true) {
			timerLabel.setText(Integer.toString(n));//���̺� ī��Ʈ �� ���
			n++;
			try {
				Thread.sleep(1000);//1�ʰ� sleep
			}
			catch(InterruptedException e){
				return;//���� �߻��� ������ ����.
			}
		}
	}
}

public class Ex_01 extends JFrame{
	public Ex_01() {
		setTitle("Thread�� ��ӹ��� Ÿ�̸� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		//Ÿ�̸Ӱ��� ����� ���̺� ����
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gorthic",Font.ITALIC,80));
		c.add(timerLabel);//�����̳ʿ� ���̺� ����
		
		//Ÿ�̸� ������ ��ü ����.Ÿ�̸� ���� ����� ���̺��� �����ڿ� ����
		TimerThread th=new TimerThread(timerLabel);//������ ��ü ����
		
		setSize(300,170);
		setVisible(true);
		
		th.start();//Ÿ�̸� �������� ������ �����ϰ� �Ѵ�.
		
	}
	public static void main(String[] args) {
		Ex_01 n1=new Ex_01();
		Ex_01 n2=new Ex_01();
		Ex_01 n3=new Ex_01();

	}

}
