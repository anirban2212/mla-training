import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { AdminpageComponent } from './adminpage/adminpage.component';
import { CourselistComponent } from './courselist/courselist.component';
import { CreatecourseComponent } from './createcourse/createcourse.component';
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
  { path: 'adminpage', component:AdminpageComponent }
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
