import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {UserDTO} from "../models/user-dto";
import {Apartment} from "../../home/models/apartment";

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  protected basePath = 'http://localhost:8080/api';

  constructor(private httpClient: HttpClient) {
  }

  public fetchUsers(): Observable<UserDTO[]> {
    return this.httpClient.get<UserDTO[]>(this.basePath + "/admin/users");
  }

  public fetchApartments(): Observable<Apartment[]> {
    return this.httpClient.get<Apartment[]>(this.basePath + "/admin/apartments");
  }
}
