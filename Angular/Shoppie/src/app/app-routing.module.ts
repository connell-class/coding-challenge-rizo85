import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LandingComponent } from './landing/landing.component';
import { ShopComponent } from './shop/shop.component';



const routes: Routes = [

  { path: '', pathMatch: 'full', redirectTo: 'landing'}, 

  {path: 'landing', component: LandingComponent},

  {path: 'shop', component: ShopComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
