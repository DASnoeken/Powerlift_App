package PowerLifters.PowerLiften.domein;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Planning {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private LocalDateTime tijd;
	@OneToMany
	private List<Oefening> oefening;
	private int aantalReps;
	private int gewicht;
	@ManyToOne
	private GeregistreerdeSporter geregistreerdeSporter;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public GeregistreerdeSporter getGeregistreerdeSporter() {
		return geregistreerdeSporter;
	}
	public void setGeregistreerdeSporter(GeregistreerdeSporter geregistreerdeSporter) {
		this.geregistreerdeSporter = geregistreerdeSporter;
	}
	
	public LocalDateTime getTijd() {
		return tijd;
	}
	public void setTijd(LocalDateTime tijd) {
		this.tijd = tijd;
	}
	public List<Oefening> getOefening() {
		return oefening;
	}
	public void setOefening(List<Oefening> oefening) {
		this.oefening = oefening;
	}
	public int getAantalReps() {
		return aantalReps;
	}
	public void setAantalReps(int aantalReps) {
		this.aantalReps = aantalReps;
	}
	public int getGewicht() {
		return gewicht;
	}
	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}
	
	
	
}
