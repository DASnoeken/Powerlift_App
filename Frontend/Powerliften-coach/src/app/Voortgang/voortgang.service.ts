import { Injectable } from '@angular/core';
import { Voortgang } from './voortgang';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable()
export class VoortgangService{
    deMethode() : Observable<Voortgang>{
        console.log("deMethode");
        return this.http.get<Voortgang>("http://localhost:8082/allVoortgang");
    }
    constructor(private http: HttpClient){}
}