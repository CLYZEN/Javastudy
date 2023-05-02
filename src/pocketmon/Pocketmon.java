package pocketmon;

public class Pocketmon {
		
		protected String pocketmonName;
		protected String pocketmonNickName;
		protected String pocketmonAttribute;
		int pocketmonHealth;
		int pocketmonLevel;
		int pocketmonAttackPoint;
		int pocketmonSellPoint;
		protected int pocketmonPoint;
		
		public Pocketmon() {
			initPocketmon();
		}
		
		public Pocketmon(String pocketmoNickName) {
			this.pocketmonNickName = pocketmoNickName;
			initPocketmon();
		}
		
		private void initPocketmon() {
			this.pocketmonName = "미정";
			this.pocketmonHealth = (int) (Math.random() * 100) + 50;
			this.pocketmonLevel = 1;
			this.pocketmonAttackPoint = (int) (Math.random() * 10) + 1;
		}
		
		public void sellPocketmon() {
			this.pocketmonPoint += pocketmonSellPoint;
		}
		
		public void monsterballIn() {
			System.out.println("들여보냈다 !");
		}
		
		public void monsterballOut() {
			System.out.println("꺼냈다 !");
		}
		
		public String showPocketmon() {
			return pocketmonName + "|" + pocketmonNickName + "|" +  pocketmonAttribute + "|" + pocketmonHealth + "|" + pocketmonLevel + "|" +  pocketmonAttackPoint;  
		}

		public String getPocketmonName() {
			return pocketmonName;
		}

		public void setPocketmonName(String pocketmonName) {
			this.pocketmonName = pocketmonName;
		}

		public String getPocketmonNickName() {
			return pocketmonNickName;
		}

		public void setPocketmonNickName(String pocketmonNickName) {
			this.pocketmonNickName = pocketmonNickName;
		}

		public String getPocketmonAttribute() {
			return pocketmonAttribute;
		}

		public void setPocketmonAttribute(String pocketmonAttribute) {
			this.pocketmonAttribute = pocketmonAttribute;
		}

		public int getPocketmonPoint() {
			return pocketmonPoint;
		}

		public void setPocketmonPoint(int pocketmonPoint) {
			this.pocketmonPoint = pocketmonPoint;
		}
		
		
		
}
