
public class Exercise6_9 {

	class Marine {
		int x=0, y=0; // Marine의 위치좌표(x,y)
		int hp = 60; // 현재 체력
		int weapon = 6; // 공격력
		int armor = 0; // 방어력
		void weaponUp() {
			weapon++;
		}
		void armorUp() {
			armor++;
		}
		void move(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}	//weapon , armor <<< static 붙여 모든 Mairne인스턴스에 동일한 값이여야함
	//weaponUp(),armorUp() <<< static변수에 대한 작업을 하는 메서드 이므로 static사용.
