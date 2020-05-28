package PowerLifters.PowerLiften.domein;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class GeregistreerdeSporter {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@JsonIgnore
	@OneToOne
	private Planning planning;
	@JsonIgnore
	@OneToMany(mappedBy = "voortgang")
	List<Vragenlijst> vragenlijst;
	
	public Planning getPlanning() {
		return planning;
	}
	public void setPlanning(Planning planning) {
		this.planning = planning;
	}
	public List<Vragenlijst> getVragenlijst() {
		return vragenlijst;
	}
	public void setVragenlijst(List<Vragenlijst> vragenlijst) {
		this.vragenlijst = vragenlijst;
	}
	private String naam;
	private String wachtwoord;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public String getWachtwoord() {
		return wachtwoord;
	}
	public void setWachtwoord(String wachtwoord) {
		this.wachtwoord = wachtwoord;
	}
}
