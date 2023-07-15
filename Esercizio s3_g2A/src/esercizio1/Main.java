package esercizio1;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			// Creo una connessione al DB
			DbConnection db = new DbConnection();

			// Creo un oggetto di tipo Studente
			Studente s = new Studente("1", "Rossi", "maschio", "1990 / 12 / 10", 25, 10, 20);
			// Studente g = new Utente("Giuseppe", "Verdi", 41, "g.verdi@example.com");
			// Studente f = new Utente("Francesca", "Neri", 33, "f.neri@example.com");
			// Lo salvo nel DB
			db.inserisciStudente(s);

			// Utente utente = db.leggiDettaglioUtente(1); // leggo un utente nel DB con un
			// id specifico
			// System.out.println(utente);

			// Modifico qualcosa dell'ogg letto
			// utente.setAnni(99);
			// Salvo nel DB le modifiche fatte
			// db.modificaUtente(utente);

			// rimuovo un ogg dal DB
			// db.cancellaUtente(utente);

			// leggo tutti gli ogg presenti nel db e li inserisco in una lista
//			List<Studente> lista = db.leggiUtenti();
//			lista.forEach(ut -> System.out.println(ut));

		} catch (SQLException e) {
			// e.printStackTrace();
			System.err.println(e.getMessage());
		}

	}

}
