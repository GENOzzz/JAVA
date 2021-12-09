package buffer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringString {
	Scanner sc=new Scanner(System.in);
	private StringBuffer s;
	
	StringString(){}
	StringString(String s) {this.s=new StringBuffer(s);}

	public StringBuffer getS() {return s;}

	public void setS(String s) {this.s = new StringBuffer(s);}
	
	public void serchString(String search) {
		StringTokenizer st= new StringTokenizer(search,"!");
		if(st.countTokens()<=1) {
			System.out.println("잘못된 명령입니다 !");
		}else {
			StringTokenizer old=new StringTokenizer(s," ");
			
		}
	}
	
}
