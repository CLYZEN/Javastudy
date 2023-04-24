package ch04.sec02;

public class IfNestedExample {
	public static void main(String[] args) {
		//	ramdom 을 정수로 만들기
		// int num = (int) (Math.random() * n) + start;
		// n : 정수의 갯수, strat : 시작 숫자
		
//			로또 번호 만들기
//			int score = (int) (Math.random() * 45) + 1;
//			System.out.println(score);
		
			// 81부터 20개의 정수 만들기 -> 81~100
			int score = (int) (Math.random()*20) + 81;
			String grade;
			
			if (score >= 90) {
				if (score >= 95)
					grade = "A+";
				else
					grade = "A";
			} else {
				if (score >= 85)
					grade = "B+";
				else
					grade = "B";
			}
			System.out.println("학점 :" + grade + "점수 :" + score);	
			
	}
}
