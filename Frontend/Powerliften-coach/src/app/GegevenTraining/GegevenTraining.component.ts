import { Component } from '@angular/core';
import { GegevenTraining } from './GegevenTraining';
import { GegevenTrainingService } from './GegevenTraining.service';
import { $ } from 'protractor';

@Component({
    selector: 'de-GegevenTraining',
    templateUrl: 'GegevenTraining.component.html',
    providers: [GegevenTrainingService]
})

export class GegevenTrainingComponent{
   
}