import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RestApiService } from '../shared/rest-api.service';

@Component({
  selector: 'app-studentregistration',
  templateUrl: './studentregistration.component.html',
  styleUrls: ['./studentregistration.component.css']
})
export class StudentregistrationComponent implements OnInit {


  @Input() studentDetails:any = { student_fname: '',student_lname: '', student_email: '',student_grades:'', student_username:'',student_password:'' }
  constructor(
    public restApi: RestApiService, 
    public router: Router
  ) { }

  ngOnInit() { }

  addStudent() {
    this.restApi.createStudent(this.studentDetails).subscribe((data: {}) => {
      this.router.navigate(['/studentlist'])
    })
  }

}
