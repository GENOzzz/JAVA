package chapter6_1207;

public class Ex6_10 {

	public static void main(String[] args) {
		double a=Math.PI;
		System.out.println(Math.PI);//원주율 상수 출력
		System.out.println(Math.ceil(a));//ceil(올림)
		System.out.println(Math.floor(a));//floor(내림)
		System.out.println(Math.sqrt(9));//제곱근
		System.out.println(Math.exp(2));//e의 2승
										//e = 약2.71828182846
		System.out.println(Math.round(3.14));//반올림
		
		//[1,45]사이의 정수형 난수 5개 발생
		System.out.print("이번주 행운의 번호는 ");
		int rotto[]=new int [6];
		for(int i=0;i<6;i++) {
			rotto[i]=(int)(Math.random()*45+1);
			if(i>1&&rotto[i-1]==rotto[i]) {
				i--;
			}
//			if(i==5)
//				System.out.println("추가번호 : "+(int)(Math.random()*45+1));
//			else
//				System.out.print((int)(Math.random()*45+1)+" ");	
		}
		System.out.println(java.util.Arrays.toString(rotto));

	}

}
