import { Input } from '@angular/core';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RestApiService } from '../shared/rest-api.service';

@Component({
  selector: 'app-createcourse',
  templateUrl: './createcourse.component.html',
  styleUrls: ['./createcourse.component.css']
})
export class CreatecourseComponent implements OnInit {
  @Input() courseDetails:any = {course_fname: '',course_fees: '', course_level: '',course_duration:'' }
  constructor(
    public restApi: RestApiService, 
    public router: Router
  ) { }

  ngOnInit() {
  }
  addCourse() {
    this.restApi.createCourse(this.courseDetails).subscribe((data: {}) => {
      this.router.navigate(['/courselist'])
    })
  }

}
