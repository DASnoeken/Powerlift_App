package PowerLifters.PowerLiften.domein;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Coach {
	@Id
	private long id = 1;
	
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	}
