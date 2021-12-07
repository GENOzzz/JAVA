public class TV {	//p241_1
	String name;
	int age,inch;
	TV(){		
	}
	TV(String name,int age,int inch){
		this.name=name;
		this.age=age;
		this.inch=inch;
	}
	void show(){
		System.out.println(this.name+"에서만든 "+this.age+"년형 "+this.inch+"인치 TV");
	}
	public static void main(String[] args) {
		TV myTV = new TV("LG",2017,32);
		myTV.show();
	}
}
