package gestione.incendi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping()
public class Controller {

	@GetMapping("/alarm")
	public String checkSonda(
			@RequestParam ("Idsonda") String id, 
			@RequestParam ("Latitudine") String Latitudine, 
			@RequestParam ("Longitudine") String Longitudine,
			@RequestParam ("SmokeLevel") Integer SmokeLevel
			) {
		HttpServletRequest request = ( (HttpServletRequest) ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest() );
        String url = request.getRequestURI();
        String queryString = request.getQueryString();
        String fullUrl = "http://localhost:8082" + url + (queryString != null ? "?" + queryString : "");
        System.out.println(fullUrl);

		
		if (SmokeLevel >= 5) {
		System.out.println("SCAPPATE!!");	
		}

		return "sonda controllata";
	}
	
}
