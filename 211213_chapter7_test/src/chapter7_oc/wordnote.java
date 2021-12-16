package chapter7_oc;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

import test7_01.check;


public class wordnote {
	check ck=new check();
	Scanner sc=new Scanner(System.in);
	Vector<Word>wn=new Vector<Word>();
	wordnote(){
		wn.add(new Word("love","사랑"));
		wn.add(new Word("animal","동물"));
		wn.add(new Word("pioneer","선구자"));
		wn.add(new Word("renaissance","부흥"));
		wn.add(new Word("eclipse","일식"));
		wn.add(new Word("alchemist","연금술사"));
		wn.add(new Word("emperor","황제"));
		wn.add(new Word("horizon","지/수평선"));
		wn.add(new Word("miracle","기적"));
		wn.add(new Word("supernova","초신성"));
		wn.add(new Word("cherish","아끼다"));
		wn.add(new Word("rainbow","무지개"));
		wn.add(new Word("eternity","영원"));
		wn.add(new Word("superior","월등한"));
		wn.add(new Word("destiny","운명"));
		wn.add(new Word("grace","우아함"));
		wn.add(new Word("Twinkle","반짝거리다"));
		wn.add(new Word("sunshine","햇빛"));
		wn.add(new Word("blossom","만개"));
		wn.add(new Word("fantasy","환상"));
		wn.add(new Word("fredom","자유"));
		wn.add(new Word("galaxy","은하계"));
	}
	
	
	public boolean searchKor(int e) {
		ArrayList<String> an=new ArrayList<String>();
		String ra=wn.get(e).getKor();
		int a = 0,b=0,c=0;
		
		for(int i=0;i<3;i++) {
			int r=(int)(Math.random()*wn.size());
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
			System.out.println("프로그램을 종료합니다.");
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
				System.out.println("보기중에만 입력해 주시기 바랍니다.");
				return true;
			}
		}
		
	}
	
	public void searchEng() {
		
		while(true) {
			System.out.print("단어시험(1) 단어삽입(2) 종료(3) >>");
			int choice=ck.checkk(sc.next());
			switch(choice) {
			case 1:
				boolean ending=true;
				while(ending) {
					int e=(int)(Math.random()*wn.size());
					System.out.println(wn.get(e).getEng()+"? ");
					ending=searchKor(e);
				}
				break;
			case 2:
				System.out.println("현재"+wn.size()+"개의 영어단어가 있습니다.");
				System.out.print("새로운 단어를 입력 하세요 (\"그만\"은 입력을 종료합니다)>>");
				String eng=sc.next();
				if(eng.equals("그만")) {
					System.out.println("입력을 종료합니다");
					break;
				}
				if(wn.stream().anyMatch(english -> english.getEng().equals(eng))) {
					System.out.println("이미 존재하는 영어입니다.");
					break;
				}
				String kor=sc.next();
				Word newword=new Word(eng,kor);
				wn.add(newword);
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("보기의 숫자만 입력해 주십시오.");
			}
		}
	}
	
	public void run() {
		System.out.println("\"명품영어\""+"단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
		System.out.println("현재 "+wn.size()+"개의 단어가 들어있습니다.");
		searchEng();
	}
}
