import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {HomePageService} from "../../services/home-page.service";
import {NewApartment} from "../../models/new-apartment.model";

@Component({
  selector: 'app-new-apartment',
  templateUrl: './new-apartment.component.html',
  styleUrls: ['./new-apartment.component.scss']
})
export class NewApartmentComponent implements OnInit {

  public createApartmentForm: FormGroup;
  // public addressForm: FormGroup;
  constructor(private fb: FormBuilder,
              private homePageService: HomePageService) { }

  ngOnInit(): void {
    this.createApartmentForm = this.fb.group({
      address: [{value: null, disabled:false}, [Validators.required]],
      title: [{value: null, disabled:false}, [Validators.required]],
      country: [{value: null, disabled:false}, [Validators.required]],
      region: [{value: null, disabled:false}, [Validators.required]],
      description: [{value: null, disabled:false}, [Validators.required]],
      price: [{value: null, disabled:false}, [Validators.required]],
      cancellation_policy: [{value: null, disabled:false}, [Validators.required]],
    });
  }

  onCreateApartment(event:any) {
    // console.log(this.createApartmentForm);
    let newApartment: NewApartment = this.createApartmentForm.value;
    newApartment.hostId = 1;
    console.log(newApartment);
    this.homePageService.createApartment(newApartment).subscribe(result => {
      console.log(result)
    })
  }
}
