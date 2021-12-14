package chapter8_Ex;

import java.io.*;

public class Ex8_10 {
	public static void main(String[] args) {
		File src = new File("e:/school/geno/JAVA/test3/charmander.jfif");//원본파일경로
		File dest= new File("e:/school/geno/JAVA/temp/copy1.jfif");//복사본 경로
		
		int c;
		
		try {
			FileInputStream fi=new FileInputStream(src);//파일 입력 바이트 스트림 생성
			FileOutputStream fo=new FileOutputStream(dest);//파일 출력 바이트 스트림 생성
			
			while((c=fi.read())!=-1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath()+"를 "+dest.getPath()+"로 복사하였습니다.");
		}catch(IOException e) {
			System.out.println("파일 복사 오류");
		}
	}

}
