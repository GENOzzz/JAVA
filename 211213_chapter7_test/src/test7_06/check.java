package test7_06;

import java.util.Scanner;

public class check {
	
		private int cnum;
		
		public int intcheck(String num) {//���ڿ��� �Ű�������
			Scanner scan=new Scanner(System.in);
			char tmp;
			boolean check=false;//���Ϲ� �ݺ��� ���� check
			while(!check) {
				for(int i=0;i<num.length();i++) {//�Է¹��� ���ڿ� num�� ���̸�ŭ�ݺ�
					tmp=num.charAt(i);			//�� �ڸ��� tmp�� ����
					if(!(-'9'<=tmp&&tmp<='9')) {///���� �ϳ��� -9~9�� ���� ���ٸ� ù�ڸ��� -�� �Էµ� ��� ��������.
						num=null;		//num�� ����
						System.out.print("������ �Է��� �ֽñ� �ٶ��ϴ�.>>>");
						num=scan.next();//���Է¹޾� ����
						i=-1;			//�Ŀ� �Է¹������� i=0���� �����ϱ����� -1�Է�.>>i++�� �Ѿ.
					}
				}
			num=num.trim();//��������
			cnum=Integer.parseInt(num); //int���� 2147483647 ���� �ۿ� ���� ���ϹǷ� num���� �� ���ڰ� �Ѿ�°��
			check=true;					//�����߻�.
			}
			return cnum;
		}
}
