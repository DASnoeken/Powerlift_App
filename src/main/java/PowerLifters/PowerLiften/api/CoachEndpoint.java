package PowerLifters.PowerLiften.api;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import PowerLifters.PowerLiften.controller.CoachService;
import PowerLifters.PowerLiften.domein.Voortgang;

@RestController
public class CoachEndpoint {
	@Autowired
	CoachService cs;
	
	@PostMapping("/geefFeedback")
	public void geefFeedback(@RequestBody Helper h){
		cs.geefFeedback(h.getFeedback(), h.getId());
	}
	
	@GetMapping("/checkID/{id}")
	public Optional<Voortgang> checkID(@PathVariable Long id){
		Optional<Voortgang> Il = cs.bekijkID(id);
		return Il;
	}
	
}

class Helper{
	private String feedback;
	private long id;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}	
}