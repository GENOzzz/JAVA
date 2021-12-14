package chapter8_Ex;
import java.io.*;

public class Ex8_06 {
	public static void main(String[] args) {
		byte b[]=new byte[11];//비어있는 byte배열
		String file="e:/school/geno/JAVA/211214_chapter8/test3.txt";
		try {
			//"e:/school/geno/JAVA/211214_chapter8/test3.txt"파일을 읽어 b에 저장
			FileInputStream fin = new FileInputStream(file);
			int n=0,c;
			while((c=fin.read())!=-1) {//-1은 파일 끝(EOF)
				b[n]=(byte)c;//읽은 바이트를 배열에 저장.
				n++;
			}
			//b에 저장된 모든 값을 화면에 출력
			System.out.println(file+" 에서 읽은 배열을 출력합니다.");
			for(int i=0;i<b.length;i++)
				System.out.print(b[i]+" ");
			System.out.println();
			fin.close();
		}catch(IOException e) {
			System.out.println(file+"에서 읽지 못했습니다. 경로명을 확인해 주세요.");
		}

	}

}
