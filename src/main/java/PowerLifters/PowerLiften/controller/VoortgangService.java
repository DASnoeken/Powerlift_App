package PowerLifters.PowerLiften.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import PowerLifters.PowerLiften.domein.GeregistreerdeSporter;
import PowerLifters.PowerLiften.domein.Oefening;
import PowerLifters.PowerLiften.domein.Voortgang;

@Service
@Transactional
public class VoortgangService {

	@Autowired
	VoortgangRepository vr;
	
	@Autowired
	OefeningenRepository or;
	
	@Autowired 
	VragenlijstRepository vlr;
	
	@Autowired
	GeregistreerdeSporterRepository gsr;
	
	private long hetID;
	
	public void opslaanVoortgang(Voortgang v, String naam) {
		System.out.println("Voortgang: " + v.getLiftaantal() + " wordt opgeslagen");
		Oefening o = or.findByNaam(naam).get();
		v.setOefening(o);
		vr.save(v);
		System.out.println("Het id was "+v.getId());
		setID(v);
	}
	
	public void opslaanVoortgang(Voortgang v, String naam,long sporterID) {
		System.out.println("Voortgang: " + v.getLiftaantal() + " wordt opgeslagen");
		Oefening o = or.findByNaam(naam).get();
		v.setOefening(o);
		GeregistreerdeSporter gs = gsr.findById(sporterID).get();
		v.setSporter(gs);
		vr.save(v);
		System.out.println("Het id was "+v.getId());
		setID(v);
	}
	
	public void setID(Voortgang v) {
		hetID = v.getId();
	}
	
	public long getID() {
		return hetID;
	}
	
	public void verwijderVoortgang(Long id) {
		System.out.println("Voortgang: " + id + " wordt verwijderd");
		vr.deleteById(id);
	}
	
	public Iterable<Voortgang> vindVoortgang(){
		Iterable<Voortgang> v = vr.findAll();
		return v;
	}
	public Iterable<Voortgang> vindVoortgang(long sporterID){
		Iterable<Voortgang> v = vr.findAllSporterID(sporterID);
		return v;
	}
	
	public void geefAntwoord(String antwoord,long id) {
		vr.findById(id).get().setAntwoorden(antwoord);
	}
}
