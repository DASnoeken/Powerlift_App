package PowerLifters.PowerLiften.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@PostMapping("/vulVoortgang/{id}")
	public void maakVoortgang(@RequestBody Voortgang voortgang, @PathVariable long id)
	{
	
		System.out.println("Voortgang: " + voortgang.getLiftaantal() + " is toegevoegd!");
		vs.opslaanVoortgang(voortgang, id);
	}
	
	@PostMapping("/verwijderOefening")
	public void verwijderOefening(@RequestBody Long id) {
		System.out.println("Voortgang: " + id + " is verwijderd!");
		vs.verwijderVoortgang(id);
	}
}
