package pack211116;

abstract class PairMap{
	protected String keyArray[]; //key들을 저장하는 배열
	protected String valueArray[];//value들을 저장하는 배열
	abstract String get(String key);//key값을 가진 value리턴,없으면 null리턴
	abstract void put(String key,String value);//key와 value를 쌍으로 저장. 
											   //기존에 key가 있으면, 값을 value로 수정.
	abstract String delete(String key);//key 값을 가진 아이템(value와 함께) 삭제.
										//삭제된 value 값 리턴
	abstract int length();//현재 저장된 아이템의 개수 리턴
}

class Dictionary extends PairMap{ //PairMap추상클래스를 상속받은 Dictionary선언
	int len;	//후에 길이를 저장하기위해 int len선언
	
	Dictionary(int a){	//정수 a를 받는 Dictionary생성자 선언
		this.keyArray=new String[a];//keyArray,valueArray의 크기는 a
		this.valueArray=new String[a];
		this.len=a;	//a를 len에 저장
	}
	
	public String get(String key) {				//key값을 입력받으면 keyArray에서 key값의 위치를 찾고
		String S = null;//value값을 저장받기위한 S 	//valueArray에서 해당하는 위치의 value값을 리턴 
		for(int i=0;i<len;i++) {
			if(keyArray[i]==null||keyArray[i]!=key) {//반복하면서 null이거나 key값이 keyArray의 i번째에 없으면 for로 돌아감
				continue;
			}
			else if(keyArray[i].equals(key)) {	//keyArray의 i번째에 입력받은 key와 값이 같다면
				S=valueArray[i];				//valueArray의 i번째 S에 저장받고
				break;	
			}
		}return S;	//S 리턴
	}
	
	public void put(String key,String value) {//keyArray와 valueArray에 
		for(int i=0;i<len;i++) {			  //입력받은 key와 value값을 각각 저장하는 함수 put()
			if(keyArray[i]==null) {	//만약 자리가 비어있다면
				keyArray[i]=key;	//각 배열의 위치에 key와 value저장
				valueArray[i]=value;
				break;
			}else if(keyArray[i].equals(key)) {//만약 key값이 같은 내용이 들어온다면
				valueArray[i]=value;		   //해당 위치의 valueArray의 value값을 새로 받은 value로 저장
				break;
			}
		}
	}

	public String delete(String key) {	//key를 입력받아 keyArray와 valueArray에 해당하는 값을 지우는 delete
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
	
	public int length() {	//keyArray에 값이 얼마나 저장되어있는지 리턴해주는 함수 length()
		int z=0;			//valueArray도 keyArray와 동일한 위치에 값이 저장되므로 하나로 통일.
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
		dic.put("황기태", "자바");
		dic.put("이재문", "파이썬");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 "+dic.get("이재문"));
		System.out.println("황기태의 값은 "+dic.get("황기태"));
		System.out.println(dic.length()); 
		dic.delete("황기태");
		System.out.println("황기태의 값은 "+dic.get("황기태"));
		System.out.println(dic.length());
	}
}