package chapter9_Ex;

import javax.swing.*;

public class Ex_01 extends JFrame{
	public Ex_01() {
		super("300x200!!");//JFrame("타이틀 문자열") 생성자를 호출하여 타이틀 달기.
		setTitle("300x200 스윙 프레임 만들기");//프레임 타이틀 설정
		setSize(300,200);//프레임 크기 설정
		setVisible(true);//프레임 출력
	}
	public static void main(String[] args) {
		Ex_01 frame=new Ex_01();

	}

}
