import {Component, OnInit} from '@angular/core';
import {SideNavService} from "../../../services/sidenav.service";

@Component({
  selector: 'app-sidenav',
  templateUrl: './sidenav.component.html',
  styleUrls: ['./sidenav.component.scss']
})
export class SidenavComponent implements OnInit {
  sidenav_opened = true;

  constructor(public sideNavService: SideNavService) {
  }

  ngOnInit() {
  }
}
