import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { IonicModule } from '@ionic/angular';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';

import { HomePage } from './home.page';
import { CrearProductoComponent} from '../components/crear-producto/crear-producto.component';
import { ListarProductosComponent} from '../components/listar-productos/listar-productos.component';

//import { ComponentsModule} from '../components/components.module';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    //ComponentsModule,
    RouterModule.forChild([
      {
        path: '',
        component: HomePage
      }
    ])
  ],
  declarations: [HomePage, CrearProductoComponent, ListarProductosComponent]
})
export class HomePageModule {}
