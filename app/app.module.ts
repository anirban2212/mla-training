import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { CourselistComponent } from './courselist/courselist.component';
import { CreatecourseComponent } from './createcourse/createcourse.component';
import { StudentlistComponent } from './studentlist/studentlist.component';
import { StudentloginComponent } from './studentlogin/studentlogin.component';
import { StudentregistrationComponent } from './studentregistration/studentregistration.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { AdminpageComponent } from './adminpage/adminpage.component';
import { CoursestatusComponent } from './coursestatus/coursestatus.component';
import { EnrollmentformComponent } from './enrollmentform/enrollmentform.component';
import { StatusEditComponent } from './status-edit/status-edit.component';
import { StudentEditComponent } from './student-edit/student-edit.component';
import { CourseEditComponent } from './course-edit/course-edit.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { HomeComponent } from './home/home.component';
import { StudentDetailsComponent } from './student-details/student-details.component';
import { CreateEnrollComponent } from './create-enroll/create-enroll.component';
import { CourseStatusEditComponent } from './course-status-edit/course-status-edit.component';

@NgModule({
  declarations: [
    AppComponent,
    AdminloginComponent,
    CourselistComponent,
    CreatecourseComponent,
    StudentlistComponent,
    StudentloginComponent,
    StudentregistrationComponent,
    AdminpageComponent,
    CoursestatusComponent,
    EnrollmentformComponent,
    StatusEditComponent,
    StudentEditComponent,
    CourseEditComponent,
    PageNotFoundComponent,
    ContactUsComponent,
    HomeComponent,
    StudentDetailsComponent,
    CreateEnrollComponent,
    CourseStatusEditComponent,
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    NgbModule
  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
