package PowerLifters.PowerLiften.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Oefening {
	private String uitleg;
	private String naam;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	public String getUitleg() {
		return uitleg;
	}
	public void setUitleg(String uitleg) {
		this.uitleg = uitleg;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
}

enum OefeningSoort {
	benchpress,
	deadliften,
	barblerow,
	squats,
	shoulderpress
}

