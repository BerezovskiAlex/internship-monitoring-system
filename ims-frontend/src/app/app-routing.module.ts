import {RouterModule, Routes} from "@angular/router";
import {NgModule} from "@angular/core";


const routes: Routes = [{
  path: "",
  loadChildren:()=> import("./pages/main-page/main-page.module").then((m)=>m.MainPageModule)
}]


@NgModule({
  imports : [RouterModule.forRoot(routes)],
  exports : [RouterModule]
  
})
export class AppRoutingModule{}
