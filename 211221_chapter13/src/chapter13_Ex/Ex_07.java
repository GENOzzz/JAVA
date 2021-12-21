package chapter13_Ex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyLabel extends JLabel{
	private int barSize=0;//���� �׷������� ���� ũ��
	private int maxBarSize;//���� �ִ� ũ��
	
	public MyLabel(int maxBarSize) {
		this.maxBarSize=maxBarSize;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.magenta);
		int width=(int)(((double)(this.getWidth()))/maxBarSize*barSize);
		if(width==0)return;//ũ�Ⱑ 0�̶� �ٸ� �׸� �ʿ� X
		g.fillRect(0,0,width,this.getHeight());
	}
	synchronized public void fill() {
		if(barSize==maxBarSize) {
			try {
				wait();//�ٰ� �ִ��̸�,ComsumerThread�� ���� �ٰ� �پ�� ������ ���
			}catch(InterruptedException e) {return;}
		}
		barSize++;
		repaint();//���� ũ�Ⱑ �������� �ٽ� �׸���
		notify();//��ٸ��� ConsumerThread �����
	}
	synchronized public void consume() {
		if(barSize==0) {
			try {
				wait();//���� ũ�Ⱑ 0�̸� 0���� Ŀ���� ���� ���
			}catch(InterruptedException e) {return;}
		}
		barSize--;
		repaint();
		notify();
	}
	
}

class ConsumerThread extends Thread{
	private MyLabel bar;
	public ConsumerThread(MyLabel bar) {
		this.bar=bar;
	}
	public void run() {
		while(true) {
			try {
				sleep(50);
				bar.consume();//0.2�ʸ��� consume()
			}catch(InterruptedException e) {return;}
		}
	}
}

public class Ex_07 extends JFrame{
	private MyLabel bar=new MyLabel(100);//�ִ�ũ�� ����

	public Ex_07(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);
		bar.setBackground(Color.orange);
		bar.setOpaque(true);
		bar.setLocation(20,50);
		bar.setSize(300,20);//��ũ�� ����
		c.add(bar);
		
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				bar.fill();
			}
		});
		setSize(350,200);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();//����Ʈ�ҿ��� Ű ó���� �ο�
		ConsumerThread th = new ConsumerThread(bar);//���������
		th.start();
	}
	public static void main(String[] args) {
		new Ex_07("�ƹ�Ű�� ���� ��ä���");

	}

}
