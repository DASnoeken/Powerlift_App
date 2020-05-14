package PowerLifters.PowerLiften.controller;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import PowerLifters.PowerLiften.domein.Oefening;

public interface OefeningenRepository extends CrudRepository<Oefening,Long>{

}
