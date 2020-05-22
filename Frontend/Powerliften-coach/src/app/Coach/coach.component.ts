import { Component } from '@angular/core';
import { Coach } from './coach';
import { CoachService } from './coach.service';
import { ActivatedRoute } from '@angular/router';

@Component({
    selector:'de-coach',
    templateUrl:'coach.component.html',
    providers: [CoachService]
})

export class CoachComponent{
    idParam : number;
    constructor(private coachService : CoachService, private route : ActivatedRoute){
        this.route.queryParams
        .subscribe(params => {
          this.idParam = params.id;
          console.log('Gevonden Coach ID = '+this.idParam);
        });                 //Zo krijg je request parameters
    }

}