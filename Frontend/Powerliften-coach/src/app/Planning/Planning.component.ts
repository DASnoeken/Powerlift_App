import { Component } from '@angular/core';
import { Planning } from './Planning';
import { PlanningService } from './Planning.service';
import { $ } from 'protractor';
import { Oefening } from '../Oefening/oefening';
import { GegevenTraining } from '../GegevenTraining/GegevenTraining';
import { Sporter } from '../Sporter/Sporter';
import { ITS_JUST_ANGULAR } from '@angular/core/src/r3_symbols';

@Component({
    selector: 'de-planning',
    templateUrl: 'planning.component.html',
    providers: [PlanningService]
})

export class PlanningComponent {
    planning: Planning;
    id: number = 0;
    sporters: Sporter[] = [];
    sporter: Sporter;
    training: GegevenTraining;
    trainingen: GegevenTraining[] = [];
    oefeningen: Oefening[] = [];
    oefening: Oefening;
    tijd: Date;
    aantalReps: number;
    gewicht: number;
    verwijderID: number;
    aantalVerwijderd: number = 0;

    constructor(private planningService: PlanningService) {
        this.planningService.getSporters().subscribe(x => { x.forEach(element => this.sporters.push(element)) });
        this.planningService.getOefeningen().subscribe(x => { x.forEach(element => this.oefeningen.push(element)) });
        this.planningService.getOefeningByID(1).subscribe(oefening => this.oefening = oefening);
        console.log(this.oefeningen);
    }


    setOefening($event) {
        console.log($event.target.value);
        this.planningService.getOefeningByID($event.target.value).subscribe(oefening => this.oefening = oefening);
    }
    setTijd($event) {
        this.tijd = $event.target.value;
    }
    setAantalReps($event) {
        this.aantalReps = $event.target.value;
    }
    setGewicht($event) {
        this.gewicht = $event.target.value;
    }
    saveTraining() {
        this.training = new GegevenTraining();
        console.log(this.id);
        this.training.id = this.id++;
        console.log(this.id);
        this.training.oefening = this.oefening;
        this.training.tijd = this.tijd;
        this.training.aantalReps = this.aantalReps;
        this.training.gewicht = this.gewicht
        this.trainingen.push(this.training);
    }
    maakPlanning() {
        document.getElementById("sporterScherm").hidden = false;
        document.getElementById("trainingScherm").hidden = true;
        document.getElementById("verwijderScherm").hidden = true;
    }

    verwijderTraining() {
        document.getElementById("sporterScherm").hidden = true;
        document.getElementById("trainingScherm").hidden = true;
        document.getElementById("verwijderScherm").hidden = false;


    }
    setSporter($event) {
        console.log($event.target.value);
        this.planningService.getSporterByID($event.target.value).subscribe(x => this.sporter = x)
    }

    maakPlanningSporter() {
        document.getElementById("sporterScherm").hidden = true;
        document.getElementById("trainingScherm").hidden = false;
        document.getElementById("verwijderScherm").hidden = true;
        document.getElementById("trainingenBekijken").hidden = false;
    }
    slaPlanningOp() {
        if (confirm('Are you sure you want to save this thing into the database?')) {
            this.planningService.vulPlanning(this.planning);
            console.log('Thing was saved to the database.');
        } else {
            console.log('Thing was not saved to the database.');
        }

    }
    verwijderTrainingByID() {
        this.trainingen.splice(this.verwijderID, 1);
        this.trainingen.forEach(e => {
            if (e.id > this.verwijderID) {
                e.id--
            }
        })
        this.id--;


    }

}