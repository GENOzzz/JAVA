package pro_1118;

public class StringStack implements Stack{
	private String[] stack;
	private int tos;
	public StringStack(int cap){
		stack=new String[cap];
		tos=-1;
	}
	
	public int length() { //���� ���ÿ� ����� ���� ����
		return tos+1;
	}
	public int capacity(){//������ ��ü ���� ������ ���� ����
		return stack.length;
	}
	public String pop() { //������ ��(top)�� ����� �Ǽ� ����
		if(tos==-1) {
			return null;
		}
		String s=stack[tos];
		tos--;
		return s;
	}
	public boolean push(String val){//������ ��(top)�� �Ǽ� ����
		if(tos == stack.length-1) {
			return false;
		}
		else {
			tos++;
			stack[tos]=val;
			return true;
		}
	}
}
