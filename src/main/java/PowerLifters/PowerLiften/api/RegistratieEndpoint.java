package PowerLifters.PowerLiften.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import PowerLifters.PowerLiften.controller.RegistratieService;
import PowerLifters.PowerLiften.domein.Oefening;
import PowerLifters.PowerLiften.domein.Registratie;

@RestController
public class RegistratieEndpoint {
	@Autowired
	RegistratieService rs;
	
		@PostMapping("/registreerdeSporter")
		public void getTestParam(@RequestBody Registratie r) {
			System.out.println(r.getInlognaam() + " is opgeslagen");
			rs.opslaanRegistratie(r);
		}
		
		@GetMapping("/allSporters")
		public Iterable<Registratie> getSporters(){
			Iterable<Registratie> oefeningen = rs.vindOefening();
			return oefeningen; 
		}
}
