package student.project;

import java.util.ArrayList;

public class Subject {
	protected String subjectName; // 과목명
	protected int subjectid; // 과목id
	protected int GradeType; // 1은 컴공 2는 국문
	protected static ArrayList<Student> studentList = new ArrayList<>();
	
	public Subject (String subjectName,int subjectid) {
		this.subjectName = subjectName;
		this.subjectid = subjectid;
	}
	
	public void register(Student student) {
		studentList.add(student);
	}
}
