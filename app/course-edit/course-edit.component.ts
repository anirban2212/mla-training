import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { RestApiService } from '../shared/rest-api.service';

@Component({
  selector: 'app-course-edit',
  templateUrl: './course-edit.component.html',
  styleUrls: ['./course-edit.component.css']
})
export class CourseEditComponent implements OnInit {
  course_id=this.actRoute.snapshot.params['id'];
  courseData: any=[];

  constructor(
    public restApi: RestApiService,
    public actRoute: ActivatedRoute,
    public router: Router
  ) { }

  ngOnInit(){ this.restApi.getCourseById(this.course_id).subscribe((data: {}) => {
    this.courseData= data;
  })
  }
  updateCourse() {
    if(window.confirm('Are you sure, you want to update?')){
        
        this.restApi.updateCourse(this.courseData[0]).subscribe(data=>{
        this.router.navigate(['/courselist'])
      })
    }
  }

}
