package PowerLifters.PowerLiften.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coach {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String inlognaam;
	private String wachtwoord;
	
	private String email;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
