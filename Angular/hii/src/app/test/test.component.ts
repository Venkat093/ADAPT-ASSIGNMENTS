import { Output } from '@angular/core';
import { Component, Input, OnInit } from '@angular/core';
/* import { EventEmitter } from 'node:stream'; */

@Component({
  selector: 'app-test',
  template: `
      <h2>
        welcome {{name}}
      </h2>
      
      <h2>{{"welcome" + name}}</h2> 
      <h2>{{name.length}}</h2>
      <h2>{{name.toUpperCase()}}</h2>
      <h2>{{greetuser()}}</h2>
      <h2>{{siteurl}}</h2>
      <input type="text" value ="vishwass"><br>
      <button (click)="greeting='welcome venkat'">greet</button><br>
      {{greeting}}
      <button (click)="onClick1($event)">greet</button>
      {{greetin}}



      <h2 [style.color]="'orange'"> Style binding</h2>
      <h2 [style.color]="haserror ? 'orange':'green'"> Style binding</h2>
      <h1 [style.color]="highlightcolor"> Style binding 2</h1>
      <h1 [ngStyle]="titleStyles">style binding 3</h1>
      
      <input #myInput type="text">
      <button (click)="logMessage(myInput.value)">Log</button>      
      


       <h2 ngif="true"> lopalki vachindi roy</h2>
      
      <h2 *ngIf="true;else elseblock">venkat</h2>
      <ng-template #elseblock>
      <h2> name is hidden</h2>
      </ng-template>


    
      <div [ngSwitch]="colour">
        <div *ngSwitchCase="'red'">you picked red color</div>
        <div *ngSwitchCase="'blue'">you picked blue color</div>
        <div *ngSwitchCase="'green'">you picked green color</div>
        <div *ngSwitchDefault>pick again</div>
      </div>

      <div *ngFor="let color of colors;index as i">
        <h2>
        {{i}} {{color}}
        </h2>
      </div>

     
      <h2>{{colour}}</h2>
      <h2>{{colour|lowercase}}</h2>
      <h2>{{colour|uppercase}}</h2>
      <h2>{{message|titlecase}}</h2>
      <h2>{{colour|slice:2:4}}</h2>
      <h2>{{titleStyles|json}}</h2>
      
      <h2>{{6.55562|number:'1.2-4'}}</h2>
      <h2>{{6.55562|number:'2.4-6'}}</h2>

      <h2>{{0.25|percent}}</h2>
      <h2>{{0.25|currency:'INR'}}</h2>

      <h2>{{date}}</h2>
      <h2>{{date|date:'short'}}</h2>
      <h2>{{date|date:'shortDate'}}</h2>
      <h2>{{date|date:'shortTime'}}</h2>

      `,
   /*    <h2>{{"hello  "+parentData}}
      <button (click)="firstEvent()">send event</button> */
  styleUrls:['./test.component.css']
//assignment cannot be possible
})
export class TestComponent implements OnInit {
 
 public colour="orange";
 public colors=["red","blue","black"];
 public message="welcome to code evelolution"
  public name="vishwass";
  public greeting="";
  public greetin="";
 public haserror=0;
 public highlightcolor="red";
  public siteurl=window.location.href;
  constructor() { }

  public titleStyles=
  {
    color:'blue',
    fontStyle:'italic'
  }
  logMessage(value: any)
  {
    console.log(value);
    
  }

 /* onClick()
 {
  console.log("welcome to codeevelution");
  this.greeting="welcome to code evelution";
 } */
 onClick1(event: any) 
 {
  console.log(event);
  this.greetin= event.type;
 }
  ngOnInit(): void {
  }

  greetuser()
  {
    return "hello"+this.name;
  }


@Input() public parentData: any;

/* @Output() public childevent=new EventEmitter();
firstEvent(){
  this.childevent.emit('hey venkat wassup'); */

  public  date =new Date();
}

