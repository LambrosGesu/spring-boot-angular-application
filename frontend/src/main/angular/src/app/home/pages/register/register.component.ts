import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {HomePageService} from "../../services/home-page.service";
import {CreateAccountModel} from "../../models/create-account.model";

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {

  hide = true;
  hide2 = true;
  public registerForm: FormGroup;

  constructor(private fb: FormBuilder,
              private homePageService: HomePageService) { }

  ngOnInit(): void {
    this.registerForm = this.fb.group({
      username: [{value: null, disabled:false}, [Validators.required]],
      firstname: [{value: null, disabled:false}, [Validators.required]],
      lastname: [{value: null, disabled:false}, [Validators.required]],
      password: [{value: null, disabled:false}, [Validators.required]],
      email:[{value: null, disabled:false},
        [Validators.required,
          Validators.pattern("^([a-zA-Z0-9_.+-])+\@([a-zA-Z0-9_.+-])+[\.]([a-zA-Z0-9]){2,}$")],
        // [AsyncEuEmailExistsValidator(this.requestModalService)]
      ]
    });
  }

  public onCreateAccount(){
    let email = this.registerForm.get('email')?.value;
    let username = this.registerForm.get('username')?.value;
    let firstname = this.registerForm.get('firstname')?.value;
    let lastname = this.registerForm.get('lastname')?.value;
    let password = this.registerForm.get('password')?.value;
    console.log(email)
    console.log(username)
    console.log(password)
    let createAccountModel: CreateAccountModel = new CreateAccountModel(username, firstname, lastname, password, email)
    this.homePageService.createUserAccount(createAccountModel).subscribe(result=>{
      console.log(result);
    });

  }
}
