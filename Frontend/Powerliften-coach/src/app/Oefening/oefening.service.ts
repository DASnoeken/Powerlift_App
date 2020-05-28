import { Injectable } from '@angular/core';
import { Oefening } from './oefening';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable()
export class OefeningService{
    constructor(private http : HttpClient){}

    httpOptions = {
        headers: new HttpHeaders({
            'Content-Type': 'application/json'
        })
    }
    //GET
    getOefeningByID(id:number) : Observable<Oefening>{
        return this.http.get<Oefening>("http://localhost:8082/getOefening/"+id);
    }

    //GET
    getAllOefeningen():Observable<Oefening[]>{
        return this.http.get<Oefening[]>("http://localhost:8082/allOefeningen");
    }

    //GET
    getOefeningByNaam(naam:string):Observable<Oefening>{
        return this.http.get<Oefening>("http://localhost:8082/Oefening/"+naam);
    }

    //POST
    verstuurFoto(naam:string,deFoto:File) : Observable<Oefening>{
        console.log("verstuurFoto()");
        const fd = new FormData();
        fd.append('image',deFoto,deFoto.name);
        return this.http.post<Oefening>("http://localhost:8082/Oefening/"+naam+"/image",fd);
    }

    //POST
    oefeningToevoegen(naam:string,uitleg:string) : Observable<Oefening>{
        var oefeningObject = {oefeningObject};
        oefeningObject.naam=naam;
        oefeningObject.uitleg=uitleg;
        return this.http.post<Oefening>("http://localhost:8082/OefeningToevoegen",JSON.stringify(oefeningObject),this.httpOptions);
    }

    oefeningVerwijderen(naam:string):Observable<Oefening>{
        return this.http.delete<Oefening>("http://localhost:8082/Oefening/"+naam+"/Delete");
    }
}