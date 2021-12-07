package pro_1118;

public class StringStack implements Stack{
	private String[] stack;
	private int tos;
	public StringStack(int cap){
		stack=new String[cap];
		tos=-1;
	}
	
	public int length() { //현재 스택에 저장된 개수 리턴
		return tos+1;
	}
	public int capacity(){//스택의 전체 저장 가능한 개수 리턴
		return stack.length;
	}
	public String pop() { //스택의 톱(top)에 저장된 실수 리턴
		if(tos==-1) {
			return null;
		}
		String s=stack[tos];
		tos--;
		return s;
	}
	public boolean push(String val){//스택의 톱(top)에 실수 저장
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
