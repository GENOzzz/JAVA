class Exercise6_22 {
	public static boolean isNumber(String str) { //��ȯŸ��:boolean, �Լ��� : isNumber, �Ű�����:String str. 
		if(str==null||str.contentEquals(""))	//�Է¹��� str�� nuull�̰ų� �ƹ��͵� ���ٸ�
				return false;					//false ��ȯ
		for(int i=0; i< str.length();i++) {		//i=0���� i<str�� ���� ��ŭ �ݺ�
			char ch = str.charAt(i);			//str(i)��°�� ���ڸ� ch�� ����
			if(ch < '0' || ch > '9') {			//ch �� ���� '0'���� �۰ų� '9'���� ũ�ٸ� <<<�ƽ�Ű �ڵ������ ���ڰ� �ƴ϶��(�׸����� ��)
				return false;					//false ��ȯ
			}
		}return true;							//���� ������ true ��ȯ <<< �Է¹��� str�� ��� ���ڰ� ���ڶ��.
	}	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"�� �����Դϱ�? "+isNumber(str));
		str = "1234o";
		System.out.println(str+"�� �����Դϱ�? "+isNumber(str));
	}
}