package chapter13_Ex;

import java.awt.*;
import javax.swing.*;

class FlickeringLabel extends JLabel implements Runnable{
	private long delay; //������ �ٲ�� �����ð�.
	
	public FlickeringLabel(String text, long delay) {
		super(text);
		this.delay=delay;
		setOpaque(true);
		
		Thread th = new Thread(this);
		th.start();
	}
	@Override
	public void run() {
		int n=0;
		while(true) {
			if(n==0)
				setBackground(Color.yellow);
			else
				setBackground(Color.green);
			if(n==0)n=1;
			else n=0;
			try {
				Thread.sleep(delay);
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}


public class Ex_03 extends JFrame{
	public Ex_03() {
		setTitle("��¦ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		FlickeringLabel fLabel= new FlickeringLabel("����",500);
		JLabel label=new JLabel("�ȱ���");
		FlickeringLabel fLabel2= new FlickeringLabel("���⵵ ����",300);
		
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
		
		setSize(300,150);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Ex_03();
	}

}
