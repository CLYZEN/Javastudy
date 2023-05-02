package runner;

public class Runner {
	private int runnerID;
	private String runnerName;
	private String runnerGrade;
	private int runLength;
	int runAccumulatePoint;
	int runAccumulatePointRatio;
	
	public Runner() {
		initRunner();
	}
	
	public Runner(int runnerID, String runnerName) {
		this.runnerID = runnerID;
		this.runnerName = runnerName;
		initRunner();
	}
	
	private void initRunner() {
		runnerGrade = "Normal";
		runLength = 0;
		runAccumulatePointRatio = 2;
	}
	
	public void calcAccumulatePoint(int runLength) {
		runAccumulatePoint += (runLength * runAccumulatePointRatio);
	}
	
	public String showRunner() {
		return runnerName + " 님은 " + runnerGrade + "등급 runner입니다.";
	}
}
