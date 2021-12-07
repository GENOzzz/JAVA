import java.util.Scanner;

class Day{		//DayŬ���� ����
	private String work;	//��ü���� work, date
	int date;
	Day(){}					//������
	Day(int date){			//���� date�� �Ű������� �޴� ������
		this.date=date;		//�Ű����� ������ date�� ��ü���� date��
	}
	Day(int date,String work){	//�Ű����� ������ date,���ڿ� work�� �޴� ������
		this.date=date;			//�Ű����� date�� ��ü���� date��
		this.work=work;			//�Ű����� work�� ��ü���� work��
	}
	public void set(String work) { //���ϰ��̾���(void) �Լ�set() �Ű����� ������work
		this.work=work;			   //�Ű����� work�� ��ü���� work�� ��ȯ����.
		} 
	public String get() {return work;} //���ڿ��� �����ִ� �Լ�get() work�� ������ <<���� �ڵ忡���� DayŬ���� �ȿ��� work�� �������⶧���� get���ʿ�.
	
	public void show() {			   //���ϰ��̾���(void) �Լ�show()
		if(work==null)System.out.println("�����ϴ�.");//work�� null(������) �����ϴ� ���
		else System.out.println("�Ͻ�����" + work + "�Դϴ�");		//�ܿ�(null�� �ƴѰ��) work+�Դϴ� ���
	}
}

public class MonthSchedule {			//MonthScheduleŬ���� ����
	Scanner scan=new Scanner(System.in);
	static int last;					//last�� static���� ����<<<�Ʒ� ��� �Լ��� �����ڿ��� ����Ҽ��ְ� �ϱ�����.
	Day[] Schedule;						//Day��ü�� �������ִ� �迭 Schedule����
	MonthSchedule(int a){				//������a�� �Ű������ι޴� MonthSchedule��ü ����
		last=a;							//static last�� >> �Ű����� a�� ����
		this.Schedule=new Day[last];	//����Schedule(�迭)�� ũ�⸦ Day[Last]�� ����.
		for(int i=0;i<a;i++) {		//Last��ŭ �ݺ��ϴµ���
			this.Schedule[i]=new Day(i+1);//Schedule�迭��i��°���� Day(i+1)�� ���������� ��ü ����
		}													//Day(int a)��ü ����
	}
	void input(){						//���ϰ����� �Լ� input()
		String work;					//���ڿ� work����
		int day;
		while(true) {
			System.out.print("��¥(1~"+last+")>>");//����ڷκ��� ���� �Է¹���.
			day=scan.nextInt();			//������ day�� �Է¹����� ����
			if(day<1||day>last)			//���� �Է¹��� ���� ������ �����
				System.out.println("��¥�� Ȯ���Ͽ� �ֽʽÿ�");//Ȯ�κ�Ź ���
			else
				break;				//�ƴ϶��(���� �ȿ� �ִٸ�) while Ż��
		}
		System.out.print("����?(��ĭ�����Է�)>>");
		work=scan.next();		//.next();<<�����̽��� ���������� ���� .nextLine();<<���͸�ġ�������� ���ڿ� ���θ� ����
		Schedule[day-1].set(work);//Schedule�� [day-1]��° �迭�� set.(work)�Լ� ȣ��<<<55���� �߰�����
	}
	void view() {				//���ϰ��� ���� �Լ�view()
		System.out.print("��¥(1~"+last+")>>");//����ڷκ��� ���� �Է¹���
		int day=scan.nextInt();				 //�Է¹��� �����κ���
		Schedule[day-1].show();				 //�����ٹ迭�� day-1��°�� ã�ư� 
	}										 //���迭��0��°�� Day(1)�� ��ü�� ��������Ƿ� ��������忡�� 1���Է��ϵ���
	void finish(){	 //���ϰ��� ���� finish();
		System.out.println("���α׷��� �����մϴ�.");//���α׷� �������
	}
	void run(){
		while(true) {	//���ѹݺ�
			System.out.print("����(�Է�:1, ����:2, ������:3)>>");
			int w=scan.nextInt();	//����ڷκ��� �Է¹��� w
			if(w>=1&&w<=3) {}		//wũ�� �Ǻ�(1,2,3)�� �´���
			else { 					//�ƴ϶�� �Ʒ� ���� ����� ���Է¹޵�����
				System.out.println("1,2,3�߿� �Է��Ͽ��ֽʽÿ�");
				continue;
			}
			switch(w){	//switch������ w�� �Ű�������
			case 1:		//�Է¹��� w�� 1�̶��
				input();	//input()�Լ� ȣ��
				continue;	//continue <<<���� �Է� �κ����� ���ư�
			case 2:		//w�� 2���
				view();	//view() �Լ� ȣ��
				continue;
			case 3:		//w�� 3�̶��
				finish();//finish()�Լ� ȣ��
				break;	//switch Ż��
			}break;		//while Ż��
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("�� ������ ���� ���α׷�");
		System.out.print("������ ��¥�� �Է����ֽʽÿ�>>");
		int a = scan.nextInt();	//����ڷκ��� �Է¹��� a�� �Ű�������
		MonthSchedule Month=new MonthSchedule(a);	//MonthSchedule��ü ����;(���۷���:�̸�)�� Month
			Month.run();
			scan.close();
		}
}
