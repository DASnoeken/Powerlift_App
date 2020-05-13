package PowerLifters.PowerLiften.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import PowerLifters.PowerLiften.domein.Voortgang;

@Service
@Transactional
public class VoortgangService {

	@Autowired
	VoortgangRepository vr;
	
	public void opslaanVoortgang(Voortgang v) {
		System.out.println("Voortgang: " + v.getLiftaantal() + " wordt opgeslagen");
		vr.save(v);
	}
	
	public Iterable<Voortgang> vindVoortgang(){
		Iterable<Voortgang> v = vr.findAll();
		return v;
	}
}
