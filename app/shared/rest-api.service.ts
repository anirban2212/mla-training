import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable, throwError } from 'rxjs';
import { retry, catchError } from 'rxjs/operators';
import { Student } from './student.service';
import { Course } from './course.service';
import { Enrollment } from './enrollment.service';

@Injectable({
  providedIn: 'root'
})
export class RestApiService {

  
  apiURL = 'http://localhost:8083/SMS';

  constructor(private http: HttpClient) { }

  /*========================================
    CRUD Methods for consuming RESTful API
  =========================================*/

  // Http Options
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }  

  // HttpClient API get() method => Fetch Students list
  getStudent(): Observable<Student> {
    return this.http.get<Student>(this.apiURL + '/allstudent')
    .pipe(
      retry(1),
      catchError(this.handleError)
    )
  }
  //get list of courses
  getCourses(): Observable<Course> {
    return this.http.get<Course>(this.apiURL + '/allcourse')
    .pipe(
      retry(1),
      catchError(this.handleError)
    )
  }
  //get course status
  getCoursesStatus(): Observable<Enrollment> {
    return this.http.get<Enrollment>(this.apiURL + '/allEnroll')
    .pipe(
      retry(1),
      catchError(this.handleError)
    )
  }

  // HttpClient API get() method => Fetch employee
  getEmployee(student_id:string): Observable<Student> {
    return this.http.get<Student>(this.apiURL + '/update/' + student_id)
    .pipe(
      retry(1),
      catchError(this.handleError)
    )
  }  

  // HttpClient API post() method => Create employee
  createStudent(student:Student): Observable<Student> {
    return this.http.post<Student>(this.apiURL + '/create', JSON.stringify(student), this.httpOptions)
    .pipe(
      retry(1),
      catchError(this.handleError)
    )
  } 
  //create course 
  createCourse(course:Course): Observable<Student> {
    return this.http.post<Course>(this.apiURL + '/createCourse', JSON.stringify(course), this.httpOptions)
    .pipe(
      retry(1),
      catchError(this.handleError)
    )
  }  

  // HttpClient API put() method => Update employee
  updateEmployee(student_id:number, ): Observable<Student> {
    return this.http.put<Student>(this.apiURL + '/update/'+student_id,JSON.stringify(Student), this.httpOptions)
    .pipe(
      retry(1),
      catchError(this.handleError )
    )
  }

  // HttpClient API delete() method => Delete employee
  deleteStudent(student_id:string){
    return this.http.delete<Student>(this.apiURL + '/delete/' +student_id , this.httpOptions)
    .pipe(
      retry(1),
      catchError(this.handleError)
    )
  }
  ///delete course
  deleteCourse(course_id:string){
    return this.http.delete<Course>(this.apiURL + '/deleteCourse/' +course_id , this.httpOptions)
    .pipe(
      retry(1),
      catchError(this.handleError)
    )
  }

  // Error handling 
  handleError(error:any) {
     let errorMessage = '';
     if(error.error instanceof ErrorEvent) {
       // Get client-side error
       errorMessage = error.error.message;
     } else {
       // Get server-side error
       errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
     }
     window.alert(errorMessage);
     return throwError(errorMessage);
  }


}