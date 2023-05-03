package pocketmon;

import java.util.ArrayList;

public class PocketmonApplication {

	private static ArrayList<Pocketmon> pocketmonList = new ArrayList<>();
	static int index = 0;
	static int pocketmonPoint;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pocketmon pocketmon1 = new Pikachu("피카츄1");
		Pocketmon pocketmon2 = new Ggobugi("꼬부기1");
		Pocketmon pocketmon3 = new Pairi("파이리1");
		
		pocketmonList.add(pocketmon1);
		pocketmonList.add(pocketmon2);
		pocketmonList.add(pocketmon3);
		
		showPocketmons();
		
		sellMyPocketmon(1);
		
		pocketmonIn("피카츄1");
		pocketmonOut("피카츄1");
		
		
	}
	
	public static void showPocketmons() {
		System.out.println("내가 가진 포켓몬");
		
		for(Pocketmon pocketmon : pocketmonList) {
			index++;
			System.out.print("번호 : " + index + "|");
			System.out.println(pocketmon.showPocketmon());
		}
		index = 0;
	}
	
	public static void sellMyPocketmon(int index) {
		showPocketmons();
		System.out.println(index+1 + "번 포켓몬을 팔았다!! 좋은 식자재가 될거다!");
		pocketmonList.remove(index);
		System.out.println("남은 포켓몬");
		Pocketmon pocketmon = findPocketmon("피카츄1");
		pocketmon.sellPocketmon();
		showPocketmons();
		System.out.println("현재 포켓몬포인트 : " + pocketmon.getPocketmonPoint());
	}
	
	public static Pocketmon findPocketmon(String pocketmonNickName) {
		Pocketmon resultPocketmon = null;
		for( Pocketmon pocketmon : pocketmonList){
			if (pocketmon.getPocketmonNickName() == pocketmonNickName) {
				resultPocketmon = pocketmon;
				break;
			}
		}
		
		return resultPocketmon;
	}
	
	public static void pocketmonIn(String pocketmonNickName) {
		Pocketmon pocketmon = findPocketmon(pocketmonNickName);
		pocketmon.monsterballIn();
	}
	public static void pocketmonOut(String pocketmonNickName) {
		Pocketmon pocketmon = findPocketmon(pocketmonNickName);
		pocketmon.monsterballOut();
	}

}
