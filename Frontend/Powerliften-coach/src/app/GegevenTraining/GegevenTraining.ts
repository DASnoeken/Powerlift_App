import { Oefening } from '../Oefening/oefening';
import { Time } from '@angular/common';

export class GegevenTraining{
    id? : number;
    oefening: Oefening;
    aantalReps: number;
    gewicht: number;
}