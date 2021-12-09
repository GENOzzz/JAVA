package vector;

import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>(7);
		v.add(5);
		v.add(7);
		v.add(8);
		v.add(-1);
		System.out.println(v);
		int s=v.size();
		int c=v.capacity();
		System.out.println(s);
		System.out.println(c);
		v.add(2,100);
		v.add(2,null);
		System.out.println(v);
		s=v.size();
		System.out.println(s);
		v.add(2,66);
		System.out.println(v);
		v.remove(4);
		System.out.println(v);
		Vector<String> st=new Vector<String>(4);
		Vector<Integer> si=new Vector<Integer>(2);
		si.add(3);
		si.add(5);
		st.add("안녕하세요");
		st.add("저는현호입니다");
		System.out.println(st);
		v.addAll(si);
		System.out.println(v);
	}
}
