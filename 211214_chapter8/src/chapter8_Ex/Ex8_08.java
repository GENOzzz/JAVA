package chapter8_Ex;

import java.io.File;

public class Ex8_08 {
	public static void listDirectory(File dir) {
		System.out.println("----"+dir.getPath()+"의 서브리스트 입니다.----");
		
		File[] subFiles=dir.listFiles();//디렉토리에 포함된 파일과 디렉토리 이름의 리스트 얻기.
		
		for(int i=0;i<subFiles.length;i++) {//subFiles배열 각 file에 대해 루프
			File f=subFiles[i];
			long t=f.lastModified();//마지막으로 수정된 시간.
			System.out.print(f.getName());
			System.out.print("\t파일크기 : "+f.length());//파일크기
			System.out.printf("\t수정한 시간 : %tb %td %ta %tT\n",t,t,t,t);//포맷출력
			System.out.println(t);
		}
	}

	public static void main(String[] args) {
		File f1=new File("e:/school/geno/JAVA");
		System.out.println(f1.getPath()+", "+f1.getParent()+", "+f1.getName());
		
		String res="";
		if(f1.isFile()) res="파일";//파일 타입이라면
		else if(f1.isDirectory()) res="디렉토리";//디렉토리 타입이면.
		System.out.println(f1.getPath()+"은(는) "+res+"입니다.");
		
		File f2=new File("e:/school/geno/JAVA/test2");//새로 만들고자하는 디렉토리
		if(!f2.exists()) {//f2 디렉토리가 존재하는지 검사
			f2.mkdir();//존재하지 않으면 디렉토리 생성
		}
		
		listDirectory(new File("e:/school/geno/JAVA/"));//temp에 있는 파일 리스트 출력
		f2.renameTo(new File("e://school/geno/JAVA/test3"));//test2->test3로 이름변경
		listDirectory(new File("e:/school/geno/JAVA"));//변경후 리스트 출력
	}

}
