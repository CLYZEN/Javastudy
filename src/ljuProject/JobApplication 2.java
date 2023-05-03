package ljuProject;

import java.util.ArrayList;
import java.util.Scanner;


public class JobApplication {
	private static ArrayList<Job> jobList = new ArrayList<>();
	private static Job[] jobArray = new Job[100]; // 없어도 됩니다.
	private static Scanner scanner = new Scanner(System.in);
	private static int id;
	static int index = 0;
	
	public static void main(String[] args) {

		Job jobbae = new Job(1, "배철수");
		Job joban = new Job(2, "안철수");

		Job jobBe = new Warrior(3, "헤라클래스", 300, 300);
		Job jobas = new Warrior(4, "아레스", 400, 400);

		Job jobga = new Wizard(5, "해리포터", 80000, 300);
		Job jobex = new Wizard(6, "간달프", 1200000, 600);

		Job jobre = new Archer(7, "레골라스", 140, 200, 100);
		Job jobgo = new Archer(8, "주몽", 160, 300, 100);

		jobList.add(jobbae);
		jobList.add(joban);
		jobList.add(jobBe);
		jobList.add(jobas);
		jobList.add(jobga);
		jobList.add(jobex);
		jobList.add(jobre);
		jobList.add(jobgo);


		
		boolean run = true;

		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.인물생성 | 2.인물생성목록 | 3.인물삭제 | 4.종료");

			System.out.println("-------------------------------------------");
			System.out.println("선택> ");
			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:
				CharacterCreate();
				break;
			case 2:
				Characterlist();
				break;
			case 3:
				RemoveList();
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("1~4사이의 숫자를 입력해주세요");
				break;
			}

		}

	}

	private static void CharacterCreate() {
		System.out.println("직업을 선택하세요.");
		System.out.println("1. 전사 | 2. 궁수 | 3. 마법사 ");
		System.out.print("선택 > ");
		int selectJob = scanner.nextInt();
		if(selectJob == 1) {
			System.out.println("전사의 ID 를 입력해주세요(숫자)");
			System.out.print("입력 > ");
			int warriorId = scanner.nextInt();
			System.out.println("전사의 닉네임을 입력해주세요(문자)");
			System.out.print("입력 > ");
			String warriorName = scanner.next();
			System.out.println("전사의 초기HP값은? (숫자)");
			System.out.print("입력 > ");
			int warriorHP = scanner.nextInt();
			System.out.println("전사의 초기 공격력은? (숫자)");
			System.out.print("입력 > ");
			int warriorPower = scanner.nextInt();
			
			Warrior warrior = new Warrior(warriorId,warriorName,warriorHP,warriorPower);
			jobList.add(warrior);
			System.out.println("캐릭터 생성이 완료되었습니다.");
		} else if(selectJob == 2) {
			System.out.println("궁수의 ID 를 입력해주세요(숫자)");
			System.out.print("입력 > ");
			int archerId = scanner.nextInt();
			System.out.println("궁수의 닉네임을 입력해주세요(문자)");
			System.out.print("입력 > ");
			String archerName = scanner.next();
			System.out.println("궁수의 초기HP값은? (숫자)");
			System.out.print("입력 > ");
			int archerHP = scanner.nextInt();
			System.out.println("궁수의 초기 공격력은? (숫자)");
			System.out.print("입력 > ");
			int archerPower = scanner.nextInt();
			System.out.println("궁수의 명중률은? (숫자)");
			System.out.print("입력 > ");
			int archerHitRate = scanner.nextInt();
			
			Archer archer = new Archer(archerId,archerName,archerHP,archerPower,archerHitRate);
			jobList.add(archer);
			System.out.println("캐릭터 생성이 완료되었습니다.");
		} else if(selectJob == 3) {
			System.out.println("마법사의 ID 를 입력해주세요(숫자)");
			System.out.print("입력 > ");
			int wizardId = scanner.nextInt();
			System.out.println("마법사의 닉네임을 입력해주세요(문자)");
			System.out.print("입력 > ");
			String wizardName = scanner.next();
			System.out.println("마법사의 초기HP값은? (숫자)");
			System.out.print("입력 > ");
			int wizardHP = scanner.nextInt();
			System.out.println("마법사의 초기 공격력은? (숫자)");
			System.out.print("입력 > ");
			int wizardPower = scanner.nextInt();
			
			Wizard wizard = new Wizard(wizardId,wizardName,wizardHP,wizardPower);
			jobList.add(wizard);
			System.out.println("캐릭터 생성이 완료되었습니다.");
		} else {
			System.out.println("잘못 입력하셨습니다. 다시 시도해 주세요.");
			return;
		}
	}

	private static void Characterlist() {
		System.out.println("===========================");
		System.out.println("케릭터목록");
		System.out.println("===========================");
		showAllJob();
		System.out.println("===========================");

	}
	
	public static Job findJob(String jobName) {
		Job resultJob = null;
		for(Job job : jobList) {
			if(job.getJobName() == jobName) {
				resultJob = job;
				break;
			}
		}
		return resultJob;
	}
	
	
	private static void RemoveList() {
	Scanner scanner = new Scanner(System.in);
		
	System.out.println("삭제할 인물을 고르시오");
	System.out.println("===========================");
	showAllJob();
		System.out.println("캐릭터 번호 선택 > ");
		int result = scanner.nextInt();
		jobList.remove(result-1);
		System.out.println("삭제가 완료되었습니다.");
		showAllJob();
	
	System.out.println("===========================");
	}
	private static void showAllJob() {
		// TODO Auto-generated method stub
		System.out.println("============== 인물 직업 정보=============");
		
		for (Job job : jobList) {
			System.out.print(index+1 +"번 캐릭터 : ");
			System.out.println(job.showJobInfo());
			index++;
		}
		index=0;
		System.out.println("================= 선택창 ================");

	}
}