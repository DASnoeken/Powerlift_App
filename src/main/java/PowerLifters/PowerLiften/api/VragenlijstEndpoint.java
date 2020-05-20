package PowerLifters.PowerLiften.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import PowerLifters.PowerLiften.controller.VragenlijstService;
import PowerLifters.PowerLiften.domein.Oefening;
import PowerLifters.PowerLiften.domein.Vragenlijst;

@RestController
public class VragenlijstEndpoint {
	
	@Autowired
	VragenlijstService vs;
	
	@GetMapping("/vulVragenlijst")
	public Vragenlijst getAllVragen() {
		Vragenlijst vr = new Vragenlijst();
		return vr; 
	}
	
	@GetMapping("/verkrijgVragenlijst")
	public Iterable<Vragenlijst> getAllVragenlijsten()
	{
		System.out.println("hoi");
		Iterable<Vragenlijst> vragenlijsten = vs.getAllVragenlijsten();
		return vragenlijsten;
	}
	
	@GetMapping("/getVragenlijstByID/{id}")
	public Optional<Vragenlijst> getVragenlijstById(@PathVariable long id){
		Optional<Vragenlijst> antwoord = vs.getVragenlijstById(id);
		return antwoord;
	}
	
	@PostMapping("/save/antwoord/{id}")
	public void slaAntwoordOp(@RequestBody Vragenlijst vragenlijst, @PathVariable long id) {
		System.out.println("Antwoord: " + vragenlijst.getAntwoorden() + " is opgeslagen!");
		vs.opslaanAntwoorden(vragenlijst, id);
	}
}