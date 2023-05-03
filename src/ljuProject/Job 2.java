package ljuProject;

//시민 등급 고객에 대한 class
public class Job {
	protected int jobID;
	protected String jobName;
	protected String jobGrade;
	double power;
	int id;

	public Job() {
		initJob();
	}

	public Job(int JobID, String JobName) {
		this.jobID = JobID;
		this.jobName = JobName;
		
		initJob();
	}

	private void initJob() {
		jobGrade = "Citizen";
		
	}

	public String showJobInfo() {
		return jobName + " = " + "Class : " + jobGrade;
	}

	public int getJobID() {
		return jobID;
	}

	public void setJobID(int jobID) {
		this.jobID = jobID;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobGrade() {
		return jobGrade;
	}

	public void setJobGrade(String jobGrade) {
		this.jobGrade = jobGrade;
	}

}