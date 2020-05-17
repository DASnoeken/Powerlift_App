package PowerLifters.PowerLiften.domein;

import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;




@Entity
public class Planning {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@ManyToMany
	private List<GegevenTraining> training = new ArrayList<GegevenTraining>();
	@ManyToOne
	private GeregistreerdeSporter geregistreerdeSporter;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<GegevenTraining> getTraining() {
		return training;
	}
	public void setTraining(List<GegevenTraining> training) {
		this.training = training;
	}
	public GeregistreerdeSporter getGeregistreerdeSporter() {
		return geregistreerdeSporter;
	}
	public void setGeregistreerdeSporter(GeregistreerdeSporter geregistreerdeSporter) {
		this.geregistreerdeSporter = geregistreerdeSporter;
	}
	public void addTraining(GegevenTraining gt) {
		training.add(gt);
	}
	

	
	
	
	
	
}
