package gestioneEventi;

import java.sql.SQLException;
import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EventoDAO {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Esercizio s3_g3");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {

		try {
			Evento E1 = new Evento("concerto Vasco", LocalDate.of(2023, 1, 10), "tutto molto bello", tipoEvento.PRIVATO,
					100);

			save(E1);

		} catch (SQLException e) {
			// e.printStackTrace();
			System.err.println(e.getMessage());
		} finally {
			em.close();
			emf.close();
		}

	}

	public static void save(Evento e) throws SQLException {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		System.out.println(e);
	}

	public static void getById(Integer id) throws SQLException {
		em.getTransaction().begin();
		em.find(Evento.class, id);
		em.getTransaction().commit();
		System.out.println(id);
	}

	public static void delete(Evento e) throws SQLException {
		em.getTransaction().begin();
		em.remove(e);
		em.getTransaction().commit();
		System.out.println(e);
	}

	public static void refresh(Evento e) throws SQLException {
		em.getTransaction().begin();
		em.refresh(e);
		em.getTransaction().commit();
		System.out.println(e);
	}

}
