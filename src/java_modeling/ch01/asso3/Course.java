package java_modeling.ch01.asso3;

import java.util.ArrayList;

public class Course {
	private String name;
	private ArrayList<Transcript> transcripts;
	
	public Course(String name) {
		this.name = name;
		transcripts = new ArrayList<>();
	}

	public String getName() {
		return name;
	}
	
	// 수강신청 추가
	public void  addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}

}
