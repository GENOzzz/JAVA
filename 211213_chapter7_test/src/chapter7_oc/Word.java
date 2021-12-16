package chapter7_oc;

public class Word {
	private String kor;
	private String eng;
	
	public String getEng() {return eng;}
	public void setEng(String eng) {this.eng = eng;}
	public String getKor() {return kor;}
	public void setKor(String kor) {this.kor = kor;}
	
	Word(String eng,String kor){this.eng=eng;this.kor=kor;}
	
}
