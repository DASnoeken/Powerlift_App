import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Powerliften-coach';
  voortgang = 'De voortgang komt hier';
  
  geefFeedback(){
    /*var ID       = document.getElementById("ID").value;
            var feedback = document.getElementById("Feedback").value;

            var voortgangObject      = {};
            voortgangObject.id       = ID;
            voortgangObject.feedback = feedback;
            var objJSON              = JSON.stringify(voortgangObject);
            var xhr = new XMLHttpRequest();
            xhr.onreadystatechange = function(){
                if(this.readyState == 4) {
                    console.log(objJSON);
					document.getElementById("checkVerstuur").innerHTML = feedback+" toegevoegd!";
                    showVoortgang();
				}
            };
            xhr.open("POST","http://localhost:8082/geefFeedback",true);
            xhr.setRequestHeader("Content-Type", "application/json");
			xhr.send(objJSON);*/
  }

  showVoortgang(){
    /*var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
      if(this.readyState == 4){
        var rijtjeVoortgang = JSON.parse(this.responseText);
        console.log(rijtjeVoortgang);
		    var eindtekst = "<table><tr><td>ID</td><td>Oefening</td><td>Tijdsduur</td><td>Aantal reps</td><td>Gewicht</td><td>Gegeven feedback</td><td>Gevoel</td></tr>";
		    for(var x = 0; x<rijtjeVoortgang.length;x++){
		      eindtekst += "<tr><td>" + rijtjeVoortgang[x].id + 
           "</td><td>" + rijtjeVoortgang[x].oefening.naam + 
           "</td><td>" + rijtjeVoortgang[x].oefeningtijd + 
		  		 "</td><td>" + rijtjeVoortgang[x].liftaantal + 
           "</td><td>" + rijtjeVoortgang[x].gebruiktegewicht +
           "</td><td>"+  rijtjeVoortgang[x].feedback + 
           "</td><td>" + rijtjeVoortgang[x].antwoorden + "</td></tr>";  
		    }
        eindtekst += "</table>";
      }
    };
    xhr.open("GET","http://localhost:8082/allVoortgang",true);
    xhr.send();*/
}
  
  checkID(){
    /*var ID  = document.getElementById("ID").value;
            var xhr = new XMLHttpRequest();
            xhr.onreadystatechange = function(ID) {
                if (this.readyState == 4){
                    var rijtje = JSON.parse(this.responseText);
					console.log(rijtje);
                    var eindtekst = "<table><tr><td>ID</td><td>Oefening</td><td>Tijdsduur</td><td>Aantal reps</td><td>Gegeven feedback</td><td>Gevoel</td></tr>";
					eindtekst += "<tr><td>" + rijtje.id + 
                                 "</td><td>" + rijtje.oefening.naam + 
                                 "</td><td>" + rijtje.oefeningtijd + 
								 "</td><td>" + rijtje.liftaantal + 
                                 "</td><td>"+ rijtje.feedback +
                                 "</td><td>"+ rijtje.antwoorden+"</td></tr>";  
					eindtekst += "</table>";

                    document.getElementById("CheckIDans").innerHTML = eindtekst;
                }
            };
            xhr.open("GET","http://localhost:8082/checkID?id="+ID,true);
            xhr.send();*/
  }
}
