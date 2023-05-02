package pocketmon;

public class Ggobugi extends Pocketmon {
	String pocketmonName;
	
	public Ggobugi(String pocketmoNickName) {
		super(pocketmoNickName);
		
		super.pocketmonName = "꼬북이";
		super.pocketmonAttribute = "물";
		super.pocketmonSellPoint = 3;
	}

	@Override
	public String showPocketmon() {
		
		return "꼬북이 |" + pocketmonNickName + "|" +  pocketmonAttribute + "| 체력 : " + pocketmonHealth + "| 레벨 : " + pocketmonLevel + "| 공격력 : " +  pocketmonAttackPoint; 
	}
	@Override
	public void monsterballIn() {
		System.out.println("꼬북이를 들여보냈다!");
	}

	@Override
	public void monsterballOut() {
		System.out.println("꼬북이를 꺼냈다!");
	}
	
}
