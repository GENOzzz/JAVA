package collection_generic;
import java.util.*;

public class Ex7_08 {
	static void printList(LinkedList<String>l) {//LinkedList<String>l�� �Ű������� �޴� printList()�޼ҵ�
		Iterator<String> iterator = l.iterator();
		while(iterator.hasNext()){
			String e = iterator.next();
			String separator;
			if(iterator.hasNext())
				separator="->";//������ ��Ұ� �ƴ϶�� separator�� "->" ����
			else
				separator="\n";
			System.out.println(e+separator);
		}
	}
	
	
	public static void main(String[] args) {
		LinkedList<String> myList=new LinkedList<String>();//�󸮽�Ʈ ����
		myList.add("Ʈ��������");
		myList.add("��Ÿ����");
		myList.add("��Ʈ����");
		myList.add(0,"���͹̳�����");//�տ� ������ �ش� ���ڿ��� �� index
		myList.add(2,"�ƹ�Ÿ");
		
		Collections.sort(myList);//��� �������� ����
		printList(myList);
		
		Collections.reverse(myList);
		printList(myList);
		
		int index=Collections.binarySearch(myList, "�ƹ�Ÿ");
		System.out.println("�ƹ�Ÿ�� "+index+"��° ����Դϴ�.");
	}

}
