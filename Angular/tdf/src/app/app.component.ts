import { Component } from '@angular/core';
import { EnrolService } from './enrol.service';
import { User } from './user';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

 topics=["angular","mongodb","eclips"];
 //userModel=new User('venkat','sai@lpu.in',986644632069,'','morning',true)
 userModel=new User();
 dataarray=[];

 constructor(private _enroll:EnrolService)
 {
 }
 ngONInit(){
  //this.dataarray.push(this.userModel);
} 

 onSubmit()
 {
  this._enroll.enroll(this.userModel)
   .subscribe(
     (     data: any)=>console.log('Success!',data),
     (     error: any) =>console.error('Error!',error)
   )
 }
}
