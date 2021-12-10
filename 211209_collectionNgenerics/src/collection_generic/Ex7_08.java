package collection_generic;
import java.util.*;

public class Ex7_08 {
	static void printList(LinkedList<String>l) {//LinkedList<String>l를 매개변수로 받는 printList()메소드
		Iterator<String> iterator = l.iterator();
		while(iterator.hasNext()){
			String e = iterator.next();
			String separator;
			if(iterator.hasNext())
				separator="->";//마지막 요소가 아니라면 separator에 "->" 저장
			else
				separator="\n";
			System.out.println(e+separator);
		}
	}
	
	
	public static void main(String[] args) {
		LinkedList<String> myList=new LinkedList<String>();//빈리스트 생성
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0,"터터미네이터");//앞에 정수는 해당 문자열이 들어갈 index
		myList.add(2,"아바타");
		
		Collections.sort(myList);//요소 오름차순 정렬
		printList(myList);
		
		Collections.reverse(myList);
		printList(myList);
		
		int index=Collections.binarySearch(myList, "아바타");
		System.out.println("아바타는 "+index+"번째 요소입니다.");
	}

}
