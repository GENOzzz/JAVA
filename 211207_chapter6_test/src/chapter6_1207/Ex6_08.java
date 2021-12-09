package chapter6_1207;

public class Ex6_08 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("This");
		
		sb.append(" is pencil");//문자열 덧붙이기
		System.out.println("문자열 덧붙이기 : "+sb);
		
		sb.insert(7, " my");//"문자열" 삽입
		System.out.println("문자열 삽입 : "+sb);
		
		sb.replace(8, 10, "your");//해당 인덱스의 문자열을 "새문자열"로 변경
		System.out.println("문자열 변경"+sb);
		
		sb.setLength(4);//스트링버퍼 내 문자열 길이 수정.
		System.out.println("스트링버퍼 문자열 길이 수정 : "+sb);
	}

}
