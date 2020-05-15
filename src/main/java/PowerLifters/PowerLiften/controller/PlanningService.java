package PowerLifters.PowerLiften.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import PowerLifters.PowerLiften.domein.GegevenTraining;
import PowerLifters.PowerLiften.domein.GeregistreerdeSporter;
import PowerLifters.PowerLiften.domein.Planning;

@Service
@Transactional
public class PlanningService {
	@Autowired
	PlanningRepository ps;
	
	@Autowired
	GeregistreerdeSporterRepository gs;
	
	@Autowired
	GegevenTrainingRepository gtr;
	
	public void opslaanSporter(Planning p,long id) {
		GeregistreerdeSporter ges = gs.findById(id).get();
		p.setGeregistreerdeSporter(ges);
		ps.save(p);
	}
	
	public void opslaanOefening(Planning p, long id) {
		GegevenTraining gt = gtr.findById(id).get();
		p.addTraining(gt);
		ps.save(p);
	    
	}
	
	public Iterable<Planning> vindPlanning(){
		Iterable<Planning> p = ps.findAll();
		return p;
	}
	
	public void verwijderPlanning(Long id) {
		System.out.println("Planning: " + id + " wordt verwijderd");
		ps.deleteById(id);
	}

	public void opslaanPlanning(Planning p) {
		ps.save(p);
		
	}
}
