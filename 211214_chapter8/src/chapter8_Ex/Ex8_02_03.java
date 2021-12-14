package chapter8_Ex;
import java.io.*;
public class Ex8_02_03 {

	public static void main(String[] args) {
		String fileload="e:/school/geno/java/211214_chapter8/hangul.txt";
		InputStreamReader in =null;
		FileInputStream fin=null;
		try {
			fin=new FileInputStream(fileload);//변수로도 가능.
			in = new InputStreamReader(fin,"UTF-8");//올바른 문자 집합 지정
			int c;								 	//저장된 텍스트의 인코딩으로 가져와야함.
			
			System.out.println("인코딩 문자 집합은 "+in.getEncoding());
			while((c=in.read())!=-1) {
				System.out.print((char)c);
			}
			System.out.println("");
			
			fin=new FileInputStream(fileload);//read하고 나면 비어버림;
			in=new InputStreamReader(fin,"MS949");
			int d;
			System.out.println("인코딩 문자 집합은"+in.getEncoding());
			while((d=in.read())!=-1) {
				System.out.print((char)d);//해당 파일은 utf8로 쓰였기 때문에 오류발생.
			}
			in.close();
			fin.close();
		}catch (IOException e) {
			System.out.println("입출력 오류 !");	
		}

	}

}
