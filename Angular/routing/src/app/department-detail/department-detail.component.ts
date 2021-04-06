import { Component, OnInit } from '@angular/core';
import{ActivatedRoute, ParamMap, Router} from "@angular/router";
@Component({
  selector: 'app-department-detail',
  template: `
 
  <h1>welcome to {{departmentId}}  </h1>
 <a (click)="goPrevious()">previous   </a>
 <a (click)="goNext()">next</a>
  `,
  styles: [
  ]
})
export class DepartmentDetailComponent implements OnInit {
 public departmentId: any;
  constructor(private router:ActivatedRoute ,private route:Router) { }

  ngOnInit(){

       let id=parseInt(this.router.snapshot.params['id']);
       this.departmentId=id; 
       /*   this.router.paramMap.subscribe((params: ParamMap)=>{
    let name=parseInt(params.get('id'));
    this.departmentId=name;   */ 

  }
   goPrevious()
   {
     let previousId=this.departmentId-1;
     this.route.navigate(['/departments',previousId])
   }
   goNext()
   {
     let nextId=this.departmentId+1;
     this.route.navigate(['/departments',nextId])
   } 


}
  

