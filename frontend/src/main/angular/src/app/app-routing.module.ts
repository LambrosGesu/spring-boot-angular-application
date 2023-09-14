import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomeComponent} from "./home/home.component";
import {UsersComponent} from "./admin/pages/users/users.component";
import {LoginComponent} from "./home/pages/login/login.component";
import {RegisterComponent} from "./home/pages/register/register.component";
import {ApartmentsComponent} from "./admin/pages/apartments/apartments.component";
import {BookingsComponent} from "./admin/pages/bookings/bookings.component";
import {NewApartmentComponent} from "./home/pages/new-apartment/new-apartment.component";

const routes: Routes = [
  {path: '',  component: HomeComponent},
  {path: 'login',  component: LoginComponent},
  {path: 'register',  component: RegisterComponent},
  {path: 'create-apartment',  component: NewApartmentComponent},
  {path: 'admin',  component: UsersComponent},
  {path: 'admin/users',  component: UsersComponent},
  {path: 'admin/apartments',  component: ApartmentsComponent},
  {path: 'admin/bookings',  component: BookingsComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

