import { Component, OnInit } from '@angular/core';
import { RestApiService } from '../shared/rest-api.service';

@Component({
  selector: 'app-studentlist',
  templateUrl: './studentlist.component.html',
  styleUrls: ['./studentlist.component.css']
})
export class StudentlistComponent implements OnInit {

  StudentlistService : any = [];

  constructor(
    public restApi: RestApiService
  ) { }

  ngOnInit() {
    this.loadStudent()
  }

  // Get employees list
  loadStudent() {
    // return this.restApi.getEmployees().subscribe((data: {}) => {
    //   this.Employee = data;
    // })
    return this.restApi.getStudent().subscribe((data:{})=>{
      this.StudentlistService=data;
    })
  }

  // Delete employee
  deleteStudent(student_id:any) {
    if (window.confirm('Are you sure, you want to delete?')){
      this.restApi.deleteStudent(student_id).subscribe(data => {
        this.loadStudent()
      })
    }
  }  

}

