import java.util.Scanner;

class Player{								//Player Ŭ����
	 Scanner scan=new Scanner(System.in);
	  String name;							//name�� word�� ����.
	  String word;

	Player(String name){					//Player ������
		this.name=name;						//(name)�� ��ü.name�� ��.
	}
	
	public  void getWordFromUser(){			//Player Ŭ������ �Լ� getWordFromUser()
			System.out.print(this.name+">>");//����ڷκ��� �Է¹���
			String word=scan.nextLine();	 //�Է¹��� ���ڸ� word�� ����
			this.word=word;					//�ش�word �� ��ü.word����
		}
	
	public boolean checkSuccess(String WORD) {//Player Ŭ������ �Լ� checkSuccess()
		int last=WORD.length()-1;			  //���� last�� WORD�� ����-1��ŭ(�迭�� 0���� �����ϹǷ� �迭���ڸ����� �迭ũ��-1�̵�)
		char lastChar=WORD.charAt(last);	  //ĳ������ lastChar�� WORD�� ������ ����.
		char firstChar=this.word.charAt(0);	  //firstChar�� this.word�� ù����
		if(lastChar==firstChar) {			  //lastChar�� firstChar�� �������� ���ٸ�<<<WORD�� ���������ڿ� word�� ù���ں�
			return true;					  //true ��ȯ
		}
		else {
			return false;					  //�ƴ϶�� false ��ȯ
		}
	}

}

public class WordGameApp{						//Ŭ���� WordGameApp
	WordGameApp(){								//������ WordGameApp
		System.out.println("�����ձ⸦ �����մϴ�.");
		System.out.print("�����ο��� �����ֽʽÿ�>>");
	}
	void run(int a){							//WordGameApp Ŭ������ �Լ� run(int a)<<<���� a�� �Ű��������ϴ� �Լ� run
		Scanner scan=new Scanner(System.in);
		Player[] PN=new Player [a];				//Player��ü�� ��� PN�迭 ���� ���̴� a��ŭ <<<int[]�� ������ �迭 �ΰ�ó�� ��ü[]����� ��ü�迭
		for (int i=0;i<a;i++) {					//i=0���� i<a���� �ݺ� <<<�Է¹��� �� a�� Player �迭�� ���̰���.
			System.out.print("�������� �̸��� �����ֽʽÿ�>>");//����ڷκ��� �������� �̸� �Է¹���.
			String name=scan.nextLine();			//�Է¹��� ���� name�� ����
			PN[i]=new Player(name);					//�Է¹��� name�� �������ϴ� ��ü Player�� �迭 PN�� ����
		}
		System.out.println("���۴ܾ�� �ƹ��� �Դϴ�.");
		
		String WORD="�ƹ���";		//���۴ܾ �ޱ����� WORD�� �ƹ��� ����
		int i=0;
		while(true) {
			PN[i].getWordFromUser();		//(�ƹ���)
			if(PN[i].checkSuccess(WORD)) {	//WORD�� �Ű��������ϴ� �Լ� checkSuccess() ��ü�� PN[i] (checkSuccess�� return���� boolean�̹Ƿ� if�ȿ��� ���)
				WORD=PN[i].word;			//������ WORD�� PN[i]�� ���� <<<���������� �Է¹��� ����;;
				if(i==a-1) {				//i���� �Է¹��� a(��ü�迭PN)�Ǳ��̿� �������ٸ� i=0���� �ʱ�ȭ
					i=0;
				}i++;						//if�� �ɸ����ʴ´ٸ� i++, while(true)�ȿ��� �����̹Ƿ� ���ѹݺ�
							
			}else {							//�� ���ǿ� ���� �ʴ´ٸ�
				System.out.println(PN[i].name+"Ż��");//�ش� PN[i]name �����
				break;								 //while �� Ż��
			}
			
		}scan.close();
	}
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		WordGameApp start=new WordGameApp();	//start��� �̸��� WordGameApp������ ����
		int a = scan.nextInt();					//���� a = ����ڷκ��� �Է°� ����
		start.run(a);							//�Է¹��� a�� �Ű������� run �Լ� ����(start.)
		
		scan.close();
	}
}

	

