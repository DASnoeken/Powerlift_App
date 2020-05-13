package PowerLifters.PowerLiften.controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import PowerLifters.PowerLiften.domein.Oefening;

@Service
@Transactional
public class OefeningenService {
	@Autowired
	OefeningenRepository or;
	
	public void opslaanOefening(Oefening o) {
		System.out.println("Oefening: " + o.getNaam() + " wordt opgeslagen!");
		or.save(o);
		
	}
	
	public Iterable<Oefening> vindOefening(){
		Iterable<Oefening> oefeningen = or.findAll();
		return oefeningen;
	}

}
