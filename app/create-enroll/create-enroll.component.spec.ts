import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateEnrollComponent } from './create-enroll.component';

describe('CreateEnrollComponent', () => {
  let component: CreateEnrollComponent;
  let fixture: ComponentFixture<CreateEnrollComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreateEnrollComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateEnrollComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
