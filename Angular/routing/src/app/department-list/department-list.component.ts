import { Component, OnInit } from '@angular/core';
import{Router} from "@angular/router";

@Component({
  selector: 'app-department-list',
  template: `
  <h2>department List</h2>
  <ul >
  <li (click)="onselect(department)" *ngFor="let department of departments" >   <span class="badge">{{department.id}}</span> {{department.name}} </li>
  </ul>
  `,
  styles: [   
  ]
})
export class DepartmentListComponent implements OnInit {

  public departments=[
    {"id":1,"name":"venkat","age":22},
    {"id":2,"name":"sai","age":22},
    {"id":3,"name":"shiridi","age":20},
    {"id":4,"name":"ram","age":32},
    {"id":5,"name":"venkat","age":25},
    {"id":6,"name":"varma","age":16}
  ]

  constructor(private router:Router) { }
  onselect(department: { id: any; })
  {
   this.router.navigate(['/departments',department.id]);
  }

  ngOnInit(): void {
  }

}
