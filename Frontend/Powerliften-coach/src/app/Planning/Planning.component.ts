import { Component } from '@angular/core';
import { Planning } from './Planning';
import { PlanningService } from './Planning.service';
import { $ } from 'protractor';

@Component({
    selector: 'de-planning',
    templateUrl: 'planning.component.html',
    providers: [PlanningService]
})

export class PlanningComponent{
    constructor(private planningservice:PlanningService){}
}