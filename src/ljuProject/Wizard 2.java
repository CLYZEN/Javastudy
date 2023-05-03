package ljuProject;

public class Wizard  extends Job{
	double hp;
	private int mp;

	public Wizard(int jobID, String jobName, int mp, int power) {
		super(jobID, jobName);

		super.jobGrade = "Wizard";
		super.power = power;
		this.hp = 50;
		this.mp = mp;
	}
	
	@Override
	public String showJobInfo() {
		
		return super.showJobInfo()  +", HP :"+hp+", MP : " + mp + " , Magical Power : "+power;
	}
}