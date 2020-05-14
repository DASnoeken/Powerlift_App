package PowerLifters.PowerLiften.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import PowerLifters.PowerLiften.domein.Vragenlijst;

@RestController
public class VragenlijstEndpoint {
	
	@GetMapping("/vulVragenlijst")
	public String[] getAllVragen() {
		Vragenlijst vr = new Vragenlijst();
		String[] vragenlijst = vr.getVragen();
		return vragenlijst; 
	}
}
