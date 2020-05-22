import { Component } from '@angular/core';
import { Planning } from './Planning';
import { PlanningService } from './Planning.service';
import { $ } from 'protractor';
import { Oefening } from '../Oefening/oefening';

@Component({
    selector: 'de-planning',
    templateUrl: 'planning.component.html',
    providers: [PlanningService]
})

export class PlanningComponent{
    id:number;
    oefening:Oefening;
    constructor(private planningService : PlanningService){   

    }
}