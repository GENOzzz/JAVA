package chapter13_Ex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyLabel extends JLabel{
	private int barSize=0;//현재 그려져야할 바의 크기
	private int maxBarSize;//바의 최대 크기
	
	public MyLabel(int maxBarSize) {
		this.maxBarSize=maxBarSize;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.magenta);
		int width=(int)(((double)(this.getWidth()))/maxBarSize*barSize);
		if(width==0)return;//크기가 0이라 바를 그릴 필요 X
		g.fillRect(0,0,width,this.getHeight());
	}
	synchronized public void fill() {
		if(barSize==maxBarSize) {
			try {
				wait();//바가 최대이면,ComsumerThread에 의해 바가 줄어들 때까지 대기
			}catch(InterruptedException e) {return;}
		}
		barSize++;
		repaint();//바의 크기가 변했으니 다시 그리기
		notify();//기다리는 ConsumerThread 깨우기
	}
	synchronized public void consume() {
		if(barSize==0) {
			try {
				wait();//바의 크기가 0이면 0보다 커질때 까지 대기
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
				bar.consume();//0.2초마다 consume()
			}catch(InterruptedException e) {return;}
		}
	}
}

public class Ex_07 extends JFrame{
	private MyLabel bar=new MyLabel(100);//최대크기 설정

	public Ex_07(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);
		bar.setBackground(Color.orange);
		bar.setOpaque(true);
		bar.setLocation(20,50);
		bar.setSize(300,20);//바크기 설정
		c.add(bar);
		
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				bar.fill();
			}
		});
		setSize(350,200);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();//컨텐트팬에게 키 처리권 부여
		ConsumerThread th = new ConsumerThread(bar);//스레드생성
		th.start();
	}
	public static void main(String[] args) {
		new Ex_07("아무키나 눌러 바채우기");

	}

}
