package PowerLifters.PowerLiften.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import PowerLifters.PowerLiften.domein.Oefening;
import PowerLifters.PowerLiften.domein.Registratie;

@Service
@Transactional
public class RegistratieService {
	@Autowired
	RegistratieRepository rs;
	
	public void opslaanRegistratie(Registratie r) {
		System.out.println("User " + r.getInlognaam() + " wordt opgeslagen!");
		rs.save(r);
		
	}

	public Iterable<Registratie> vindOefening() {
		Iterable<Registratie> oefeningen = rs.findAll();
		return oefeningen;
	}
	
	
}
