import { Injectable } from '@angular/core';
import {HttpClient, HttpParams} from "@angular/common/http";
import {Observable} from "rxjs";
import {UserDTO} from "../models/user-dto";
import {Apartment} from "../../shared/models/apartment";
import {PageEvent} from "@angular/material/paginator";

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

  getApartmentsListPaginate(pageEvent: PageEvent): Observable<ResponseApartments> {
    const params = new HttpParams()
      .set('page', pageEvent.pageIndex.toString())
      .set('size', pageEvent.pageSize.toString());

    return this.httpClient.get<ResponseApartments>(`${this.basePath}/admin/apartments`, { params });
  }

  public getApartmentById(id:number): Observable<Apartment> {
    return this.httpClient.get<Apartment>(this.basePath + "/admin/apartment/" + id);
  }

}
interface ResponseApartments {
  content:  Apartment[],
  totalElements:number,
  page: {
    size: number,
    totalElements: number,
    totalPages: number,
    number: number
  }
}
