import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { AdminpageComponent } from './adminpage/adminpage.component';
import { CourselistComponent } from './courselist/courselist.component';
import { CoursestatusComponent } from './coursestatus/coursestatus.component';
import { CreatecourseComponent } from './createcourse/createcourse.component';
import { EnrollmentformComponent } from './enrollmentform/enrollmentform.component';
import { StudentlistComponent } from './studentlist/studentlist.component';
import { StudentloginComponent } from './studentlogin/studentlogin.component';
import { StudentregistrationComponent } from './studentregistration/studentregistration.component';

const routes: Routes = [
  { path: 'studentregistration', component:StudentregistrationComponent },
  { path: 'adminlogin', component:AdminloginComponent },
  { path: 'studentlogin', component:StudentloginComponent },
  { path: 'courselist', component:CourselistComponent },
  { path: 'studentlist', component:StudentlistComponent },
  { path: 'createcourse', component:CreatecourseComponent },
  { path: 'adminpage', component:AdminpageComponent },
  { path: 'coursestatus', component:CoursestatusComponent},
  { path: 'enrollmentform', component:EnrollmentformComponent}
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
