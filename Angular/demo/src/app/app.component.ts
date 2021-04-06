import { AfterViewInit, Component, ElementRef, ViewChild } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements AfterViewInit{
  ngAfterViewInit(): void {
  this.nameElementRef?.nativeElement.focus();
  console.log(this.nameElementRef);
  

  }
//username="venkat";
  name: string | undefined;
 username:string |undefined;
 private _customername :string | undefined ;
  @ViewChild('nameRef') nameElementRef: ElementRef | undefined;
     get customerName():string | undefined
     {
        return this._customername;
     }
     set customerName(value:string |undefined)
     {
       this._customername=value;
       if(value=="venkat")
       alert("welcome venkat");
     }


 greetvishwas(updatedvalue: string | undefined)
 {
   this.username=updatedvalue;
   if(updatedvalue=="venkat")
   alert("welcome venkat");
 
  }

}
