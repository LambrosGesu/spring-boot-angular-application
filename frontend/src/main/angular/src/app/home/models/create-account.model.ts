export class CreateAccountModel {
  username?:string;
  firstname?:string;
  lastname?:string;
  password?:string;
  email:string;

  constructor(username: string, firstname: string, lastname: string, password: string, email: string) {
    this.username = username;
    this.firstname = firstname;
    this.lastname = lastname;
    this.password = password;
    this.email = email;
  }
}
