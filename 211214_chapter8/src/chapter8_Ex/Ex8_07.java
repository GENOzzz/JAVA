package chapter8_Ex;

import java.io.*;
import java.util.Scanner;

public class Ex8_07 {
	public static void main(String[]args) {
		FileReader fin=null;
		FileReader fin2=null;
		int c,d;
		try {
			fin=new FileReader("e:/school/geno/JAVA/temp/test.txt");
			fin2=new FileReader("e:/school/geno/JAVA/temp/test2.txt");
			BufferedOutputStream out =new BufferedOutputStream(System.out,5);
			BufferedWriter out2=new BufferedWriter(new OutputStreamWriter(System.out),5);//왜 때문에...?
			while((c=fin.read())!=-1) {
				out.write(c);//fin파일 데이터를 모두 스크린에 출력.
			}
			//파일 데이터가 모두 출력된 상태
			new Scanner(System.in).nextLine();
			out.flush();
			System.out.println();
			
			System.out.println(fin2.getEncoding()); 
			while((d=fin2.read())!=-1) {
				out2.write(d);
			}
			new Scanner(System.in).nextLine();
			
			out2.flush();
			fin.close();
			fin2.close();
			out.close();
			out2.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
