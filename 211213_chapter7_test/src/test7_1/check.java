package test7_1;

import java.util.Scanner;

public class check {
	
		private int cnum;
		
		public int checkk(String num) {//���ڿ��� �Ű�������
			Scanner scan=new Scanner(System.in);
			char tmp;
			boolean check=false;//���Ϲ� �ݺ��� ���� check
			while(!check) {
				for(int i=0;i<num.length();i++) {//�Է¹��� ���ڿ� num�� ���̸�ŭ�ݺ�
					tmp=num.charAt(i);			//�� �ڸ��� tmp�� ����
					if(!(-'1'<=tmp&&tmp<='9')) {///���� �ϳ��� 0~9�� ���� ���ٸ�
						num=null;		//num�� ����
						System.out.print("���� ������ �Է��� �ֽñ� �ٶ��ϴ�.>>>");
						num=scan.next();//���Է¹޾� ����
						i=-1;			//�Ŀ� �Է¹������� i=0���� �����ϱ����� -1�Է�.
					}
				}
			cnum=Integer.parseInt(num); //int���� 2147483647 ���� �ۿ� ���� ���ϹǷ� num���� �� ���ڰ� �Ѿ�°��
			check=true;					//�����߻�.
			}
			return cnum;
		}
}
