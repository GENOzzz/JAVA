package gamblehuman;

public class gamehumans {//gamehuman��ü �迭�� �����ִ� gamehumans
	
	private gamehuman[] team;
	
	public gamehuman[] getTeam() {return team;}

	public void setTeam(gamehuman[] team) {this.team = team;}

	public void set(int n) {//team�� ũ�⸦ ���ϴ� �Լ�
		team=new gamehuman[n];
	}
}
