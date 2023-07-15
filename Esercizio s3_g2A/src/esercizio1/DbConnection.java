package esercizio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {

	String url = "jdbc:postgresql://localhost:5432/";
	String dbName = "jpadbtest";
	String user = "postgres";
	String pass = "admin";
	Statement st;

	public DbConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url + dbName, user, pass); // Configura una connessione con il DB
																					// passandogli come paramentro il
																					// path del DB la username e la
																					// password di accesso
		st = conn.createStatement(); // un flusso di dati che mi permette di comunicare con il DB
		createTableStudenti();
		System.out.println("DB Connect!!!");
	}

	public void createTableStudenti() throws SQLException {
		String sql = " CREATE TABLE IF NOT EXISTS studenti (" + "id SERIAL PRIMARY KEY," + "lastname VARCHAR NOT NULL,"
				+ "gender VARCHAR NOT NULL," + "birthdate VARCHAR NOT NULL," + "avg INTEGER NOT NULL,"
				+ "min_vote INTEGER NOT NULL," + "max_vote INTEGER NOT NULL" + " );";
		st.executeUpdate(sql);
	}

	public void inserisciStudente(Studente s) throws SQLException {
		String sql = " INSERT INTO studenti (id, lastname, gender, birthdate, avg, min_vote, max_vote) " +
				"VALUES ('" 
				+ s.getId() + "', '"
				+ s.getLastname() + "', '" 
				+ s.getGender() + "', '" 
				+ s.getBirthDate() + "', '" 
				+ s.getAvg() + "', '"
				+ s.getMin_vote() + "', '" 
				+ s.getMax_vote() + "');"
				;
		st.executeUpdate(sql);
		System.out.println(s.getLastname() + " studente creato!!!");
	}

	public void modificaStudente(Studente s) throws SQLException {
		String sql = " UPDATE studenti SET  " + " lastname = '" + s.getLastname() + "', " + " gender = '"
				+ s.getGender() + "', " + " birth_date '" + s.getGender() + "', " + " avg '" + s.getAvg() + "', "
				+ " min_vote '" + s.getAvg() + "', " + " max_vote '" + s.getMax_vote() + "', ";
		st.executeUpdate(sql);
		System.out.println(s.getLastname() + " udpate!!!");
	}
}
