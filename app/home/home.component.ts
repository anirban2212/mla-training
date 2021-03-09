import { Component, OnInit } from '@angular/core';
import { RestApiService } from '../shared/rest-api.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  CourselistService : any = [];

  constructor(public restApi: RestApiService) { }

  ngOnInit(){
    this.loadNewCourse()
  }
  loadNewCourse() {
    
    return this.restApi.newCourse().subscribe((data:{})=>{
      this.CourselistService=data;
    })
  }

}
