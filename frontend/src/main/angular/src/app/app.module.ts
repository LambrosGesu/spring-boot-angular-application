import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { LoginComponent } from './home/pages/login/login.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {MatCardModule} from "@angular/material/card";
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatInputModule} from "@angular/material/input";
import {MatButtonModule} from "@angular/material/button";
import {MatIconModule} from "@angular/material/icon";
import {HomeComponent} from "./home/home.component";
import {MatToolbarModule} from "@angular/material/toolbar";
import {HttpClientModule} from "@angular/common/http";
import {RegisterComponent} from "./home/pages/register/register.component";
import {HomePageService} from "./home/services/home-page.service";
import {SideNavService} from "./shared/services/sidenav.service";
import {MatDatepickerModule} from "@angular/material/datepicker";
import {MatNativeDateModule} from "@angular/material/core";
import {MatSidenavModule} from "@angular/material/sidenav";
import {MatListModule} from "@angular/material/list";
import {ToolbarComponent} from "./shared/components/layouts/toolbar/toolbar.component";
import { ApartmentComponent } from './shared/components/apartment/apartment.component';
import { BookingComponent } from './shared/components/booking/booking.component';
import { UsersComponent } from './admin/pages/users/users.component';
import {SidenavComponent} from "./shared/components/layouts/sidenav/sidenav.component";
import { ApartmentsComponent } from './admin/pages/apartments/apartments.component';
import { BookingsComponent } from './admin/pages/bookings/bookings.component';
import { NewApartmentComponent } from './home/pages/new-apartment/new-apartment.component';
import { MatRadioModule } from "@angular/material/radio";

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    HomeComponent,
    ToolbarComponent,
    ApartmentComponent,
    BookingComponent,
    UsersComponent,
    SidenavComponent,
    ApartmentsComponent,
    BookingsComponent,
    NewApartmentComponent
  ],
  imports: [
    HttpClientModule,
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    FormsModule,
    ReactiveFormsModule,
    MatCardModule,
    MatFormFieldModule,
    MatInputModule,
    MatButtonModule,
    MatIconModule,
    MatToolbarModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatSidenavModule,
    MatListModule,
    MatRadioModule
  ],
  providers: [
    HomePageService,
    SideNavService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
