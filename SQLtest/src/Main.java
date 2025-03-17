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

		studente s = new studente();

		try {
			conn = DriverManager.getConnection(url + nameDB, username, password);
			System.out.println("connessione riuscita");
		} catch (SQLException e) {
			System.out.println("errore : " + e.getMessage());
		}

		int scelta = 0;

		System.out.println("cosa vuoi fare");

		do {
			System.out.println("inserire numero tra 1 e 4");
			scelta = sc.nextInt();
			sc.nextLine();
			if (scelta < 1 || scelta > 4) {
				System.out.println("scelta non valida");
				scelta = 0;
				continue;
			} else {

				if (scelta == 1) {
					try {
						s.creaStudente();
						Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
								ResultSet.CONCUR_READ_ONLY);
						stmt.executeUpdate("INSERT INTO studente (nome, cognome, classe) VALUES('" + s.nome + "', '"
								+ s.cognome + "', '" + s.classe + "')");
					} catch (SQLException e) {
						System.out.println("inserimento non valido" + e.getMessage());
					}
				} else if (scelta == 2) {
					try {
						Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
								ResultSet.CONCUR_READ_ONLY);
						stmt.executeQuery("SELECT * FROM studente");
						int count = 0;

						ResultSet rs = stmt.getResultSet();
						rs.last();
						int row = rs.getRow();
						rs.first();
						do {
							System.out.println("ID: " + rs.getInt("id") + ", Nome: " + rs.getString("nome")
									+ ", Cognome: " + rs.getString("cognome"));
							rs.next();
							count++;
						} while (count < row);
					} catch (SQLException e) {
						System.out.println("Error: " + e.getMessage());
					}
				} else if (scelta == 3) {

					try {

						Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
						System.out.println("Inserire nome dello studente da eliminare:");
						String nome = sc.nextLine();
						System.out.println("inserisci cognome dello studente:");
						String cognome = sc.nextLine();
						ResultSet bool = stmt.executeQuery("SELECT * FROM studente WHERE nome='" + nome + "' AND cognome='" + cognome + "'");
						if (!bool.next()) {
							System.out.println("Studente non trovato");
							continue;
						} else {
							stmt.executeUpdate("DELETE FROM studente WHERE nome='" + nome + "' AND cognome='" + cognome + "'");
						}

					} catch (SQLException e) {
						System.out.println("Error: " + e.getMessage());
					}

				}

			}

		} while (scelta != 4);
		System.out.println("buona giornata");

	}

}
