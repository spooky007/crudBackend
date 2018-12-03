import { User } from './../../user';
import { UserService } from './../../shared_service/user.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-listuser',
  templateUrl: './listuser.component.html',
  styleUrls: ['./listuser.component.css']
})
export class ListuserComponent implements OnInit {
  public users: User[];

  constructor(private _userService: UserService) { }

  ngOnInit() {
    this._userService.getUsers().subscribe(
      (users) => {
        console.log(users);
        this.users = users;
      },
      (error) => {
        console.log(error);
      }
    );
  }

}
