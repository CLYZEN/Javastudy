package student.project;

public class BasicEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int point) {
		if(point >= 90 && point <= 100) {
			return "A";
		} else if(point >= 80 && point <= 89) {
			return "B";
		} else if (point >= 70 && point <= 79) {
			return "C";
		} else if (point >= 55 && point <= 69) {
			return "D";
		} else if (point >= 0 && point <= 54) {
			return "F";
		} else {
			return "점수를 잘못 입력하셨습니다.";
		}
	}

}
