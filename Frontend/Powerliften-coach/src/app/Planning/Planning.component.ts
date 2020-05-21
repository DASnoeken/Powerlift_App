import { Component } from '@angular/core';
import { Planning } from './planning';
import { PlanningService } from './planning.service';
import { $ } from 'protractor';

@Component({
    selector: 'de-planning',
    templateUrl: 'planning.component.html',
    providers: [PlanningService]
})

export class PlanningComponent{
    constructor(private planningservice:PlanningService){}
}