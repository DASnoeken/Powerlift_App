package PowerLifters.PowerLiften.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Registratie {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id; 
	
	private String inlognaam;
	private String wachtwoord;
	
	
	public String getInlognaam() {
		return inlognaam;
	}
	public void setInlognaam(String inlognaam) {
		this.inlognaam = inlognaam;
	}
	public String getWachtwoord() {
		return wachtwoord;
	}
	public void setWachtwoord(String wachtwoord) {
		this.wachtwoord = wachtwoord;
	}
	 

}
