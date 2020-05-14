package PowerLifters.PowerLiften.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import PowerLifters.PowerLiften.controller.VoortgangService;
import PowerLifters.PowerLiften.domein.Voortgang;

@RestController
public class VoortgangEndpoint {

	@Autowired
	VoortgangService vs;
	
	@GetMapping("/allVoortgang")
	public Iterable<Voortgang> getAllVoortgang(){
		Iterable<Voortgang> iv = vs.vindVoortgang();
		return iv;
	}
	
	@PostMapping("/vulVoortgang")
	public void maakVoortgang(@RequestBody Voortgang voortgang)
	{
		System.out.println("Voortgang: " + voortgang.getLiftaantal() + " is toegevoegd!");
		vs.opslaanVoortgang(voortgang);
	}
}
