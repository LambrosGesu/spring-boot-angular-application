import {Component, Input, OnInit} from '@angular/core';
import {Apartment} from "../../../home/models/apartment";

@Component({
  selector: 'apartment',
  templateUrl: './apartment.component.html',
  styleUrls: ['./apartment.component.scss']
})
export class ApartmentComponent implements OnInit {

  @Input()
  public apartmentInfo:Apartment;

  constructor() { }

  ngOnInit(): void {
  }

}
