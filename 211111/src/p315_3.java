import java.util.Scanner;
abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run() {
		Scanner scan=new Scanner(System.in);
		System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
		System.out.print(getSrcString()+"을 입력하세요 >>");
		double val=scan.nextDouble();
		double res = convert(val);
		System.out.println("변환결과 "+res+getDestString()+" 입니다.");
		
//		scan.close(); 닫아버리면 두번째 함수 실행할때 에러발생
	}
}

class Won2Dollar extends Converter{
		Won2Dollar(double ratio){
		super.ratio=ratio;
	}
	protected double convert(double src) {
		return src/1200;
	}
	protected String getSrcString() {
		return "원";
	}
	protected String getDestString() {
		return "달러";
	}
}

class Km2Mile extends Converter{
		Km2Mile(double ratio){
		super.ratio=ratio;
	}
	protected double convert(double src) {
		return src/1.6;
	}
	protected String getSrcString() {
		return "Km";
	}
	protected String getDestString() {
		return "Mile";
	}
}

public class p315_3 {

	public static void main(String[] args) {
		Km2Mile toMile=new Km2Mile(1.6);
		toMile.run();
		
		Won2Dollar toDollar=new Won2Dollar(1200);
		toDollar.run(); //<<아마 위에 변수선언후 아래 변수선언에서 충돌하는듯;
	}
}
