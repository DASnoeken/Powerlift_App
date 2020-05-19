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
	
	@PostMapping("/vulPlanningSporter/{planningID}/{sporterID} ")
	public void maakPlanningSporter(@PathVariable long planningID, @PathVariable long sporterID)
	{
		System.out.println("Planning is toegevoegd!");
		ps.opslaanSporter(planningID, sporterID);
	}
	
	@PostMapping("/vulPlanningOefening/{planningID}/{trainingID}")
	public void maakPlanningOefening(@PathVariable long planningID, @PathVariable long trainingID)
	{
		System.out.println("Planning:  is toegevoegd!");
		ps.opslaanOefening(planningID, trainingID);
	}
	
	@PostMapping("/verwijderPlanning")
	public void verwijderOefening(@RequestBody long id) {
		System.out.println("Planning: " + id + " is verwijderd!");
		ps.verwijderPlanning(id);
	}
	
	// @GetMapping("/toonPlanning/{sporterID}")
	//public Planning toonPlanning(@PathVariable long sporterID){
		//Iterable<Planning> ip = ps.vindPlanning();
		//return ip;
	//}
	
}
