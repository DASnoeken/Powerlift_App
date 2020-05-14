package PowerLifters.PowerLiften.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voortgang {	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String oefening;
	private String oefeningtijd;
	private String liftaantal;
	private String gebruiktegewicht;
	private String starttijd;
	private String feedback;
	
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public long getId() {
		return id;
	}
	public String getOefening() {
		return oefening;
	}
	public void setOefening(String oefening) {
		this.oefening = oefening;
	}
	public String getOefeningtijd() {
		return oefeningtijd;
	}
	public void setOefeningtijd(String oefeningtijd) {
		this.oefeningtijd = oefeningtijd;
	}
	public String getLiftaantal() {
		return liftaantal;
	}
	public void setLiftaantal(String liftaantal) {
		this.liftaantal = liftaantal;
	}
	public String getGebruiktegewicht() {
		return gebruiktegewicht;
	}
	public void setGebruiktegewicht(String gebruiktegewicht) {
		this.gebruiktegewicht = gebruiktegewicht;
	}
	public String getStarttijd() {
		return starttijd;
	}
	public void setStarttijd(String starttijd) {
		this.starttijd = starttijd;
	}
	
	
	
}
