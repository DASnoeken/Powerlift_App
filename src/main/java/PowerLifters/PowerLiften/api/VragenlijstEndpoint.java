package PowerLifters.PowerLiften.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
		String vragenlijst = vr.getVragen();
		return vr; 
	}
	
	@GetMapping("/verkrijgVragenlijst")
	public Iterable<Vragenlijst> getAllVragenlijsten()
	{
		Iterable<Vragenlijst> vragenlijsten = vs.getAllVragenlijsten();
		return vragenlijsten;
	}
	
	
	@PostMapping("/save/antwoord")
	public void slaAntwoordOp(@RequestBody Vragenlijst vragenlijst) {
		System.out.println("Antwoord: " + vragenlijst.getAntwoorden() + " is opgeslagen!");
		vs.opslaanAntwoorden(vragenlijst);
	}
}
