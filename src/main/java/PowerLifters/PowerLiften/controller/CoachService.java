package PowerLifters.PowerLiften.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import PowerLifters.PowerLiften.domein.Voortgang;

@Service
@Transactional
public class CoachService {
	@Autowired
	VoortgangRepository vr;
	
	public void geefFeedback(String feedback,long id){
		vr.setFeedback(feedback,id);
	}
	
	public Optional<Voortgang> bekijkID(Long id){
		Optional<Voortgang> IV = vr.checkID(id);
		return IV;
	}
}
