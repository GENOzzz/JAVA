package chapter7_oc;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
import test7_1.check;


public class wordnote {
	check ck=new check();
	Scanner sc=new Scanner(System.in);
	Vector<Word>wn=new Vector<Word>();
	wordnote(){
		wn.add(new Word("love","���"));
		wn.add(new Word("animal","����"));
		wn.add(new Word("pioneer","������"));
		wn.add(new Word("renaissance","����"));
		wn.add(new Word("eclipse","�Ͻ�"));
		wn.add(new Word("alchemist","���ݼ���"));
		wn.add(new Word("emperor","Ȳ��"));
		wn.add(new Word("horizon","��/����"));
		wn.add(new Word("miracle","����"));
		wn.add(new Word("supernova","�ʽż�"));
		wn.add(new Word("cherish","�Ƴ���"));
		wn.add(new Word("rainbow","������"));
		wn.add(new Word("eternity","����"));
		wn.add(new Word("superior","������"));
		wn.add(new Word("destiny","���"));
		wn.add(new Word("grace","�����"));
		wn.add(new Word("Twinkle","��¦�Ÿ���"));
		wn.add(new Word("sunshine","�޺�"));
		wn.add(new Word("blossom","����"));
		wn.add(new Word("fantasy","ȯ��"));
		wn.add(new Word("fredom","����"));
		wn.add(new Word("galaxy","���ϰ�"));
	}
	
	
	public boolean searchKor(int e) {
		ArrayList<String> an=new ArrayList<String>();
		String ra=wn.get(e).getKor();
		int a = 0,b=0,c=0;
		
		for(int i=0;i<3;i++) {
			int r=(int)(Math.random()*22);
			if(r==e) {
				i--;
			}else {
				if(i==0) {
					a=r;
				}else if(i==1) {
					b=r;
				}else if(i==2) {
					c=r;
				}
			}
		}
		
		an.add(wn.get(a).getKor());
		an.add(wn.get(b).getKor());
		an.add(wn.get(c).getKor());
		int rra=(int)(Math.random()*3);
		an.add(rra, ra);
		for(int i=0;i<an.size();i++) {
			System.out.print("("+(i+1)+")"+an.get(i)+" ");
		}
		int answer=ck.checkk(sc.next());
		switch(answer) {
		case -1:
			System.out.println("���α׷��� �����մϴ�.");
			return false;
		default:
			if(answer>0&&answer<5) {
				if(wn.get(e).getKor().equals(an.get(answer-1))) {
					System.out.println("GREAT!!");
					return true;
				}else {
					System.out.println("NONONONO!!");
					return true;
				}
			}else {
				System.out.println("�����߿��� �Է��� �ֽñ� �ٶ��ϴ�.");
				return true;
			}
		}
		
	}
	
	public void searchEng() {
		boolean ending=true;
		while(ending) {
			int e=(int)(Math.random()*22);
			System.out.println(wn.get(e).getEng()+"? ");
			if(e==-1) {
				ending=false;
				break;
			}
			ending=searchKor(e);
			
		}
		
	}
	
	public void run() {
		System.out.println("\"��ǰ����\""+"�ܾ� �׽�Ʈ�� �����մϴ�. -1�� �Է��ϸ� �����մϴ�.");
		System.out.println("���� 22���� �ܾ ����ֽ��ϴ�.");
		searchEng();
	}
}
