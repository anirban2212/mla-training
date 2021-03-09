import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CourseStatusEditComponent } from './course-status-edit.component';

describe('CourseStatusEditComponent', () => {
  let component: CourseStatusEditComponent;
  let fixture: ComponentFixture<CourseStatusEditComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CourseStatusEditComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CourseStatusEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
