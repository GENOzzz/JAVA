package chapter8_Ex;
import java.io.*;
import java.util.*;

public class Ex8_04 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		FileWriter fout=null;
		int c;
		try {
			fout=new FileWriter("e:/school/geno/JAVA/211214_chapter8/test2.txt");//파일과 연결된 출력문자 스트림 생성
			while(true) {
				String line = sc.nextLine();//빈칸을 포함하여 한줄 읽기>>line에 \n미포함.
				if(line.length()==0)//다른입력없이 enter키만 입력한경우
					break;
				fout.write(line,0,line.length());//읽은 문자열을 파일에 저장<<line에 저장된 문자열중에 0번째부터 line.length()만큼
				fout.write("\r\n",0,2);
			}
			fout.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
		sc.close();
	}
}

