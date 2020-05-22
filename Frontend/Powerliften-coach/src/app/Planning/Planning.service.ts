import { Injectable } from '@angular/core';
import { Planning } from './Planning';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Sporter } from '../Sporter/Sporter';
import { Oefening } from '../Oefening/oefening';

@Injectable()
export class PlanningService{
    
    
    
    constructor(private http : HttpClient){}

    httpOptions = {
        headers: new HttpHeaders({
            'Content-Type': 'application/json'
        })
    }

    vulPlanningSporter(sporterID:number, planning:Planning) {
        return this.http.post<Planning>("http://localhost:8082/vulPlanning/" + sporterID,JSON.stringify(planning),this.httpOptions);
    }

    getSporterByID(id: number):Observable<Sporter> {
        return this.http.get<Sporter>("http://localhost:8082/getSporter/" + id);
    }

    getSporters():Observable<Sporter[]>{
        var a = this.http.get<Sporter[]>("http://localhost:8082/allSporters")
        return a;
    }

    getOefeningByID(id: number):Observable<Oefening> {
        var a =  this.http.get<Oefening>("http://localhost:8082/getOefening/" + id);
        return a
    }

    getOefeningen():Observable<Oefening[]>{
        return this.http.get<Oefening[]>("http://localhost:8082/allOefeningen")
    }

    vulPlanning(planning: Planning) {
        this.http.post<Planning>("http://localhost:8082/vulPlanning",JSON.stringify(planning),this.httpOptions);
    }



    
}