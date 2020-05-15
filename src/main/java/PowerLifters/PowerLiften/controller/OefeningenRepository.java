package PowerLifters.PowerLiften.controller;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import PowerLifters.PowerLiften.domein.Oefening;

public interface OefeningenRepository extends CrudRepository<Oefening,Long>{
	
	@Modifying
	@Query("delete from Oefening o")
	int clearOefeningen();
}
