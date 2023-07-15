package com.epicode.esercizio;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Esercizio_w1_s3_g5");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {

		try {
			Libri L1 = new Libri("A2B3", "franco", 2019, 123, "giovanni", "horror");
			Libri L2 = new Libri("A2B4", "reiowur", 2019, 123, "giovanni", "horror");
			Libri L3 = new Libri("A2B5", "fdksfjghfd", 2019, 123, "giorgio", "ajeje");
			Utenti U1 = new Utenti("gerald", "rivia", LocalDate.of(1945, 12, 25), 4);
			Utenti U2 = new Utenti("gerardo", "Dirivia", LocalDate.of(1947, 12, 25), 6);
			Prestito P1 = new Prestito(U1, L2, LocalDate.of(2023, 4, 20), LocalDate.of(2023, 6, 20));
			Prestito P2 = new Prestito(U1, L1, LocalDate.of(2023, 4, 20), LocalDate.of(2023, 6, 20));
			Prestito P3 = new Prestito(U1, L3, LocalDate.of(2023, 4, 20), null);

			// aggiungiPrestito(P3);
			// aggiungiUtente(U2);
			// aggiungiElemento(L3); // FUNZIONA
			// rimuoviElemento("A2B3"); //FUNZIONA
			// ricercaPerTitolo("franco"); // FUNZIONA
			// ricercaPerIsbn("A2B3"); // FUNZIONA
			// ricercaPerAnnoPubblicazione(2018); // FUNZIONA'
			// ricercaPerAutore("giovanni"); //FUNZIONA
			// ricercaPerTitolo("rei"); //FUNZIONA
			// ricercaPerTesseraUtente(4);
			 prestitiScaduti(LocalDate.of(2024, 6, 10));

		} catch (SQLException e) {
			// e.printStackTrace();
			System.err.println(e.getMessage());
		} finally {
			em.close();
			emf.close();
		}
	}

	public static void aggiungiElemento(Catalogo_bibliotecario c) throws SQLException {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		System.out.println(c);
	}

	public static void aggiungiUtente(Utenti u) throws SQLException {
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		System.out.println(u);
	}

	public static void aggiungiPrestito(Prestito p) throws SQLException {
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		System.out.println(p);
	}

	public static void rimuoviElemento(String isbn) throws SQLException {
		em.getTransaction().begin();
		Catalogo_bibliotecario Fisbn = em.find(Catalogo_bibliotecario.class, isbn);
		System.out.println(Fisbn);
		em.remove(Fisbn);
		em.getTransaction().commit();
	}

	public static void ricercaPerIsbn(String isbn) throws SQLException {
		em.getTransaction().begin();
		Catalogo_bibliotecario FIsbn = em.find(Catalogo_bibliotecario.class, isbn);
		em.getTransaction().commit();
		System.out.println(FIsbn);
	}

	public static void ricercaPerAnnoPubblicazione(Integer anno) throws SQLException {
		Query query = em.createQuery("SELECT l FROM Catalogo_bibliotecario l WHERE l.annoPubblicazione = :anno",
				Catalogo_bibliotecario.class);
		query.setParameter("anno", anno);
		List<Catalogo_bibliotecario> result = query.getResultList();
		if (!result.isEmpty()) {
			for (Catalogo_bibliotecario libri : result) {
				System.out.println(libri.getTitolo());
			}
		} else {
			System.out.println("non ho trovato alcun libro di quell' anno");
		}
	}

	public static void ricercaPerAutore(String autore) throws SQLException {
		Query query = em.createQuery("SELECT l FROM Catalogo_bibliotecario l WHERE l.autore = :autore",
				Catalogo_bibliotecario.class);
		query.setParameter("autore", autore);
		List<Catalogo_bibliotecario> result = query.getResultList();
		if (!result.isEmpty()) {
			for (Catalogo_bibliotecario libri : result) {
				System.out.println(libri.getTitolo());
			}
		} else {
			System.out.println("non ho trovato alcun libro di quell' autore");
		}
	}

	public static void ricercaPerTitolo(String titolo) throws SQLException {
		Query query = em.createQuery(
				"SELECT l FROM Catalogo_bibliotecario l WHERE SUBSTRING(l.titolo, :inizio, :lunghezza) = :titolo",
				Catalogo_bibliotecario.class);
		query.setParameter("inizio", 1);
		query.setParameter("lunghezza", 3);
		query.setParameter("titolo", titolo);
		List<Catalogo_bibliotecario> result = query.getResultList();
		if (!result.isEmpty()) {
			for (Catalogo_bibliotecario libri : result) {
				System.out.println(libri.getTitolo());
			}
		} else {
			System.out.println("non ho trovato alcun libro con quel titolo");
		}
	}

	public static void ricercaPerTesseraUtente(Integer tessera) throws SQLException {
		Query query = em.createQuery("SELECT p FROM Prestito p WHERE p.utente.numeroDiTessera = :tessera",
				Prestito.class);
		query.setParameter("tessera", tessera);
		List<Prestito> result = query.getResultList();
		if (!result.isEmpty()) {
			for (Prestito Prestiti : result) {
				System.out.println(Prestiti);
			}
		} else {
			System.out.println("non ho trovato alcun prestito per questa tessera");

		}
	}

	public static void prestitiScaduti(LocalDate data) throws SQLException {
		Query query = em.createQuery(
				"SELECT d FROM Prestito d WHERE d.dataRestituzionePrevista < :data AND d.dataRestituzioneEffettiva = NULL",
				Prestito.class);
		query.setParameter("data", data);
		List<Prestito> result = query.getResultList();
		if (!result.isEmpty()) {
			for (Prestito Prestiti : result) {
				System.out.println(Prestiti);
			}
		} else {
			System.out.println("non ho trovato alcun prestito scaduto");

		}
	}
}
