package ch08.test;

public class DaoExample {

	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
	
	public static void dbWork(DataAcsessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
}
