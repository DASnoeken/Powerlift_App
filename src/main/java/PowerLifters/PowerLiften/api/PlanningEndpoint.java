package PowerLifters.PowerLiften.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import PowerLifters.PowerLiften.controller.PlanningService;
import PowerLifters.PowerLiften.domein.Planning;


@RestController
public class PlanningEndpoint {
	@Autowired
	PlanningService ps;
	
	@GetMapping("/allPlanning")
	public Iterable<Planning> getAllPlanning(){
		Iterable<Planning> ip = ps.vindPlanning();
		return ip;
	}
	@PostMapping("/vulPlanning")
	public long maakPlanning(@RequestBody Planning p)
	{
		System.out.println("Planning: " + p.getId() + " is toegevoegd!");
		ps.opslaanPlanning(p);
		return p.getId();
	}
	
	@PostMapping("/vulPlanningSporter/{id}")
	public void maakPlanningSporter(@RequestBody Planning p, @PathVariable long id)
	{
		System.out.println("Planning is toegevoegd!");
		ps.opslaanSporter(p, id);
	}
	
	@PostMapping("/vulPlanningOefening/{id}")
	public void maakPlanningOefening(@RequestBody Planning p, @PathVariable long id)
	{
		System.out.println("Planning:  is toegevoegd!");
		ps.opslaanOefening(p, id);
	}
	
	@PostMapping("/verwijderPlanning")
	public void verwijderOefening(@RequestBody Long id) {
		System.out.println("Planning: " + id + " is verwijderd!");
		ps.verwijderPlanning(id);
	}
}
