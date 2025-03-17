import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/";
		String nameDB = "scuola";
		String username = "root";
		String password = "";
		Connection conn = null;
		
		
		Scanner sc = new Scanner(System.in);
		
		try {
			conn = DriverManager.getConnection(url + nameDB, username, password);
			System.out.println("connessione riuscita");
			
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
//			inserimento di un record
//			stmt.executeUpdate("INSERT INTO studente (nome, cognome, classe) VALUES ('cristian','damian','5S')"); inserimento di un record
			
			System.out.println("Inserisco un nuovo studente");
			System.out.println("dammi il nome: ");
			String nome = sc.nextLine();
			System.out.println("dammi il cognome: ");
			String cognome = sc.nextLine();
			System.out.println("dammi la classe: ");
			String classe = sc.nextLine();

			stmt.executeUpdate("INSERT INTO studente (nome, cognome, classe) VALUES('" + nome + "', '" + cognome + "', '" + classe + "')");
			
			stmt.executeQuery("SELECT * FROM studente");
			
            ResultSet rs = stmt.getResultSet();
            
            rs.first();
            do {
            	System.out.println("ID: " + rs.getInt("id") + ", Nome: " + rs.getString("nome") + ", Cognome: " + rs.getString("cognome"));
            	rs.next(); 
            } while (!rs.isLast());
            
            
            
            
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
