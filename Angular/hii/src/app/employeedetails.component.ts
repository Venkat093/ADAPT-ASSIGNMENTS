
import{Component,OnInit} from '@angular/core'
import { EmployeeserviceService } from './employeeservice.service';

@Component({
    selector:'employeedetails',
    template:`
    <h2>Employee List</h2>
    <ul *ngFor="let employee of employees">
    <li>{{employee.id}} {{employee.name}} </li>
    </ul>
    
    `,
    styles: []
})

export class EmployeedetailsComponent implements OnInit{
    public employees:any=[ ];
  constructor(private _employeeService :EmployeeserviceService){}
    

    // ngOnInit(): void {
 
    // this.employees=this._employeeService.getEmployees();
  //}

   
  ngOnInit() {
 
    // this.employees=this._employeeService.getEmployees();
   this._employeeService.getEmployees()
         .subscribe(data=>this.employees=data);
    
 } 

}