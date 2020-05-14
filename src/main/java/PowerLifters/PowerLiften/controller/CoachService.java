package PowerLifters.PowerLiften.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CoachService {
	@Autowired
	VoortgangRepository vr;
	
	public void geefFeedback(String feedback,String oefening,long id){
		vr.setFeedback(feedback,oefening,id);
	}
}
