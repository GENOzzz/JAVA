class Exercise6_4 {
	public static void main(String args[]) {
		Student s = new Student();
		s.name = "ȫ�浿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		Student t = new Student("�Գ�",303,11,100,50,80);
		System.out.println("�̸�:"+s.name);
		System.out.println("����:"+s.getTotal());
		System.out.println("���:"+s.getAverage());
		System.out.println(t.info());
	}
}
class Student {
		String name;
		int ban,no,kor,eng,math;
		
		Student(){	//���� �� �����ڴ� ������ ���� ��ü���� ������ �Ǳ⶧����  �������־ ����.
//			this.name=name;											
//			this.ban=ban;
//			this.no=no;
//			this.kor=kor;
//			this.eng=eng;
//			this.math=math;	
		}
		
		Student(String name,int ban,int no,int kor,int eng,int math){//�Ű�����(name,ban,no,kor,eng,math)�޴� Student��
			this.name=name;											
			this.ban=ban;
			this.no=no;
			this.kor=kor;
			this.eng=eng;
			this.math=math;											//�̷��� �ڵ�� �����ȴ�.
		}
		
		int getTotal() {		//��ȯŸ��: int , �Ű����� ����, �޼ҵ�� getTotal��
		return kor+eng+math;	//kor,eng,math�� ������ ��� ���ؼ� ��ȯ�Ѵ�.
		}
		
		float getAverage() {
			return (int)(getTotal()/3f * 10 + 0.5f) / 10f;	//������ ���� *10���Ͽ� �Ҽ��� ù°�ڸ��� 1�� �ڸ��� ��°�ڸ��� �Ҽ��� ù°�ڸ��� �ٲ���
		}													//0.5�� ���Ͽ� int������ �ٲٰԵǸ� 0.5�� ���� �Ҽ���ù°�ڸ�(���� �����ڸ�)�� ����
															//0.5~0.9���ٸ� ù°�ڸ��� �Ѿ�� ���ڸ��� �������Եǰ� �ƴϿ��ٸ� �׳� �������� �Ǿ� �ݿø��� ����.
		
		public String info(){	//��ȯŸ�� String. �Ű����� ����, �޼ҵ�� info��
			return name+','+ban+","+no+","+kor+","+eng+","+math 
					+","+getTotal()
					+","+getAverage(); //�� ��ҵ��� ���ʷ� ���ڿ��� �����ش�.
		}

}