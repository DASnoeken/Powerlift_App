import { Oefening } from '../Oefening/oefening';
import { GegevenTraining } from '../GegevenTraining/GegevenTraining';
import { Sporter } from '../Sporter/Sporter';

export class Planning {
    id? : number;
    training: GegevenTraining;
    sporter: Sporter;
}