package chapter13_Ex;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

import javax.swing.*;

//class TimerRunnable implements Runnable{
//	private JLabel timerLabel;
//	
//	public TimerRunnable(JLabel timerLabel) {
//		this.timerLabel=timerLabel;
//	}
//	
//	@Override
//	public void run() {
//		while(true) {
//			timerLabel.setText(Integer.toString(n));
//			n++;
//			try {
//				Thread.sleep(1000);
//			}
//			catch(InterruptedException e) {
//				return;
//			}
//		}
//	}
//}

public class Ex_05 extends JFrame{
	Scanner sc = new Scanner (System.in);
	final String KILL=sc.next();
	final String LIVE="live Timer";
	private Thread th;
	int n=0;//�ð��� �����Ű������ ���� n (�����尡 �Ź� ����� �ǹǷ� �ʵ庯���� ����)
	public Ex_05() {
		setTitle("ThreadInterruptEx ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel=new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
		
		//Ÿ�̸� ������� ����� Runnable��ü ����
		//Ÿ�̸� ���� ����� ���̺� ������Ʈ�� �����ڿ� ����
		//TimerRunnable runnable=new TimerRunnable(timerLabel);
		th = runn(timerLabel);//ù ������ ����
		c.add(timerLabel);
		
		//��ư�� �����ϰ� Action ������ ��� 
		JButton btn =new JButton(KILL);
		btn.addActionListener(e-> {//��ư�� ������ ����   new ActionListener()-> ActionEvent e�� ���ϱ� ���ٽ����� ���� ����.
				if(btn.getText().equals(KILL)) {
					th.interrupt();//���� ������ ���
					e.getSource(); //������ btn.e�� �� ���� ����
					btn.setText(LIVE);
				}else {
					btn.setText(KILL);
					th=runn(timerLabel);//�������� ������
					th.start();
				}
		});
		c.add(btn);
		
		setSize(300,170);
		setVisible(true);
		th.start();
		
	}
	
	public Thread runn(JLabel timerLabel) { //Thread�� return���ִ� �Լ� (Thread�� ������ ������ runnable�� ����.)
		return new Thread(()->{while(true) {//�׷��� ���ٽ����� Ư�� ����
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return;
			}
		}
		});
	}
	public static void main(String[] args) {
		new Ex_05();
	}

}
