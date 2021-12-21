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
	int n=0;//시간을 진행시키기위한 변수 n (쓰레드가 매번 재생성 되므로 필드변수로 선언)
	public Ex_05() {
		setTitle("ThreadInterruptEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel=new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
		
		//타이머 스레드로 사용할 Runnable객체 생성
		//타이머 값을 출력할 레이블 컴포넌트를 생성자에 전달
		//TimerRunnable runnable=new TimerRunnable(timerLabel);
		th = runn(timerLabel);//첫 스레드 생성
		c.add(timerLabel);
		
		//버튼을 생성하고 Action 리스너 등록 
		JButton btn =new JButton(KILL);
		btn.addActionListener(e-> {//버튼을 누를때 마다   new ActionListener()-> ActionEvent e만 오니까 람다식으로 함축 가능.
				if(btn.getText().equals(KILL)) {
					th.interrupt();//도는 쓰레드 사망
					e.getSource(); //어차피 btn.e라 다 삭제 가능
					btn.setText(LIVE);
				}else {
					btn.setText(KILL);
					th=runn(timerLabel);//새쓰레드 새생명
					th.start();
				}
		});
		c.add(btn);
		
		setSize(300,170);
		setVisible(true);
		th.start();
		
	}
	
	public Thread runn(JLabel timerLabel) { //Thread를 return해주는 함수 (Thread는 어차피 무조건 runnable만 받음.)
		return new Thread(()->{while(true) {//그래서 람다식으로 특정 가능
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
