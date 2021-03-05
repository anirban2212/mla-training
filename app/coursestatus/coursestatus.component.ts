import { Component, OnInit } from '@angular/core';
import { RestApiService } from '../shared/rest-api.service';

@Component({
  selector: 'app-coursestatus',
  templateUrl: './coursestatus.component.html',
  styleUrls: ['./coursestatus.component.css']
})
export class CoursestatusComponent implements OnInit {
  CourseStatus : any = [];

  constructor( public restApi: RestApiService
    ) { }

    ngOnInit() {
      this.loadCourseStatus()
    }
  
    // Get employees list
    loadCourseStatus() {
      // return this.restApi.getEmployees().subscribe((data: {}) => {
      //   this.Employee = data;
      // })
      return this.restApi.getCoursesStatus().subscribe((data:{})=>{
        this.CourseStatus=data;
      })
    }

}
