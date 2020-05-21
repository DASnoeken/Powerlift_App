import { Injectable } from '@angular/core';
import { GegevenTraining } from './GegevenTraining';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable()
export class GegevenTrainingService{
    constructor(private http : HttpClient){}

    httpOptions = {
        headers: new HttpHeaders({
            'Content-Type': 'application/json'
        })
    }

    
}