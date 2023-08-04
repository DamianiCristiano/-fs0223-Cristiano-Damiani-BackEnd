package com.example.dispositivi.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.dispositivi.Exception.EqualStatusException;
import com.example.dispositivi.classes.Dispositivo;
import com.example.dispositivi.classes.Laptop;
import com.example.dispositivi.classes.Smartphone;
import com.example.dispositivi.classes.Status;
import com.example.dispositivi.classes.Tablet;
import com.example.dispositivi.classes.Utente;
import com.example.dispositivi.repository.DispositivoRepository;

@Service
public class DispositivoService {

	@Autowired
	DispositivoRepository dispositivoRepo;

	@Autowired
	@Qualifier("newTablet")
	private ObjectProvider<Tablet> tabletProvider;

	@Autowired
	@Qualifier("newSmartphone")
	private ObjectProvider<Smartphone> smartphoneProvider;

	@Autowired
	@Qualifier("newLaptop")
	private ObjectProvider<Laptop> laptopProvider;

	public void saveTablet(Utente utente, Status stato) {
		Tablet t = tabletProvider.getObject();
		t.setUtente(utente);
		t.setStatus(stato);
		dispositivoRepo.save(t);
		System.out.println("Elemento " + t.getId() + " salvato nel DB!!");
	}

	public void saveSmartphone(Utente utente, Status stato) {
		Smartphone s = smartphoneProvider.getObject();
		s.setUtente(utente);
		s.setStatus(stato);
		dispositivoRepo.save(s);
		System.out.println("Elemento " + s.getId() + " salvato nel DB!!");
	}

	public void saveLaptop(Utente utente, Status stato) {
		Laptop l = laptopProvider.getObject();
		l.setUtente(utente);
		l.setStatus(stato);
		dispositivoRepo.save(l);
		System.out.println("Elemento " + l.getId() + " salvato nel DB!!");
	}

	public void changeStatusLaptop(Long id, Status s) throws EqualStatusException {
		Dispositivo d = dispositivoRepo.findById(id).get();
		if (d.getStatus() == s) {
			throw new EqualStatusException("il dispositivo ha gia' questo stato");
		}
		d.setStatus(s);
		dispositivoRepo.save(d);
		System.out.println("stato aggiornato, nuovo stato: " + d.getStatus());

	}

}
