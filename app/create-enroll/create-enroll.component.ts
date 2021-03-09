import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RestApiService } from '../shared/rest-api.service';

@Component({
  selector: 'app-create-enroll',
  templateUrl: './create-enroll.component.html',
  styleUrls: ['./create-enroll.component.css']
})
export class CreateEnrollComponent implements OnInit {
  @Input() enrollmentDetails:any = {student:{
    student_id:''
  },
  course:{
    course_id:''
  },
sc_status:'NOT YET STARTED'}
  constructor(
    public restApi: RestApiService, 
    public router: Router
  ) { }

  ngOnInit(): void {
  }
  createEnrollment() {
    this.restApi.createEnrollment(this.enrollmentDetails).subscribe((data: {}) => {
      this.router.navigate(['/studentenrollstatus'])
    })
  }

}
