import { Component, OnInit } from '@angular/core';
import {AdminService} from "../../services/admin.service";
import {Apartment} from "../../../shared/models/apartment";
import {PageEvent} from "@angular/material/paginator";

@Component({
  selector: 'admin-apartments',
  templateUrl: './apartments.component.html',
  styleUrls: ['./apartments.component.scss']
})
export class ApartmentsComponent implements OnInit {

  apartments: Apartment[] = [];
  totalApartments: number = 0;
  length: number = 50;
  pageSize: number = 5;
  pageIndex: number = 0;
  pageEvent: PageEvent = new PageEvent();
  constructor(private adminService:AdminService) { }

  ngOnInit(): void {
    this.loadApartments(this.pageEvent)
  }

  loadApartments(pageEvent: PageEvent) {
    pageEvent.pageIndex = this.pageIndex;
    pageEvent.pageSize = this.pageSize;

    this.adminService.getApartmentsListPaginate(pageEvent)
      .subscribe(data => {
        this.apartments = data.content;
        this.totalApartments = data.totalElements;
      });
  }

  handlePageEvent(e: PageEvent) {
    console.log(e);
    // this.length = e.length;
    this.pageSize = e.pageSize;
    this.pageIndex = e.pageIndex;
    this.loadApartments(e);
  }
}
