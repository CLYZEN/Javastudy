package ljuProject;

public class Warrior extends Job {

	double hp;

	
	public  Warrior(int jobID, String jobName, int hp, int power) {
		super(jobID, jobName);

		super.jobGrade = "Warrior";
		super.power = power ;
		this.hp = hp;
	}
	
		
	

	@Override
	public String showJobInfo() {
		
		return super.showJobInfo() + ", HP : " + hp + " , Offense Power : "+power;
	}

}