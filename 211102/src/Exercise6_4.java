class Exercise6_4 {
	public static void main(String args[]) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		Student t = new Student("게노",303,11,100,50,80);
		System.out.println("이름:"+s.name);
		System.out.println("총점:"+s.getTotal());
		System.out.println("평균:"+s.getAverage());
		System.out.println(t.info());
	}
}
class Student {
		String name;
		int ban,no,kor,eng,math;
		
		Student(){	//현재 이 생성자는 역할이 없이 객체에서 지정을 되기때문에  안적어주어도 가능.
//			this.name=name;											
//			this.ban=ban;
//			this.no=no;
//			this.kor=kor;
//			this.eng=eng;
//			this.math=math;	
		}
		
		Student(String name,int ban,int no,int kor,int eng,int math){//매개변수(name,ban,no,kor,eng,math)받는 Student는
			this.name=name;											
			this.ban=ban;
			this.no=no;
			this.kor=kor;
			this.eng=eng;
			this.math=math;											//이러한 코드로 생성된다.
		}
		
		int getTotal() {		//반환타입: int , 매개변수 없음, 메소드명 getTotal은
		return kor+eng+math;	//kor,eng,math의 점수를 모두 더해서 반환한다.
		}
		
		float getAverage() {
			return (int)(getTotal()/3f * 10 + 0.5f) / 10f;	//생성된 값에 *10을하여 소수점 첫째자리를 1의 자리로 둘째자리를 소수점 첫째자리로 바꾼후
		}													//0.5를 더하여 int형으로 바꾸게되면 0.5를 더한 소수점첫째자리(원래 둘재자리)의 값이
															//0.5~0.9였다면 첫째자리로 넘어가고 뒷자리는 버려지게되고 아니였다면 그냥 버려지게 되어 반올림이 성립.
		
		public String info(){	//반환타입 String. 매개변수 없음, 메소드명 info는
			return name+','+ban+","+no+","+kor+","+eng+","+math 
					+","+getTotal()
					+","+getAverage(); //각 요소들을 차례로 문자열로 돌려준다.
		}

}