import java.util.Scanner;

class Dictionary{
	private static String[] kor= {"���","�Ʊ�","��","�̷�","���"};
	private static String[] eng= {"love","baby","money","future","hope"};
	
	public static String kor2Eng(String word) {	//���ڿ��� �Ű��������ϴ� kor2Eng�Լ� ����
		for(int i=0; i < kor.length;i++) {		//kor�� ���̸�ŭ i �ݺ� <<<kor�� �ش� Ŭ������ static �迭�̹Ƿ� this���ʿ�
			if(word.equals(kor[i])) {			//�Ű����� word�� kor�迭�� i��°�� ���ٸ�
				return eng[i];					//eng�迭�� i��°�� ������ <<<eng�� �ش�Ŭ������ static �迭�̹Ƿ� this���ʿ�
			}
		}return null;
	}
}
public class DicApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("5��¥�� �ܾ� �˻� �����Դϴ�.");
		while(true) {	
			System.out.print("�ѱ�?>>");		//����ڷκ��� ���ڿ� �Է¹���
				String word=scan.next();	//word�� ����
				Dictionary.kor2Eng(word);	//�ش� word�� kor2eng�Լ� ȣ�� <<< static�� class�� �̸����� ȣ�Ⱑ��
				if(word.equals("�׸�"))		//�Է¹��� word�� �׸��̶��
					break;					//Ż��
				if(Dictionary.kor2Eng(word)==null)	//�� kor2eng�Լ��� null�� return�ϸ� 
					System.out.println("�� ������ ������");	//������ ���
				else								//���ǰ�� <<null�� �ƴ϶��  eng[i]�� �����������°���
					System.out.println(word+"��"+Dictionary.kor2Eng(word)+"�Դϴ�");//word�� �Լ�(word)�Դϴ� ���.
					
		}
		scan.close();
	}

}
