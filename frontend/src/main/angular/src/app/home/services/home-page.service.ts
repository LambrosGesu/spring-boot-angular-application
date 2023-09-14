import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {LoginModel} from "../models/login.model";
import {CreateAccountModel} from "../models/create-account.model";
import {NewApartment} from "../models/new-apartment.model";

@Injectable({
  providedIn: 'root'
})
export class HomePageService {

  protected basePath = 'http://localhost:8080/api';

  constructor(private httpClient: HttpClient) {
  }

  public login(loginModel: LoginModel): Observable<any> {
    return this.httpClient.post<any>(this.basePath + "/auth/signIn", loginModel);
  }

  public createUserAccount(createAccountModel: CreateAccountModel): Observable<any> {
    return this.httpClient.post<any>(this.basePath + "/auth/signUp", createAccountModel);
  }

  public createApartment(createNewApartment: NewApartment): Observable<any> {
    return this.httpClient.post<any>(this.basePath + "/host/apartment/create", createNewApartment);
  }
}



