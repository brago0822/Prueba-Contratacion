import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  { path: '', redirectTo: 'productos', pathMatch: 'full' },
  { path: 'productos',
    children: [
      {
        //path: '', loadChildren: './home/home.module#HomePageModule'
        path: '', loadChildren: './pages/productos/productos.module#ProductosPageModule'
      },
      {
        path: 'crear-productos', loadChildren: './pages/productos/crear-producto/crear-producto.module#CrearProductoPageModule'
      },
      {
        path: 'listar-productos', loadChildren: './pages/productos/listar-productos/listar-productos.module#ListarProductosPageModule'
      }
    ]
  }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
