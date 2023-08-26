package gestione.incendi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import gestione.incendi.models.Sonda;
import gestione.incendi.repository.SondaRepo;

@Service
public class SondaService {

	@Autowired
	SondaRepo sondaRepo;

	public void sendSonda(Sonda s) {
		RestTemplate rt = new RestTemplate();
		String st = "http://localhost:8081/alarm?Idsonda=1" + "&Latitudine=" + s.getLatitudine()
				+ "&Longitudine=" + s.getLongitudine() + "&SmokeLevel=" + s.getSmokeLevel();
		System.out.println(st);
		rt.getForEntity(st, String.class);
	}
	
	public void saveSonda (Sonda s) {
		sondaRepo.save(s);
	}

}
