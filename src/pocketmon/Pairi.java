package pocketmon;

public class Pairi extends Pocketmon {
	String pocketmonName;
	
	public Pairi(String pocketmoNickName) {
		super(pocketmoNickName);
		
		super.pocketmonName = "파이리";
		super.pocketmonAttribute = "불";
		super.pocketmonSellPoint = 4;
	}


	@Override
	public void monsterballIn() {
		System.out.println("파이리를 들여보냈다!");
	}

	@Override
	public void monsterballOut() {
		System.out.println("파이리를 꺼냈다!");
	}
	
}
