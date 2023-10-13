import {Component, OnInit, ViewEncapsulation} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {HomePageService} from "../../services/home-page.service";
import {CreateAccountModel} from "../../models/create-account.model";
import {MatSnackBar, MatSnackBarHorizontalPosition, MatSnackBarVerticalPosition} from "@angular/material/snack-bar";

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss'],
  encapsulation: ViewEncapsulation.None
})
export class RegisterComponent implements OnInit {

  hide = true;
  hide2 = true;
  public registerForm: FormGroup;

  constructor(private fb: FormBuilder,
              private homePageService: HomePageService,
              private snackBar: MatSnackBar) { }

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
      this.showLoginSuccessMessage('Register successful');
      console.log(result);
    });

  }

  showLoginSuccessMessage(message: string) {
    // const message = 'Login successful';
    const color = 'success-growl-color-class'; // Add your custom color class
    const horizontalPosition: MatSnackBarHorizontalPosition = 'end'; // Adjust as needed
    const verticalPosition: MatSnackBarVerticalPosition = 'bottom'; // Adjust as needed
    this.snackBar.open(message, 'Close', {
      duration: 80000, // Set the duration in milliseconds
      panelClass: [color],
      horizontalPosition: horizontalPosition,
      verticalPosition: verticalPosition,
    });
  }
}
