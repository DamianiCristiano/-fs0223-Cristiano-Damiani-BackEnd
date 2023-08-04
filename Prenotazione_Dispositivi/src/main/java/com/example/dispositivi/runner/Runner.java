package com.example.dispositivi.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.dispositivi.repository.DispositivoRepository;
import com.example.dispositivi.repository.UtenteRepository;
import com.example.dispositivi.service.DispositivoService;
import com.example.dispositivi.service.UtenteService;

@Component
public class Runner implements ApplicationRunner {

	@Autowired
	UtenteService utenteService;

	@Autowired
	DispositivoService dispositivoServ;

	@Autowired
	UtenteRepository utenteRepo;

	@Autowired
	DispositivoRepository dispositivoRepo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("run...");

//		for (int i = 0; i < 10; i++) {
//			utenteService.saveFakeUtente();
//		}
//
//		Utente u1 = utenteRepo.findById(1);
//
//		dispositivoServ.saveLaptop(u1, Status.ASSEGNATO);
//		Dispositivo l1 = dispositivoRepo.findById(1);

	}

}
