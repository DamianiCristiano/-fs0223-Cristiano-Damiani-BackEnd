import classiMie.MySQL;

public class Main {

	public static void main(String[] args) {
		
		
		MySQL db = new MySQL("localhost", "3306", "libreria", "root", "");
		
		System.out.println(db.isConnected());
		
		
		
	}

}
