package pack211116;
import java.util.Scanner;

interface Stack{
	int length(); //���� ���ÿ� ����� ���� ����
	int capacity();//������ ��ü ���� ������ ���� ����
	String pop(); //������ ��(top)�� ����� �Ǽ� ����
	boolean push(String val);//������ ��(top)�� �Ǽ� ����
}
class StringStack implements Stack {
	Scanner scan=new Scanner(System.in);
	int length,cap;//������ ������� ũ��� ��(top)�� ��
	String[] st;//���ڿ� �������
	StringStack(int a) {
		this.length=a;
		st=new String[a];
		cap=this.length;
	}
	public int length() {//���� ���ÿ� ����� ���� ����
		return length-cap;
	}
	public int capacity() {//������ ��ü ���尡���� ���� ����
		return cap;
	}
	public String pop() {//������ top�� ����� ���ڿ� ����
		int tmp=cap;	//�Ʒ� push�� ����Ǹ鼭 cap�� �Ʒ��� ������
		cap++;			//���� tmp�� cap�� ������ cap�� 1�� �����ְ�
		return st[tmp];	//st�迭�� tmp��°�� ����� String���� ������.
	}
	public boolean push(String val) {//���ÿ� ���ڿ� ����.
		if(cap>0) {	//top�� ���� 0���� ũ��
			st[cap-1]=val; //�ش� ��-1>>>�迭�� ��������ġ�� val����
			cap--;			//���� �Ŀ� ž�� ��ġ-1(�̹� ž�� ��ġ���� val�� ����Ǿ����Ƿ� ���� ž�� ��ġ�� cap-1�� �Ѵ�.
			return true;
		}
		else;
		return false;
	}
}

class StackApp{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.print("�� ���� ���� ������ ũ�� �Է�>> ");
		int a=scan.nextInt();
		StringStack stack=new StringStack(a);//���ڿ� stack ����
		while(true) {
			System.out.print("���ڿ� �Է� >>>");
			String val=scan.next();//���ÿ� ������ ���ڿ� �Է¹���
			
			if(val.equals("�׸�")) {//�׸� �Է½�
				int len=stack.length();//���� ���ÿ� ����� ���ڿ� ����
				if(len==0)	//���ڿ��� ������
					System.out.println("�ƹ��͵� ���µ� �� �˽���!.");
				else {//���ڿ��� ������
					System.out.print("���ÿ� ����� ��� ���ڿ� �� :");
					for(int i =0;i<stack.length;i++) { //���� ���ÿ� ����� ���ڿ� ������ŭ pop!
						if(stack.st[i]==null) {//pop�� �Ʒ��� ���� �ö󰡹Ƿ� 0��°���� ��������� ����
							System.out.print(" null ");//�������� null���
						}
						else {	//�ƴ϶��
						System.out.print(stack.pop()+" ");//�ش���ġ���� pop
						}
					}
				}
				break;//���α׷�����
			}
			else {//���ÿ� ���ڿ� Ǫ��
				if(!stack.push(val)) //���ÿ� ������ ������.
					System.out.println("������ ������ Ǫ�� �Ұ�!!");
			}
		}
	}
}