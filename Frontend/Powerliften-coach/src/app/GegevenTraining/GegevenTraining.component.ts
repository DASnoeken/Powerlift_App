import { Component } from '@angular/core';
import { GegevenTraining } from './GegevenTraining';
import { GegevenTrainingService } from './GegevenTraining.service';
import { $ } from 'protractor';
import { Oefening } from '../Oefening/oefening';
import { Data } from '@angular/router';

@Component({
    selector: 'de-GegevenTraining',
    templateUrl: 'GegevenTraining.component.html',
    providers: [GegevenTrainingService]
})

export class GegevenTrainingComponent {
    id: number;
    oefeningen: Oefening[];
    oefening: Oefening;
    tijd: Date;
    aantalReps: number;
    gewicht: number;
    constructor(private gegevenTrainingService: GegevenTrainingService) {
        this.gegevenTrainingService.getOefeningen().subscribe(x => this.oefeningen.push(x))
    }

    setOefening($event) {
        this.gegevenTrainingService.getOefeningByID($event.target.value).subscribe(oefening => this.oefening = oefening);
    }
    setTijd($event) {
        this.tijd = $event.target.value;
    }
    setAantalReps($event){
        this.aantalReps = $event.target.value;
    }
    setGewicht($event){
        this.gewicht = $event.target.value;
    }
}