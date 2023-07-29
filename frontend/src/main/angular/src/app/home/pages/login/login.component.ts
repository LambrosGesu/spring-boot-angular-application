import {Component, OnInit, ViewEncapsulation} from '@angular/core';
import {Subject} from "rxjs";
import {HomePageService} from "../../services/home-page.service";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {LoginModel} from "../../models/login.model";

class AuthService {
}

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  public loginValid = true;
  public username = '';
  public password = '';
  hide = true;

  private _destroySub$ = new Subject<void>();
  private readonly returnUrl: string;
  public loginForm: FormGroup;


  constructor(
    // private _route: ActivatedRoute,
    // private _router: Router,
    // private _authService: AuthService
    private fb: FormBuilder,
    private homePageService: HomePageService
  ) {
    // this.returnUrl = this._route.snapshot.queryParams['returnUrl'] || '/game';
  }

  public ngOnInit(): void {
    this.loginForm = this.fb.group({
      username: [{value: null, disabled:false}, [Validators.required]],
      password: [{value: null, disabled:false}, [Validators.required]],
      // email:[{value: null, disabled:false},
      //   [Validators.required,
      //     Validators.pattern("^([a-zA-Z0-9_.+-])+\@([a-zA-Z0-9_.+-])+[\.]([a-zA-Z0-9]){2,}$")],
      //   [AsyncEuEmailExistsValidator(this.requestModalService)]
      // ]
    });
    // this._authService.isAuthenticated$.pipe(
    //   filter((isAuthenticated: boolean) => isAuthenticated),
    //   takeUntil(this._destroySub$)
    // ).subscribe( _ => this._router.navigateByUrl(this.returnUrl));
  }

  public ngOnDestroy(): void {
    // this._destroySub$.next();
  }

  public onSubmit(): void {
    this.loginValid = true;
    console.log(this.loginValid)
    let loginDTO = new LoginModel();
    loginDTO.username = this.loginForm.get('username')?.value;
    loginDTO.password = this.loginForm.get('password')?.value;
    console.log(loginDTO)
    this.homePageService.login(loginDTO).subscribe();
    // this._authService.login(this.username, this.password).pipe(
    //   take(1)
    // ).subscribe({
    //   next: _ => {
    //     this.loginValid = true;
    //     this._router.navigateByUrl('/game');
    //   },
    //   error: _ => this.loginValid = false
    // });
  }

}
