import {Component, Input, OnInit} from '@angular/core';
import {Apartment} from "../../models/apartment";
import {MatDialog} from "@angular/material/dialog";
import {ApartmentDetailsComponent} from "../apartment-details/apartment-details.component";

@Component({
  selector: 'apartment',
  templateUrl: './apartment.component.html',
  styleUrls: ['./apartment.component.scss']
})
export class ApartmentComponent implements OnInit {

  @Input()
  public apartmentInfo:Apartment;

  constructor(public dialog: MatDialog) { }

  ngOnInit(): void {
  }

  // openApartmentDetailsModal() {
  //   this.dialog.open(ApartmentDetailsComponent,{
  //     data: { apartmentInfoObject: this.apartmentInfo },
  //     width: '100%',
  //     minHeight: 'calc(100vh - 90px)',
  //     height : 'auto'
  //   })
  // }
  //
  // openApartmentReservationModal() {
  //   this.dialog.open(ApartmentDetailsComponent,{
  //     data: { apartmentInfoObject: this.apartmentInfo },
  //     width: '100%',
  //     minHeight: 'calc(100vh - 90px)',
  //     height : 'auto'
  //   })
  // }
}
