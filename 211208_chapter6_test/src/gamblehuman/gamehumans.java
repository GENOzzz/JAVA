package gamblehuman;

public class gamehumans {//gamehuman객체 배열을 갖고있는 gamehumans
	
	private gamehuman[] team;
	
	public gamehuman[] getTeam() {return team;}

	public void setTeam(gamehuman[] team) {this.team = team;}

	public void set(int n) {//team의 크기를 정하는 함수
		team=new gamehuman[n];
	}
}
