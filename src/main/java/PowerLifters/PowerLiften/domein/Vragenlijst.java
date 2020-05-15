package PowerLifters.PowerLiften.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vragenlijst {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String vragen = "Hoe voel je je na het sporten?";
	private String antwoorden;
	
	public String getVragen() {
		return vragen;
	}
	public void setVragen(String vragen) {
		this.vragen = vragen;
	}
	public String getAntwoorden() {
		return antwoorden;
	}
	public void setAntwoorden(String antwoorden) {
		this.antwoorden = antwoorden;
	}
}
