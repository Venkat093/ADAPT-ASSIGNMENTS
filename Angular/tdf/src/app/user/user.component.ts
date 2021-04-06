import { Component, OnInit } from '@angular/core';
import { EnrolService } from '../enrol.service';
import { User } from '../user';
@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  constructor(private _enroll:EnrolService) { }
 userModel=new User();
  ngOnInit(): any {
    this._enroll.getList().subscribe(data=>this.userModel=data)
  }

}
