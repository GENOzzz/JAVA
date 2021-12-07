import java.util.Scanner;
abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run() {
		Scanner scan=new Scanner(System.in);
		System.out.println(getSrcString()+"�� "+getDestString()+"�� �ٲߴϴ�.");
		System.out.print(getSrcString()+"�� �Է��ϼ��� >>");
		double val=scan.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ��� "+res+getDestString()+" �Դϴ�.");
		
//		scan.close(); �ݾƹ����� �ι�° �Լ� �����Ҷ� �����߻�
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
		return "��";
	}
	protected String getDestString() {
		return "�޷�";
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
		toDollar.run(); //<<�Ƹ� ���� ���������� �Ʒ� �������𿡼� �浹�ϴµ�;
	}
}
