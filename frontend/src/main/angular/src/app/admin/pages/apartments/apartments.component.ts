import { Component, OnInit } from '@angular/core';
import {AdminService} from "../../services/admin.service";
import {Apartment} from "../../../home/models/apartment";

@Component({
  selector: 'admin-apartments',
  templateUrl: './apartments.component.html',
  styleUrls: ['./apartments.component.scss']
})
export class ApartmentsComponent implements OnInit {

  apartments: Apartment[] = [];
  constructor(private adminService:AdminService) { }

  ngOnInit(): void {
    this.adminService.fetchApartments().subscribe(items => {
      this.apartments = items;
    })
  }

}
