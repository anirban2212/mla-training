import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { AdminpageComponent } from './adminpage/adminpage.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { CourseEditComponent } from './course-edit/course-edit.component';
import { CourseStatusEditComponent } from './course-status-edit/course-status-edit.component';
import { CourselistComponent } from './courselist/courselist.component';
import { CoursestatusComponent } from './coursestatus/coursestatus.component';
import { CreateEnrollComponent } from './create-enroll/create-enroll.component';
import { CreatecourseComponent } from './createcourse/createcourse.component';
import { EnrollmentformComponent } from './enrollmentform/enrollmentform.component';
import { HomeComponent } from './home/home.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { StudentDetailsComponent } from './student-details/student-details.component';
import { StudentEditComponent } from './student-edit/student-edit.component';
import { StudentenrollstatusComponent } from './studentenrollstatus/studentenrollstatus.component';

import { StudentlistComponent } from './studentlist/studentlist.component';
import { StudentloginComponent } from './studentlogin/studentlogin.component';
import { StudentregistrationComponent } from './studentregistration/studentregistration.component';

const routes: Routes = [
  {path:'',redirectTo:'/home',pathMatch:'full'},
  { path: 'studentregistration', component:StudentregistrationComponent },
  { path: 'adminlogin', component:AdminloginComponent},
  { path: 'studentlogin', component:StudentloginComponent },
  { path: 'courselist', component:CourselistComponent },
  { path: 'studentlist', component:StudentlistComponent },
  { path: 'createcourse', component:CreatecourseComponent },
  { path: 'adminpage', component:AdminpageComponent },
  { path: 'coursestatus', component:CoursestatusComponent},
  { path: 'enrollmentform', component:EnrollmentformComponent},
  { path: 'student-edit/:id', component:StudentEditComponent},
  { path: 'student-details/:id', component:StudentDetailsComponent},
 
  { path: 'course-edit/:id', component:CourseEditComponent},
  { path: 'course-status-edit/:id', component:CourseStatusEditComponent},
  { path: 'create-enroll', component:CreateEnrollComponent},
  { path: 'contactus', component:ContactUsComponent},
  { path: 'home', component:HomeComponent},
  { path: 'studentenrollstatus', component:StudentenrollstatusComponent},
  { path: '**', component: PageNotFoundComponent }
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
