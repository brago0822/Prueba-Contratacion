import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { Routes, RouterModule } from '@angular/router';

import { IonicModule } from '@ionic/angular';

import { CrearProductoPage } from './crear-producto.page';

//import { ComponentsModule} from '../../../components/components.module';

import { CrearProductoComponent} from '../../../components/crear-producto/crear-producto.component';


const routes: Routes = [
  {
    path: '',
    component: CrearProductoPage
  }
];

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    ReactiveFormsModule,
    RouterModule.forChild(routes)
  ],
  declarations: [CrearProductoPage, CrearProductoComponent]
})
export class CrearProductoPageModule {}
