package PowerLifters.PowerLiften.controller;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import PowerLifters.PowerLiften.domein.Voortgang;

public interface VoortgangRepository extends CrudRepository<Voortgang,Long> {
	
	@Modifying
	@Query("update Voortgang v set v.feedback = ?1 where v.oefening = ?2")
	int setFeedback(String feedback,String oefening);
}
