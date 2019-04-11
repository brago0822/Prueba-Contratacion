import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Routes, RouterModule } from '@angular/router';

import { IonicModule } from '@ionic/angular';

import { ListarProductosPage } from './listar-productos.page';

import { ListarProductosComponent} from '../../../components/listar-productos/listar-productos.component';
const routes: Routes = [
  {
    path: '',
    component: ListarProductosPage
  }
];

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    RouterModule.forChild(routes)
  ],
  declarations: [ListarProductosPage, ListarProductosComponent]
})
export class ListarProductosPageModule {}
