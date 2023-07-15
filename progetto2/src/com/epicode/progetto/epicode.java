package com.epicode.progetto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class epicode {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("progetto2");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
