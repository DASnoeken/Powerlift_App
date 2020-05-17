package PowerLifters.PowerLiften.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import PowerLifters.PowerLiften.controller.GegevenTrainingService;
import PowerLifters.PowerLiften.domein.GegevenTraining;


@RestController
public class GegevenTrainingEndpoint {
	@Autowired
	GegevenTrainingService gts;
	
	@PostMapping("/voegTrainingToe")
	public long voegTrainingToe(@RequestBody GegevenTraining gt) {
		gts.opslaanTraining(gt);
		return gt.getId();
	}
	
	
	

}
