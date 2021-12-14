package chapter8_Ex;

import java.io.*;

public class Ex8_09 {

	public static void main(String[] args) {
		File src = new File("e:/school/geno/JAVA/temp/test.txt");//원본파일 경로명
		File dest = new File("e:/school/geno/JAVA/temp/test3.txt");//복사 파일 경로명
		int c;
		try {
			FileReader fr=new FileReader(src);//파일 입력 문자 스트림 생성
			FileWriter fw=new FileWriter(dest);//파일 출력 문자 스트림 생성
			while((c=fr.read())!=-1) {//문자 하나 읽고
				fw.write((char)c);//하나쓰고 //해당 방법은 파일이 큰경우 복사시간이 오래 걸린다.
			}
			fr.close();
			fw.close();
			System.out.println((src.getPath()+"를 \n"+dest.getPath()+"로 복사하였습니다."));
		}catch(IOException e) {
			System.out.println("파일 복사 오류");
		}
	}

}
