package vo;//model

public class Member {
	private int id;//식별자
	private String name;
	private String email;
	private String addr;
	private String hobby;
	private String tel;
	private String nick;
	private int age;
	
	public int getId() {return id;}
	public void setId(int id) {this.id=id;}
	public String getName() {return name;}
	public void setName(String name) {this.name=name;}	
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email=email;}
	public String getAddr() {return addr;}
	public void setAddr(String addr) {this.addr=addr;}
	public String getHobby() {return hobby;}
	public void setHobby(String hobby) {this.hobby=hobby;}
	public String getTel() {return tel;}
	public void setTel(String tel) {this.tel=tel;}
	public String getNick() {return nick;}
	public void setNick(String nick) {this.nick=nick;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age=age;}
	
	@Override
	public String toString() {
		return "회원아이디 : " +id +", 이름 : "+name+", 이메일 : "+email+
				", 주소 : "+addr+", 취미 : "+hobby+", 전화번호 : "+tel+", "
				+ "닉네임 : "+nick+", 나이 : "+age;
	}
}
