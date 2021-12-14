package chapter8_Ex;
import java.io.*;

public class Ex8_05 {

	public static void main(String[] args) {
		byte b[]= {7,51,3,4,-1,24,-1,21,11,-123,42};
		
		try {
			FileOutputStream fout=new FileOutputStream("c:\\Users\\test.txt");
			for(int i=0;i<b.length;i++)								//마지막 파일은 자동생성 폴더(경로)는 기존에 있어야함.
				fout.write(b[i]);//배열b의 바이너리를 그대로 기록.
			fout.close();
		}catch(IOException e) {
			System.out.println("e:/school/geno/JAVA/211214_chapter8/test3.txt에 저장할 수 없었습니다. 경로명을 확인해 주세요");
			return;
		}
		System.out.println("e:/school/geno/JAVA/211214_chapter8/test3.txt에 저장하였습니다.");
	}

}
