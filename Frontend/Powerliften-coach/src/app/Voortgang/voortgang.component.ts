import { Component } from '@angular/core';
import { Voortgang } from './voortgang';
import { VoortgangService } from './voortgang.service';
import { $ } from 'protractor';
import { Sporter } from '../Sporter/Sporter';

@Component({
    selector: 'de-voortgang',
    templateUrl: 'voortgang.component.html',
    providers: [VoortgangService]
})
export class VoortgangComponent{
    voortgang1 : Voortgang = new Voortgang();
    voortgangen : Voortgang[] = [];
    feedback : string = '';
    id:number = 0;
    voortgangenIDCheck : Voortgang[] = [];
    sporter:Sporter;
    sporters: Sporter[] = [];

    veranderFeedback($event){
        this.feedback = $event.target.value;
    }
    veranderID($event){
        this.id = $event.target.value;
    }
    constructor(private voortgangService : VoortgangService){   //Dependency injection -- synoniem met @Autowired
        this.voortgangService.getSporters().subscribe(x => { x.forEach(element => this.sporters.push(element)) });
        this.sporters.push(new Sporter());
    }

    setSporter($event) {
        console.log($event.target.value);
        this.voortgangService.getSporterByID($event.target.value).subscribe(x => {
            console.log(x);
            this.sporter = x;
        })
    }

    maakVoortgangSporter(){
        document.getElementById("DivCheckID").hidden=false;
        document.getElementById("DeTabel").hidden=false;
        document.getElementById("knoppen").hidden=false;
        document.getElementById("sporterScherm").hidden = true;
    }

    vulVoortgangen(){
        this.voortgangen = [];
        this.voortgangService.getAllVoortgang(this.sporter.id).subscribe(voortgang => this.voortgangen.push(voortgang));
        console.log(this.voortgangen);
    }
    setFeedback(feedback:string,id:number){
        this.voortgangService.geefFeedback(feedback,id).subscribe(feedback => console.log(feedback));
        this.vulVoortgangen();
    }
    checkID(id:number){
        this.voortgangenIDCheck = [];
        this.voortgangService.bekijkID(id).subscribe(voortgang => this.voortgangenIDCheck.push(voortgang));
        console.log(this.voortgangenIDCheck);
    }
    schoonScherm(){
        this.voortgangen=[];
        this.voortgangenIDCheck=[];
    }
}
