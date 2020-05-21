import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { VoortgangComponent } from './Voortgang/voortgang.component';
import { OefeningComponent } from './Oefening/oefening.component';
import { GegevenTrainingComponent} from './GegevenTraining/GegevenTraining.component'
import { PlanningComponent } from './Planning/Planning.component'

@NgModule({
  declarations: [
    AppComponent,
    VoortgangComponent,
    OefeningComponent,
    GegevenTrainingComponent,
    PlanningComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
