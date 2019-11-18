import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-landing',
  templateUrl: './landing.component.html',
  styleUrls: ['./landing.component.scss']
})
export class LandingComponent implements OnInit {

  showMainContent: Boolean = true;
  showMainContent2: Boolean = false;

  constructor() { }

  ngOnInit() {
  }

 

  ShowHideButton() {
    this.showMainContent = this.showMainContent ? false : true;

 
 }

//  vidSubmission(form: NgForm) {
//   this.http
//   .post("http://localhost:8080/TeamDestoroyah/video/videoIn.app", {
    
//     videoname: form.value.videoname,
//     videocode: form.value.videocode,

      
//       date: this.currentDate(),
   
//   })
//   .toPromise()
//   .then((p: {videoname:string;videocode:string}) => {
//     console.log(p);
//     form.reset();
//     // this.ngOnInit();
   
//   })
//   .catch(e => console.log(e));
  
// }

currentDate(){
  let date = Date.now();
  console.log(date);
  return date
}
 
 ShowHideButton2() {

  this.showMainContent2 = this.showMainContent2 ? false : true;


}


}
