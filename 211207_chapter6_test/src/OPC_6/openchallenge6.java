package OPC_6;

import java.util.Scanner;

public class openchallenge6 {
	static void histogram(String st) {
		for(int j='A';j<='Z';j++) {//�ƽ�Ű �ڵ�� for�� �ݺ�
			System.out.print((char)j+" : ");//�ݺ��Ǵ� j�� char�� ����
			for(int i=0;i<st.length();i++) {//�Է¹��� st��ŭ for�� �ݺ�
				char is=st.charAt(i); //char�� is�� st�� i��°�� ����
				if(is==j||is==j+32)//is�� j�� �� �빮�ڿ� �ҹ����� �ƽ�Ű �ڵ尪 ���̴� 32
					System.out.print("-");//������ -���
			}
			System.out.println("");
		}
	}

	static String readString() {
		StringBuffer sb=new StringBuffer();//Ű �Է��� ���� ��Ʈ�����ۻ���
		Scanner sc=new Scanner(System.in);
		while(true) {
			String line = sc.nextLine();//�ؽ�Ʈ �Ѷ����� �д´�
			if(line.equals(";"))//;�� �ִ� �����̸�
				break;//�Է³�
			sb.append(line);//���� ���� ���ڿ��� ��Ʈ�����ۿ� �߰�		
		}
		sc.close();
		return sb.toString();//��Ʈ�������� ���ڿ��� ��Ʈ������ ����
	}
	
	public static void main(String[] args) {
		System.out.println("���� �ؽ�Ʈ�� �Է��ϰ� �����ݷ��� �Է��ϼ���.");
		String st = readString();
		histogram(st);
	}

}
