package student.project;

public class Score {
	protected int studentid; // 학번
	protected Subject subject; 
	protected int point; // 점수?

	public Score(int studentid, Subject subject, int point) {
		this.studentid = studentid;
		this.subject = subject;
		this.point = point;
	}

	public String toString() {
		if (point >= 95 && point <= 100)
			return "S";
		else if (point >= 90 && point <= 94)
			return "A";
		else if (point >= 80 && point <= 89)
			return "B";
		else if (point >= 70 && point <= 79)
			return "C";
		else if (point >= 60 && point <= 69)
			return "D";
		else
			return "F";
	}
}