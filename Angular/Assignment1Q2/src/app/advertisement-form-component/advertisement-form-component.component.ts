import { Component, OnInit } from '@angular/core';
import {FormsModule} from '@angular/forms'
import { User } from '../user';
@Component({
  selector: 'app-advertisement-form-component',
  templateUrl: './advertisement-form-component.component.html',
  styleUrls: ['./advertisement-form-component.component.css']
})
export class AdvertisementFormComponentComponent implements OnInit {

  userModel=new User('soap','venkat','','vnijdvevewvnewvnewnvewn');
  catogry=["Furniture","Hardware","Mobile"];
  constructor() { }

  ngOnInit(): void {
  }

}
