package chapter13_Ex;

import java.awt.*;
import javax.swing.*;

class TimerRunnable2 implements Runnable{
	private JLabel timerLabel;//Ÿ�̸� ���� ��µ� ���̺�
	
	public TimerRunnable2(JLabel timerLabel) {
		this.timerLabel=timerLabel;//ī��Ʈ�� ����� ���̺�
	}
	
	//������ �ڵ�
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


public class Ex_02 extends JFrame {

	public Ex_02() {
		setTitle("Runnable�� ������ Ÿ�̸� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		//Ÿ�̸� ���� ����� ���̺� ����
		JLabel timerLabel=new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
		c.add(timerLabel);
		
		//Ÿ�̸� ������� ����� Runnable��ü ����. Ÿ�̸� ���� ����� ���̺��� �����ڿ� ����
		TimerRunnable2 runnable=new TimerRunnable2(timerLabel);
		Thread th = new Thread(runnable);
		
		setSize(250,150);
		setVisible(true);
		
		th.start();
	}
	
	public static void main(String[] args) {
		Ex_02 e1=new Ex_02();
		Ex_02 e2=new Ex_02();
		Ex_02 e3=new Ex_02();
		

	}

}
