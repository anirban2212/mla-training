import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RestApiService} from '../shared/rest-api.service';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {

 
adminLogin:any={
  admin_username:'',
  admin_password:''
}
  
public logiInfo:any;
  adminData:any=[]
constructor(
  public restApi: RestApiService, 
  public router: Router
) { }
ngOnInit() { }
loginAdmin() {
  this.restApi.adminLogin(this.adminLogin).subscribe((data: {}) => {
    this.router.navigate(['/adminpage'])
  })
  console.log(this.adminData);
}
}

  


