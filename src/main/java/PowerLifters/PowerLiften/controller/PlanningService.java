package PowerLifters.PowerLiften.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import PowerLifters.PowerLiften.domein.Planning;

@Service
@Transactional
public class PlanningService {
	@Autowired
	PlanningRepository ps;
	
	public void opslaanPlanning(Planning p) {
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
}
