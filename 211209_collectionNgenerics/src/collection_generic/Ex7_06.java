package collection_generic;

import java.util.*;

public class Ex7_06 {

	public static void main(String[] args) {
		//�̸��� ������ ������ HashMap �÷��� ����
		HashMap<String,Integer> scoreMap=new HashMap<String,Integer>();
		//5���� ���� ����
		scoreMap.put("�輺��", 97);
		scoreMap.put("Ȳ����", 88);
		scoreMap.put("�賲��", 98);
		scoreMap.put("���繮", 70);
		scoreMap.put("�ѿ���", 99);
		
		System.out.println("HashMap�� ��� ���� : "+scoreMap.size());
		
		//��� ����� ���� ���. scoreMap�� ��� �ִ� ���(key,value) �� ���
		//Set <HashMap.key�ǵ�����Ÿ��> ���۷��� = HashMap.keySet()
		Set <String> keys = scoreMap.keySet();//Set�÷��ǿ� ���key���� keySet() : HashMap���� ��� key�� �̾ƿ��� �Լ�.
		//Iterator<Set�� ����� ������ Ÿ��> ���۷��� = Set.iterator()
		Iterator<String> it = keys.iterator();//Set�÷��ǿ� ������ �� �ִ� �˻��� Iterator ����.
		
		while(it.hasNext()) {//Iterator.hasNext() : �����Ҽ��ִ� ���� ��ü�� ������ true;
			String name=it.next();//Iterator.next() : ������ ��ü�� ����.
			int score=scoreMap.get(name);//���Ϲ��� key�� HashMap�� ����
			System.out.println(name + " : "+ score);
		}
		

	}

}
