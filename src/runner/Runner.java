package runner;

public class Runner {
	protected int runnerID;
	protected String runnerName;
	protected String runnerGrade;
	protected int runLength;
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
		runnerGrade = "Common";
		runLength = 0;
		runAccumulatePointRatio = 2;
	}
	
	public void calcAccumulatePoint(int runLength) {
		runAccumulatePoint += (runLength * runAccumulatePointRatio);
	}
	
	public String showRunner() {
		return runnerName + " 님은 " + runnerGrade + "등급 runner입니다." + "포인트" + runAccumulatePoint;
	}

	public int getRunnerID() {
		return runnerID;
	}

	public void setRunnerID(int runnerID) {
		this.runnerID = runnerID;
	}

	public String getRunnerName() {
		return runnerName;
	}

	public void setRunnerName(String runnerName) {
		this.runnerName = runnerName;
	}

	public String getRunnerGrade() {
		return runnerGrade;
	}

	public void setRunnerGrade(String runnerGrade) {
		this.runnerGrade = runnerGrade;
	}

	public int getRunLength() {
		return runLength;
	}

	public void setRunLength(int runLength) {
		this.runLength = runLength;
	}
	
	
}
