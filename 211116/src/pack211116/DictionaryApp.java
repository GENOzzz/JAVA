package pack211116;

abstract class PairMap{
	protected String keyArray[]; //key���� �����ϴ� �迭
	protected String valueArray[];//value���� �����ϴ� �迭
	abstract String get(String key);//key���� ���� value����,������ null����
	abstract void put(String key,String value);//key�� value�� ������ ����. 
											   //������ key�� ������, ���� value�� ����.
	abstract String delete(String key);//key ���� ���� ������(value�� �Բ�) ����.
										//������ value �� ����
	abstract int length();//���� ����� �������� ���� ����
}

class Dictionary extends PairMap{ //PairMap�߻�Ŭ������ ��ӹ��� Dictionary����
	int len;	//�Ŀ� ���̸� �����ϱ����� int len����
	
	Dictionary(int a){	//���� a�� �޴� Dictionary������ ����
		this.keyArray=new String[a];//keyArray,valueArray�� ũ��� a
		this.valueArray=new String[a];
		this.len=a;	//a�� len�� ����
	}
	
	public String get(String key) {				//key���� �Է¹����� keyArray���� key���� ��ġ�� ã��
		String S = null;//value���� ����ޱ����� S 	//valueArray���� �ش��ϴ� ��ġ�� value���� ���� 
		for(int i=0;i<len;i++) {
			if(keyArray[i]==null||keyArray[i]!=key) {//�ݺ��ϸ鼭 null�̰ų� key���� keyArray�� i��°�� ������ for�� ���ư�
				continue;
			}
			else if(keyArray[i].equals(key)) {	//keyArray�� i��°�� �Է¹��� key�� ���� ���ٸ�
				S=valueArray[i];				//valueArray�� i��° S�� ����ް�
				break;	
			}
		}return S;	//S ����
	}
	
	public void put(String key,String value) {//keyArray�� valueArray�� 
		for(int i=0;i<len;i++) {			  //�Է¹��� key�� value���� ���� �����ϴ� �Լ� put()
			if(keyArray[i]==null) {	//���� �ڸ��� ����ִٸ�
				keyArray[i]=key;	//�� �迭�� ��ġ�� key�� value����
				valueArray[i]=value;
				break;
			}else if(keyArray[i].equals(key)) {//���� key���� ���� ������ ���´ٸ�
				valueArray[i]=value;		   //�ش� ��ġ�� valueArray�� value���� ���� ���� value�� ����
				break;
			}
		}
	}

	public String delete(String key) {	//key�� �Է¹޾� keyArray�� valueArray�� �ش��ϴ� ���� ����� delete
		String D=null;
		for(int i=0;i<len;i++) {
			if(keyArray[i]==null||keyArray[i]!=key) {
				continue;
			}
			else if(keyArray[i].equals(key)) {
				keyArray[i]=null;
				D = valueArray[i];
				valueArray[i]=null;
			}
		}return D;
	}
	
	public int length() {	//keyArray�� ���� �󸶳� ����Ǿ��ִ��� �������ִ� �Լ� length()
		int z=0;			//valueArray�� keyArray�� ������ ��ġ�� ���� ����ǹǷ� �ϳ��� ����.
		for(int i=0;i<len;i++) {
			if(keyArray[i]!=null) {
				z++;
			}else {
				continue;
			}
		}return z;
	}
}

public class DictionaryApp {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̽�");
		dic.put("���繮", "C++");
		System.out.println("���繮�� ���� "+dic.get("���繮"));
		System.out.println("Ȳ������ ���� "+dic.get("Ȳ����"));
		System.out.println(dic.length()); 
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� "+dic.get("Ȳ����"));
		System.out.println(dic.length());
	}
}