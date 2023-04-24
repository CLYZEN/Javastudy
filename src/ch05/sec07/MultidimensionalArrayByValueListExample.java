package ch05.sec07;

public class MultidimensionalArrayByValueListExample {
	public static void main(String[] args) {
		int scores[][] = { { 80, 90, 96 }, { 76, 88 } };

		// 배열 길이
		System.out.println("1차원 배열의 길이(반의 갯수) : " + scores.length);
		System.out.println("2차원 배열의 길이(첫번째 반의 학생수) : " + scores[0].length);
		System.out.println("2차원 배열의 길이(두번째 반의 학생수) : " + scores[1].length);
		System.out.println("====================================");

		// 첫번째 반에서 세번째 학생의 점수
		System.out.println("첫번째 반에서 세번째 학생의 점수 : " + scores[0][2]);

		// 두번째 반에서 두번째 학생의 점수
		System.out.println("두번째 반에서 두번째 학생의 점수 : " + scores[0][1]);

		System.out.println("====================================");
		// 첫번째 반의 평균 점수
		int calss1Sum = 0;
		for (int i = 0; i < scores[0].length; i++) {
			calss1Sum += scores[0][i];
		}
		System.out.println("첫번째 반의 평균 합계 : " + calss1Sum);
		System.out.println("첫번째 반의 평균 점수 : " + (double) calss1Sum / scores[0].length);

		System.out.println("====================================");
		// 두번째 반의 평균 점수
		int calss2Sum = 0;
		for (int i = 0; i < scores[1].length; i++) {
			calss2Sum += scores[1][i];
		}
		System.out.println("두번째 반의 평균 합계 : " + calss2Sum);
		System.out.println("두번째 반의 평균 점수 : " + (double) calss2Sum / scores[1].length);

		System.out.println("====================================");
		// 전체 학생의 평균 점수
		int TotalSum = 0;
		int TotalStudent = 0;
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				TotalSum += scores[i][j];
				TotalStudent++;
			}
		}
		System.out.println("전체 학생의 점수 합계 : " + TotalSum);
		System.out.println("전체 학생의 점수 평균 : " + (double) TotalSum / TotalStudent);

	}
}
