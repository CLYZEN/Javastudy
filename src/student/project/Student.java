package student.project;

import java.util.ArrayList;

public class Student {
	protected int studentid; // 학번
	protected String studentName; // 학생이름
	protected Subject majorSubject; // 전공
	protected static ArrayList<Score> scoreList = new ArrayList<>(); // 점수
	
	public Student(int studentid, String studentName, Subject majorSubject) {
		this.studentid = studentid;
		this.studentName = studentName;
		this.majorSubject = majorSubject;
	}
	
	public void addSubjectScore(Score score) {
		scoreList.add(score);
	}
}
