package test7_09;

import java.util.*;
import java.lang.*;


public class MyStack<T> implements IStack<T>{
	Vector<T> stack=new Vector<T>();
	
	public T pop() {
		if(!stack.isEmpty()) {
			T num;
			num=stack.get(stack.size()-1);
			stack.remove(stack.size()-1);
			return num;	
		}else {
			return null;
		}
	}
	
	public boolean push(T ob) {
		stack.add(ob);
		return true;
	}
	
	public static void main(String[] args) {
		IStack<Integer>stack=new MyStack<Integer>();
		for(int i=0;i<10;i++) stack.push(i);//10���� ���� Ǫ��
		while(true) {//������ �������� pop
			Integer n = stack.pop();
			if(n==null)break;//������ ����
			System.out.print(n+" ");
		}
	}

}
