import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { User } from './user';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EnrolService {
 _url='http://localhost:3000/enroll';
  constructor(private _http:HttpClient) { }
  enroll(user:User)
  {
     return this._http.post<any>(this._url,user)
  }

  getList() : Observable<User>
  {
return this._http.get<User>(this._url);
  }
}
