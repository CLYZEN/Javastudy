package ch06.thinktest.exam;

public class Char {
	int charMaxHp = 50;
	int charNowHp = this.charMaxHp;
	int charAttackPoint = 5;
	String enemyName;
	int enemyNowHp;
	int enemyMaxHp;
	int enemyAttackPoint;
	int status = 1;
	int fightStatus = 1;
	
	
	
	boolean move() {
		int random = (int) (Math.random() * 6) + 1; // 이동 거리 1~6
		int match = (int) (Math.random() * 3) + 1; // 3/1 확률로 적 만남
		if (match == 2) {
			System.out.println(random + "만큼 이동했습니다.");
			return true;
		} else {
			System.out.println(random + "만큼 이동했습니다.");
			return false;
		}
	}
	
	int[] enemy() {
		int random = (int) (Math.random() * 3) + 1;
		switch (random) {
		case 1:
			this.status = 2;
			this.enemyMaxHp = 50;
			this.enemyNowHp = enemyMaxHp;
			this.enemyAttackPoint = 4;
			this.enemyName = "피카츄";
			System.out.println("야생의 " +enemyName +"를 만났다!");
			System.out.println(enemyName + "의 현재 체력" + enemyMaxHp + "/" + enemyMaxHp);
			return new int[] {this.enemyMaxHp, this.enemyAttackPoint};
		case 2:
			this.status = 2;
			this.enemyMaxHp = 70;
			this.enemyNowHp = enemyMaxHp;
			this.enemyAttackPoint = 3;
			this.enemyName = "꼬북이";
			System.out.println("야생의 " +enemyName +"를 만났다!");
			System.out.println(enemyName + "의 현재 체력" + enemyMaxHp + "/" + enemyMaxHp);
			return new int[] {this.enemyMaxHp, this.enemyAttackPoint};
		case 3:
			this.status = 2;
			this.enemyMaxHp = 40;
			this.enemyNowHp = enemyMaxHp;
			this.enemyAttackPoint = 7;
			this.enemyName = "파이리";
			System.out.println("야생의 " +enemyName +"를 만났다!");
			System.out.println( enemyName + "의 현재 체력" + enemyMaxHp + "/" + enemyMaxHp);
			return new int[] {this.enemyMaxHp, this.enemyAttackPoint};
		default :
			return null;
		}
	}
	void fight() {
		
		if (this.fightStatus == 1) { // 공격
			this.enemyNowHp = (enemyMaxHp -= charAttackPoint);
			System.out.println(enemyName + "에게" + charAttackPoint + "의 피해를 입혔다!");
			System.out.println(enemyName + "의 체력 : " + enemyNowHp);
			
			this.charNowHp = (charNowHp -= enemyAttackPoint);
			System.out.println(enemyName + "에게" + enemyAttackPoint + "의 피해를 입었다!");
			System.out.println( "나의 체력 : " + charNowHp);
			System.out.println("--------------------------------------");
			System.out.println("1.공격 | 2.방어 | 3.도망");
			System.out.println("--------------------------------------");
		} else if (this.fightStatus == 2) { // 방어
			this.guard();
			this.fightStatus = 1;
		} else if (this.fightStatus == 3) { // 도망
			this.ttt();
			this.fightStatus = 1;
		}
		if(charNowHp <= 0) {
			this.charNowHp = this.charMaxHp;
			System.out.println("죽었습니다!");
			System.out.println("다시살아납니다!");
			System.out.println("--------------------------------------");
			System.out.println("1.이동 | 2.쉬기 | 3.내HP | 4.종료");
			System.out.println("--------------------------------------");
			this.status = 1;
			return;
		} else if (enemyNowHp <= 0) {
			System.out.println(enemyName + "을 처치했다!");
			this.status = 1;
			System.out.println("--------------------------------------");
			System.out.println("1.이동 | 2.쉬기 | 3.내HP | 4.종료");
			System.out.println("--------------------------------------");
			return;
		}
		
	}
	void rest() {
		while(true) {
			this.status = 2;
			if (this.charNowHp < 50) {
				++charNowHp;
				System.out.println("체력이 1 회복되었습니다.");
				System.out.println("현재체력 : " + charNowHp);
			} else {
				System.out.println("충분히 쉬었다 !");
				System.out.println("--------------------------------------");
				System.out.println("1.이동 | 2.쉬기 | 3.내HP | 4.종료");
				System.out.println("--------------------------------------");
				this.status = 1;
				break;
			}
		}
	}
	void guard() {
		this.charNowHp -= 1;
//		this.charNowHp += charMaxHp - enemyAttackPoint;
		System.out.println("방어했다 !");
		System.out.println("적 현재체력"+this.enemyNowHp);
		System.out.println(enemyName + "에게 1 의 피해를 입었다!");
		System.out.println("현재체력 : " + this.charNowHp);
		System.out.println("--------------------------------------");
		System.out.println("1.공격 | 2.방어 | 3.도망");
		System.out.println("--------------------------------------");
	}
	
	void ttt() {
		System.out.println("도망갔다!");
		this.status = 1;
		System.out.println("--------------------------------------");
		System.out.println("1.이동 | 2.쉬기 | 3.내HP | 4.종료");
		System.out.println("--------------------------------------");
		return;
	}
}
