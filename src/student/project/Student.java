package student.project;

import java.util.ArrayList;

public class Student {
	protected int studentId; // 학번
	protected String studentName; // 학생이름
	protected Subject majorSubject; // 필수과목
	protected static ArrayList<Score> scoreList = new ArrayList<>(); 
	
	public Student(int studentId, String studentName, Subject majorSubject) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.majorSubject = majorSubject;
	}
	
	public void addSubjectScore(Score score) {
		scoreList.add(score);
	}
}
