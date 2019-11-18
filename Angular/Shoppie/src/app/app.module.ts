import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LandingComponent } from './landing/landing.component';
import { ShopComponent } from './shop/shop.component';
import { FormsModule } from '@angular/forms';

import { NgForm } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    LandingComponent,
    ShopComponent,
 
   
  ],
  imports: [

    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
