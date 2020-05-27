package PowerLifters.PowerLiften.controller;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import PowerLifters.PowerLiften.domein.GeregistreerdeSporter;
import PowerLifters.PowerLiften.domein.Planning;

public interface PlanningRepository extends CrudRepository<Planning,Long>{
	
	Planning findByGeregistreerdeSporter(GeregistreerdeSporter geregistreerdeSporter);
	
	@Modifying
	@Query("delete from Planning p")
	int planningLeegmaken();
}
