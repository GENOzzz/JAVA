package collection_generic;

import java.util.*;

public class Ex7_06 {

	public static void main(String[] args) {
		//이름과 점수를 저장할 HashMap 컬렉션 생성
		HashMap<String,Integer> scoreMap=new HashMap<String,Integer>();
		//5개의 점수 저장
		scoreMap.put("김성동", 97);
		scoreMap.put("황기태", 88);
		scoreMap.put("김남윤", 98);
		scoreMap.put("이재문", 70);
		scoreMap.put("한원선", 99);
		
		System.out.println("HashMap의 요소 개수 : "+scoreMap.size());
		
		//모든 사람의 점수 출력. scoreMap에 들어 있는 모든(key,value) 쌍 출력
		//Set <HashMap.key의데이터타입> 레퍼런스 = HashMap.keySet()
		Set <String> keys = scoreMap.keySet();//Set컬렉션에 모든key리턴 keySet() : HashMap에서 모든 key를 뽑아오는 함수.
		//Iterator<Set에 저장된 데이터 타입> 레퍼런스 = Set.iterator()
		Iterator<String> it = keys.iterator();//Set컬렉션에 접근할 수 있는 검색자 Iterator 리턴.
		
		while(it.hasNext()) {//Iterator.hasNext() : 접근할수있는 다음 객체가 있으면 true;
			String name=it.next();//Iterator.next() : 접근한 객체를 리턴.
			int score=scoreMap.get(name);//리턴받은 key로 HashMap에 접근
			System.out.println(name + " : "+ score);
		}
		

	}

}
