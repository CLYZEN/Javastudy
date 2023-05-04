package student.project;

public class Score {
	protected int studentid; // 학번
	protected Subject subject; 
	protected int point; // 점수

	public Score(int studentid, Subject subject, int point) {
		this.studentid = studentid;
		this.subject = subject;
		this.point = point;
	}

	public String toString() {
		
		return null;
	}
}