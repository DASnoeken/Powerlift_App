import { Component } from '@angular/core';
import { Oefening } from './oefening';
import { OefeningService } from './oefening.service';
import { $ } from 'protractor';

@Component({
    selector: 'de-oefening',
    templateUrl: 'oefening.component.html',
    providers: [OefeningService]
})
export class OefeningComponent{
    deFoto : File;
    id:number;
    oefeningen:Oefening[] = [];
    getOefeningClicked:Boolean=false;
    constructor(private oefeningService : OefeningService){}
    getOefeningById(){
        this.oefeningen=[];
        this.oefeningService.getOefeningByID(this.id).subscribe(oefening => this.oefeningen.push(oefening));
        this.getOefeningClicked=true;
    }
    onFileSelected($event){
        console.log($event);
        this.deFoto = <File>$event.target.files[0];
    }
    onUpload(){
        console.log("onUpload");
        console.log(this.deFoto.name);
        this.oefeningService.verstuurFoto(this.id,this.deFoto).subscribe(oefening => console.log(oefening));
    }
    setOefeningID($event){
        this.id = $event.target.value;
    }
}