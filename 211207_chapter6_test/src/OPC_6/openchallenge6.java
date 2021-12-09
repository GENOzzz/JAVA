package OPC_6;

import java.util.Scanner;

public class openchallenge6 {
	static void histogram(String st) {
		for(int j='A';j<='Z';j++) {//아스키 코드로 for문 반복
			System.out.print((char)j+" : ");//반복되는 j를 char로 변경
			for(int i=0;i<st.length();i++) {//입력받은 st만큼 for문 반복
				char is=st.charAt(i); //char형 is에 st의 i번째를 저장
				if(is==j||is==j+32)//is와 j를 비교 대문자와 소문자의 아스키 코드값 차이는 32
					System.out.print("-");//같으면 -출력
			}
			System.out.println("");
		}
	}

	static String readString() {
		StringBuffer sb=new StringBuffer();//키 입력을 받을 스트링버퍼생성
		Scanner sc=new Scanner(System.in);
		while(true) {
			String line = sc.nextLine();//텍스트 한라인을 읽는다
			if(line.equals(";"))//;만 있는 라인이면
				break;//입력끝
			sb.append(line);//읽은 라인 문자열을 스트링버퍼에 추가		
		}
		sc.close();
		return sb.toString();//스트링버퍼의 문자열을 스트링으로 리턴
	}
	
	public static void main(String[] args) {
		System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
		String st = readString();
		histogram(st);
	}

}
