import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { RestApiService } from '../shared/rest-api.service';

@Component({
  selector: 'app-course-status-edit',
  templateUrl: './course-status-edit.component.html',
  styleUrls: ['./course-status-edit.component.css']
})
export class CourseStatusEditComponent implements OnInit {
  id=this.actRoute.snapshot.params['id'];
  enrollmentData: any=[[],[]];
  constructor(
    public restApi: RestApiService,
    public actRoute: ActivatedRoute,
    public router: Router
  ) { }

  ngOnInit(){ this.restApi.getEnrollmentById(this.id).subscribe((data: {}) => {
    this.enrollmentData= data;
  })
  }
  updateEnrollment() {
    if(window.confirm('Are you sure, you want to update?')){
        
        this.restApi.updateEnrollment(this.enrollmentData[0]).subscribe(data=>{
        this.router.navigate(['/coursestatus'])
      })
    }
  }
    
  


}
