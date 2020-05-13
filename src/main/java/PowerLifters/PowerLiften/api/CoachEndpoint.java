package PowerLifters.PowerLiften.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import PowerLifters.PowerLiften.controller.CoachService;

@RestController
public class CoachEndpoint {
	@Autowired
	CoachService cs;
	
	@PostMapping("/geefFeedback")
	public void geefFeedback(@RequestBody Helper h){
		
		cs.geefFeedback(h.getFeedback(), h.getOefening());
	}
}

class Helper{
	private String feedback;
	private String oefening;
	
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public String getOefening() {
		return oefening;
	}
	public void setOefening(String oefening) {
		this.oefening = oefening;
	}
	
}