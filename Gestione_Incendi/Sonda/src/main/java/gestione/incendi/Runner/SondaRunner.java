package gestione.incendi.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import gestione.incendi.Service.SondaService;
import gestione.incendi.models.Sonda;
import gestione.incendi.repository.SondaRepo;

@Component
public class SondaRunner implements ApplicationRunner{
	
	@Autowired SondaService sondaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("run....");
		Sonda s1 = new Sonda("49.434354566445", "-161.229609908568", 2);
		sondaService.sendSonda(s1);
		sondaService.saveSonda(s1);
		
		
	}

}
