import java.util.Scanner;
import java.lang.*;

class sit{	//sitŬ����
	int sitnum;		//������ sitnum
	String name;	//���ڿ� name�� ����
	sit(){}
	sit(int sitnum){	//������ sit��ü ������
		this.sitnum=sitnum;	//�ش� sit ��ü�� sitnum�� �Է¹��� sitnum����
	}
	sit(String name){	//���ڿ� name���� ��ü ������
		this.name=name;	//�ش� sit��ü�� name�� �Է¹��� name����.
	}
	void sit(int sitnum) {	//������ sitnum�� �޴� �Լ� sit����
		this.sitnum=sitnum;	//�ش� �Լ��� ���� sit ��ü�� sitnum�� �Է¹��� sitnum����
	}

}
//
public class Movie {	//MovieŬ����
	Scanner scan=new Scanner(System.in);
	sit[][] cgv;	//sit��ü�� �迭�� �������ִ� 2���� �迭 cgv�� ����
	Movie(){this.cgv=new sit[3][10];}	//Movie��ü�� �⺻ �����ڴ� cgv�迭�� ũ�⸦ [3][10]���� �Ѵ�.<<<�ش� ������ �¼��� 30���� ������ �����Ƿ�
//	
	void reserveAll() {	//�Լ� reserveAll() ���� Movie
		while(true) {	//���ѹݺ�
			System.out.println("<<<<cgv ���� �ý��� �Դϴ�>>>>");
			System.out.print("-����:1- -��ȸ:2- -���:3- -����:4- >>>");
			String a = scan.next();	//����ڷκ��� ������ a�� �Է¹���
			switch(a){
				case "1":		//�Է¹��� ���ڰ� 1�̶��
					checkin();	//checkin()�Լ� ȣ��<<<line 56
					continue;	//�� while�ݺ�
				case "2":		//�Է¹��� ���ڰ� 2���
					check();	//check()�Լ� ȣ��<<<line 49
					continue;	//�� while�ݺ�
				case "3":		//�Է¹��� ���ڰ� 3�̶��
					checkout(); //checkout()�Լ� ȣ�� line 74
					continue;   //�� while�ݺ�
				case "4":		//�Է¹��� ���ڰ� 4���
					System.out.println("���α׷��� �����մϴ�.");	//���� ���
					break;			//�� switch break
				default:			//default <<< switch��  case���ǿ� ���� ���� �߻���
					System.out.println("���� �޴��Դϴ� ���α׷��� �����մϴ�.");//���¸޴���� ������ ���α׷�����
			}
			break;	//switch�� �� �Ʒ��� ������ while break;
		}
	}
//
	void check() {	//��ü �¼����¸� ��ȸ�ϴ� �Լ� check() ����
		System.out.println("<CGV>");
		for(int i=0;i<3;i++) {
			show(i+1);	//show()�Լ� ȣ�� <<< line 85
		}
	}
//	
	void checkin() {//�� �¼��� �˰�ü�� �ִ� �Լ� checkin() ����
		System.out.print("��ȸ�� ���� �����Ͽ� �ֽʽÿ� >-S:1- -A:2- -B:3-< >>>");
		int a=scan.nextInt();
		if(a>=4||a<=0)	//�Է¹��� a�� 4���� ũ�ų� ���ų� 0���� �۰ų� �������
			System.out.println("���������ʴ� �� �Դϴ�.");//���ٰ� ���
		else {	//�ƴѰ�� 1~3���̿� �ִ°��
			show(a);//show(a)�Լ� ȣ�� <<<line 103
			System.out.print("������ �Է��Ͽ� �ֽʽÿ� >>>");
			String name=scan.next();
			sit subscrib=new sit(name); //sit��ü ����(�̸��� subscrib) name����<<line 10
			System.out.print("�¼���ȣ�� �����Ͽ� �ֽʽÿ�(1~10)>>>");
			int sitnum=scan.nextInt();
			subscrib.sit(sitnum); //subscrib�� sit�Լ� ȣ�� <<line 13
			cgv[a-1][sitnum-1]=subscrib; //cgv[][]�� 0���� �����ϹǷ� �Է°��� -1�� �ڸ��� ã�ư����� �ϰ� �ش� �ڸ��� sit��ü subscrib ���� 
		}
	}
//		
//	
	void checkout() {			//����� �¼��� ����ϴ� �Լ� checkout()����
		System.out.print("����� ���� �����Ͽ� �ֽʽÿ� >-S:1- -A:2- -B:3-< >>>");
		int a=scan.nextInt(); 		//������ ����ڷκ��� �Է¹���
		show(a);			 		//show(a)�Լ� ȣ�� <<line 103
		int Z=0;					//�ش� �迭�� ���鼭 ī��Ʈ�ϱ����� Z���� �ʱⰪ 0
		for(int i=0;i<cgv[a-1].length;i++) {
			if(cgv[a-1][i]==null)	//�ش� �¼��� null�̶��
				Z++;				//Z++ <<<ī��Ʈ
			if(Z==cgv[a-1].length)	//Z++�� �ش� �¼� ���� ���̸�ŭ �Ǹ� (==10)
				System.out.println("�̹� ����ִ� ���Դϴ� �ٽ� �������ֽʽÿ�");//�ٽü��� ���
		}
		if(Z<cgv[a-1].length) {	//Z�� �ش�迭������ ���̺��� ª�� �Ѿ����
			System.out.print("������ �Է��� �ֽʽÿ�>>>");
			String name=scan.next();	//����ڷκ��� ���ڿ� name �Է¹���
			int X=0;	//�ٽ� �Ʒ� for���� ī��Ʈ �ϱ����� X���� �ʱⰪ0
			for(int i=0;i<cgv[a-1].length;i++) {
				if(cgv[a-1][i]==null) {
					continue;
				}
					
				else if(name.equals(cgv[a-1][i].name)) {	//�Է¹��� name�� cgv[a-1][i].name �� ���ٸ�
					cgv[a-1][i]=null;	//�ش� �ڸ��� null�� ���
					System.out.println("��ҵǾ����ϴ�.");	//�� ��� �Ǿ��� ���
					break;	//�� for�� break;
				}
				else X++;	//if�� �ɸ��� �ʴ´ٸ� X++���ϰ�
				if(X==cgv[a-1].length);//X�� �ش翭�� ���̸�ŭ�Ǹ� (==10)
					System.out.println("��ϵ��� ���� �̸��Դϴ�X-p");//���ٰ� ���
					break;	//�� for�� break;
			}
		}
	}
//	
	void show(int a) {	//���� ������ �ش翭�� �¼����¸� �����ִ� ������ a�� �޴� �Լ� show()����
		if(a==1) {	//�Է¹��� a�� 1�̶��
			System.out.print("S>>");	//S>>�����
			for(int i =0;i<cgv[a-1].length;i++) {	//�ش� �迭 Ž��
				if(cgv[a-1][i]==null)	//�ش��ڸ��� null�̸�
					System.out.print(" --- ");//---��� ���� ����ٰ� ������
				else {
					System.out.print(" "+cgv[a-1][i].name+" ");//�ƴ϶�� (��ü�� ���ִٸ�) �ش� �ڸ��� ��ü�� name���
				}
			}System.out.println();
		}
		else if(a==2) {
			System.out.print("A>>");
			for(int i =0;i<cgv[a-1].length;i++) {
				if(cgv[a-1][i]==null)
					System.out.print(" --- ");
				else {
					System.out.print(" "+cgv[a-1][i].name+" ");
				}
			}System.out.println();
		}
		else {
			System.out.print("B>>");
			for(int i =0;i<cgv[a-1].length;i++) {
				if(cgv[a-1][i]==null)
					System.out.print(" --- ");
				else {
					System.out.print(" "+cgv[a-1][i].name+" ");
				}
			}System.out.println();
		}
	}

	public static void main(String[] args) {
		Movie cgv=new Movie();//Movie ��ü ���� �̸��� cgv <<line22
		cgv.reserveAll(); //Movie Ŭ������ cgv��ü�� reserveAll()�Լ� ��� <<line24
	}

}
