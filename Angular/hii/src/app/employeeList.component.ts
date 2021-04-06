import { from } from "rxjs";
import{Component,OnInit} from '@angular/core'
import { style } from "@angular/animations";
import { EmployeeserviceService } from "./employeeservice.service";
@Component({
    selector:'employeelist',
    template:`
    <h2>Employee List</h2>
    <ul *ngFor="let employee of employees">
    <li>{{employee.name}}</li>
    </ul>
    
    `,
    styles: []
})

export class EmployeeListComponent implements OnInit{
    public employees:any=[];
    constructor(private _employeeService :EmployeeserviceService){}
    

    ngOnInit() {
 
   // this.employees=this._employeeService.getEmployees();
  this._employeeService.getEmployees()
        .subscribe(data=>this.employees=data);
   
}


}