package util;
import java.util.Scanner;

public class intcheck {
	private int cnum;
	public int checkk(String num) {//���ڿ��� �Ű�������
		Scanner scan=new Scanner(System.in);
		char tmp;
		boolean check=false;//���Ϲ� �ݺ��� ���� check
		while(!check) {
			for(int i=0;i<num.length();i++) {//�Է¹��� ���ڿ� num�� ���̸�ŭ�ݺ�
				tmp=num.charAt(i);			//�� �ڸ��� tmp�� ����
				if(!('0'<=tmp&&tmp<='9')) {///���� �ϳ��� 0~9�� ���� ���ٸ�
					num=null;		//num�� ����
					System.out.print("���ڸ� �Է��� �ֽñ� �ٶ��ϴ�.>>>");
					num=scan.next();//���Է¹޾� ����
					i=-1;			//�Ŀ� �Է¹������� i=0���� �����ϱ����� -1�Է�.
				}
			}
		cnum=Integer.parseInt(num); //int���� 2147483647 ���� �ۿ� ���� ���ϹǷ� num���� �� ���ڰ� �Ѿ�°��
		check=true;					//�����߻�.
		}
		return cnum;
	}
	public static void main(String[] args) {//�Լ��� �۵��ϴ��� Ȯ���ϱ����� ���ι�
		Scanner scan=new Scanner(System.in);
		while(true) {
			intcheck intcheck=new intcheck();
			System.out.print("�ƹ� ���ڳ� �Է� : ");
			
			String p=scan.nextLine();
			
			System.out.println(intcheck.checkk(p));
		}
	}

}