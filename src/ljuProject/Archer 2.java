package ljuProject;

public class Archer extends Job{
	double hp;
	int hitrate;
	public Archer(int jobID, String jobName,int hp  ,int power,int hitrate) {
		super(jobID, jobName);

		super.jobGrade = "Archer";
		super.power = power;
		this.hp = hp;
		this.hitrate = hitrate;
}
	@Override
	public String showJobInfo() {
		
		return super.showJobInfo()+ ", HP : " + hp + " , Offense Power : "+power + " , hitrate : " + hitrate+"%";
	}
}