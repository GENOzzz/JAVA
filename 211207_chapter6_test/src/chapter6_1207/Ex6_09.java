package chapter6_1207;

import java.util.StringTokenizer;

public class Ex6_09 {

	public static void main(String[] args) {
															//구분자로 "/"사용
		StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐","/");
		
		while(st.hasMoreTokens())//토큰이 있는동안
			System.out.println(st.nextToken());//다음 토큰 출력
	}

}
