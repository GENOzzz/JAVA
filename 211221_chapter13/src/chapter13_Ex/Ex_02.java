package chapter13_Ex;

import java.awt.*;
import javax.swing.*;

class TimerRunnable2 implements Runnable{
	private JLabel timerLabel;//타이머 값이 출력된 레이블
	
	public TimerRunnable2(JLabel timerLabel) {
		this.timerLabel=timerLabel;//카운트를 출력할 레이블
	}
	
	//스레드 코드
	public void run() {
		int n=0;//타이머 카운트값
		while(true) {
			timerLabel.setText(Integer.toString(n));//레이블에 카운트 값 출력
			n++;
			try {
				Thread.sleep(1000);//1초간 sleep
			}
			catch(InterruptedException e){
				return;//예외 발생시 스레드 종료.
			}
		}
	}
}


public class Ex_02 extends JFrame {

	public Ex_02() {
		setTitle("Runnable을 구현한 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		//타이머 값을 출력할 레이블 생성
		JLabel timerLabel=new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
		c.add(timerLabel);
		
		//타이머 스레드로 사용할 Runnable객체 생성. 타이머 값을 출력할 레이블을 생성자에 전달
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
