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
@NgModule({
  declarations: [
    AppComponent,
    AdminloginComponent,
    CourselistComponent,
    CreatecourseComponent,
    StudentlistComponent,
    StudentloginComponent,
    StudentregistrationComponent,
    AdminpageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    NgbModule,
  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
