package ch06.sec08.exam03;

public class Car {
	// 필드
	int gas;
	
	// 생성자 car(){}
	// 생성자는 인스턴스 생성 시 1번만 실행
	/*
	Car(int gas) {
		System.out.println("생성자 실행");
		this.gas = gas;
	}
	*/
	// 메소드
	// 메소드는 여러번 실행 가능
	void setGas(int gas) { // 휘발유 넣기
		System.out.println("연료를" + gas + "만큼 넣습니다");
		this.gas += gas;
	}
	
	boolean isLeftGas() { // 휘발유가 있나 없나
		if ( gas == 0) {
			System.out.println("연료가 없습니다.");
			return false;
		}
		System.out.println("연료가 있습니다.");
		return true;
	}
	
	void run() { // 자동차 달리기(휘발유 소모)
		while(true) {
			if ( gas > 0 ) { // 연료가 있음
				System.out.println("달린다. 연료잔량 : " + gas );
				gas -= 1; // 1씩 gas 소모
			} else { // 연료가 없음
				System.out.println("멈춘다. 연료잔량 : " + gas);
				return; // 메소드 종료
			}
			
		}
	}
	
}
