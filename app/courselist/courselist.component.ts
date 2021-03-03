import { Component, OnInit } from '@angular/core';
import { RestApiService } from '../shared/rest-api.service';

@Component({
  selector: 'app-courselist',
  templateUrl: './courselist.component.html',
  styleUrls: ['./courselist.component.css']
})
export class CourselistComponent implements OnInit {
  CourselistService : any = [];

  constructor( public restApi: RestApiService
    ) { }

    ngOnInit() {
      this.loadCourse()
    }
  
    // Get employees list
    loadCourse() {
      // return this.restApi.getEmployees().subscribe((data: {}) => {
      //   this.Employee = data;
      // })
      return this.restApi.getCourses().subscribe((data:{})=>{
        this.CourselistService=data;
      })
    }
  
    // Delete employee
    deleteCourse(course_id:any) {
      if (window.confirm('Are you sure, you want to delete?')){
        this.restApi.deleteCourse(course_id).subscribe(data => {
          this.loadCourse()
        })
      }
    }  

}
