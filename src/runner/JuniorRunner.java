package runner;

public class JuniorRunner extends Runner {
	
	int runAccumulatePointRatio;
	
	public JuniorRunner(int runnerID, String runnerName) {
		super(runnerID, runnerName);
		
		super.runnerGrade =  "Junior";
		this.runAccumulatePointRatio = 1;
	}

	@Override
	public void calcAccumulatePoint(int runLength) {
		runAccumulatePoint += (runLength * runAccumulatePointRatio);
	}
	
	
	
}
