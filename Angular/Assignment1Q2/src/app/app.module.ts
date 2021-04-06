import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {FormsModule} from '@angular/forms'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdvertisementFormComponentComponent } from './advertisement-form-component/advertisement-form-component.component';
//import { HomeComponent } from './home/home.component';
//import { ModelComponent } from './model/model.component';

@NgModule({
  declarations: [
    AppComponent,
    AdvertisementFormComponentComponent,
  //  HomeComponent,
   // ModelComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
