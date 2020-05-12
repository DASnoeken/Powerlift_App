package PowerLifters.PowerLiften.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import PowerLifters.PowerLiften.controller.OefeningenService;
import PowerLifters.PowerLiften.domein.Oefening;

@RestController
public class OefeningenEndpoint {
	@Autowired
	OefeningenService os;
	
	@GetMapping("/allOefeningen")
	public Iterable<Oefening> getAllOefening() {
		Iterable<Oefening> oefeningen = os.vindOefening();
		return oefeningen; 
	}
	
	@PostMapping("/vulOefeningen")
	public void maakOefening(@RequestBody Oefening oefening) {
		System.out.println("Oefening: " + oefening + " is toegevoegd!");
		os.opslaanOefening(oefening);
	}
}
