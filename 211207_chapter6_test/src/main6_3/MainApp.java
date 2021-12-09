package main6_3;

import etc6_3.Calc;

public class MainApp extends Calc {

	public MainApp(int x, int y) {
		super(x, y);
	}

	public static void main(String[] args) {
		Calc c=new Calc(10,20);
		System.out.println(c.sum());
	}

}
