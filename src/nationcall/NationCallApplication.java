package nationcall;

import java.util.Scanner;

public class NationCallApplication {

	public static void main(String[] args) {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		while(run) {
			showDefault();
			int select = scanner.nextInt();
			switch (select) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				System.out.println("종료합니다.");
				run = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
		
		
		for(int i=0; true; i++) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				 e.printStackTrace();
			}
			if (i==60) {
				break;
			}
		}
	} // main
	
	private static void showDefault() {
		System.out.println("=========");
		System.out.println("국제전화");
		System.out.println("=========");
		System.out.println("전화걸기 원하는 국가를 선택해주세요.");
		System.out.println("1. 일본 | 2. 미국 | 3. 중국 | 4. 종료");
	}
}
