import { Injectable } from '@angular/core';
import { Coach } from './coach';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable()
export class CoachService{
    constructor(private http : HttpClient){}
}