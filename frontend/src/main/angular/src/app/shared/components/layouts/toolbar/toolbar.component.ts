import {Component, OnInit, ViewEncapsulation} from '@angular/core';
import {SideNavService} from "../../../services/sidenav.service";
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-toolbar',
  templateUrl: './toolbar.component.html',
  styleUrls: ['./toolbar.component.scss'],
  encapsulation: ViewEncapsulation.None
})
export class ToolbarComponent implements OnInit {
  title: string = "Dashboard";

  isLoginPage: boolean = true;
  isRegisterPage: boolean = false;
  isHostRegisterPage: boolean = false;
  role: string;
  dateRange = new FormGroup({
    start: new FormControl(),
    end: new FormControl()
  });

  constructor(private _sideNavService: SideNavService) { }

  ngOnInit(): void {
  }

  public clickMenuButton() {
    this._sideNavService.toggle();
  }


  onRegister() {
    this.role = "USER"
    this.isLoginPage = false;
    this.isRegisterPage = true;
  }

  onLogin() {
    this.isRegisterPage = false;
    this.isLoginPage = true;
  }

  onHostRegister() {
    this.role = "HOST"
    this.isRegisterPage = true;
    this.isLoginPage = false;
  }
}
