import java.util.Scanner;

class Phone{		//PhoneŬ����
	String name;	//�� name�� number�� ����
	String number;
	Phone(){}
	Phone(String name,String number){//��ü ����� ���� �ΰ��� �޸�
		this.name=name;				//�ش� ���ڸ� ������� name�� number�� ����
		this.number=number;
	}
}

public class PhoneBook {			//PhoneBook Ŭ����
Scanner scan=new Scanner(System.in);
	Phone[] Book;					//�� Phone��ü�� �迭�� ã�����ִ� ���۷���(Book)�� ����
	PhoneBook(int a){				//��ü ����� ������ ������
		this.Book=new Phone[a];		//�Է¹��� ������
		for(int i=0;i<a;i++) {		//for�� �ݺ�
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");//name�� number�� ����ڷκ��� �Է¹���
			String name=scan.next();
			String number=scan.next();
			this.Book[i]=new Phone(name, number);		//�Է¹��� name�� number�� Phone��ü�� �����Ͽ� Book�迭�� i��°�� ����
		}System.out.println("����Ǿ����ϴ�.");
	}
	
	void search() {	//�Լ� such�� return�� ����
		while(true) {
			System.out.print("�˻����̸�>>>");	
			String cname=scan.next();		//����ڷκ��� cname�� �Է¹���
			if(cname.equals("�׸�"))			//�Է¹��� �̸��� �׸��̶��
				break;						//�ݺ��� Ż��
			int count=0;	//Book�迭�� ���� ī��Ʈ������ ���� count���� 0���� ���ʱ�ȭ
			for(int i =0; i<this.Book.length;i++) { //Book�迭�� ���̸�ŭ �ݺ�
				if(cname.equals(this.Book[i].name))	//���� �Է¹��� cname�� Book�迭�� i��°�� name�� ���ٸ�<<<Book�迭�� ����� i��° Phone��ü�� name
					System.out.println(this.Book[i].name+"�� ��ȣ��"+this.Book[i].number); //i��°�� Phone��ü�� �̸��� ��ȣ ���
				else {count++;}		//�׷���������� count++
				if(count==this.Book.length)//count��ũ�Ⱑ Book.length�� ���ٸ� >>>�迭�� �� �Ѿ�ٴ� �ǹ�
					System.out.println(cname+"(��)�� ���� �̸��Դϴ�.");	//�Է¹��� cname�� ���ٰ� ���
			}continue;
		}
	}


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("�ο���>>");
		int a=scan.nextInt();	//����ڷκ��� ����a�Է¹ް�
		PhoneBook Book=new PhoneBook(a);	//�ش� ������ PhoneBook��ü ����, �̸��� Book
		Book.search();						//Book��ü�� �Լ� such ȣ��>>>line 26��
		scan.close();
	}

}