import {Component, OnInit} from '@angular/core';
import {SideNavService} from "./shared/services/sidenav.service";

@Component({
  selector: 'app-root',
  styleUrls: ['./app.component.scss'],
  templateUrl: './app.component.html'
})
export class AppComponent implements OnInit{

  constructor(public sideNavService: SideNavService) {
  }

  ngOnInit(): void {
  }
}
