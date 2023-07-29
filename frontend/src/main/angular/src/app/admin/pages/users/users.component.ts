import { Component, OnInit } from '@angular/core';
import {AdminService} from "../../services/admin.service";
import {UserDTO} from "../../models/user-dto";

@Component({
  selector: 'admin-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.scss']
})
export class UsersComponent implements OnInit {
  users:UserDTO[] = [];
  constructor(private _adminService: AdminService) { }

  ngOnInit(): void {
    this._adminService.fetchUsers().subscribe((result:UserDTO[]) => {
      this.users = result;
    });
  }


}
