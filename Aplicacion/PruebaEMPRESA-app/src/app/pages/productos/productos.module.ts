import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Routes, RouterModule } from '@angular/router';

import { IonicModule } from '@ionic/angular';

import { ProductosPage } from './productos.page';

//import { CrearProductoComponent} from '../../components/crear-producto/crear-producto.component';
//import { ListarProductosComponent} from '../../components/listar-productos/listar-productos.component';
//import { ListarProductosComponent} from '../../components/components.module';
//import { ComponentsModule} from '../../components/components.module';

const routes: Routes = [
  {
    path: '',
    component: ProductosPage
  }
];

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    RouterModule.forChild(routes)
  ],
  declarations: [ProductosPage//,
                 //ComponentsModule//,
                 //CrearProductoComponent, 
                 //ListarProductosComponent
                ]
})
export class ProductosPageModule {}
