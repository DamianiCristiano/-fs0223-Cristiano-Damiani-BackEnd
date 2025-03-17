import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("dammi il nome dello studente");
		String nome = sc.nextLine();

		try {

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scuola", "root", "");
			
			
			// Prepared Statement
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM studente WHERE nome = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.setString(1, nome);
			ResultSet rs = stmt.executeQuery();
			
            if (rs.next()) {
            	System.out.println("Nome: " + rs.getString("nome"));
                System.out.println("Cognome: " + rs.getString("cognome"));
                System.out.println("Classe: " + rs.getString("classe"));;
            } else {
            	System.out.println("Studente non trovato");
            }
		} catch (SQLException e) {
			System.out.println("Errore: " + e.getMessage());
			e.printStackTrace();
		}

	}

}
