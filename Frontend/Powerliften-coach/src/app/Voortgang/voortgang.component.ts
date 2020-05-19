import { Component } from '@angular/core';
import { Voortgang } from './voortgang';
import { VoortgangService } from './voortgang.service';

@Component({
    selector: 'de-voortgang',
    templateUrl: 'voortgang.component.html',
    providers: [VoortgangService]
})
export class VoortgangComponent{
    voortgang1 : Voortgang = new Voortgang();
    voortgangen : Voortgang[] = [];
    constructor(private voortgangService : VoortgangService){   //Dependency injection -- synoniem met @Autowired
        this.voortgang1.gebruikteGewicht = 36;
        console.log("constructor VoortgangComponent");
    }
    vulVoortgangen(){
        this.voortgangService.deMethode().subscribe(voortgang => this.voortgangen.push(voortgang));
        console.log(this.voortgangen);
    }
}
