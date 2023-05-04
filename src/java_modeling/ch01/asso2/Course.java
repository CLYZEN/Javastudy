package java_modeling.ch01.asso2;

import java.util.ArrayList;

public class Course {
	private String name;
	private ArrayList<Student> students; // 양방향 관계 서로가 서로의 객체를 필드로 가지고 있음
	
	public Course(String name) {
		this.name = name;
		students = new ArrayList<Student>();
	}
	
	public String getName() {
		return name;
	}
	
	// 수강신청한 학생 추가
	public void addStudnet(Student student) {
		students.add(student);
	}
	// 수강취소한 학생 제거
	public void removeStudent(Student student) {
		students.remove(student);
	}
}
