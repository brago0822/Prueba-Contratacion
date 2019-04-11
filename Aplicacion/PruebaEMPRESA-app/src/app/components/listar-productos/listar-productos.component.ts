import { Component, OnInit } from '@angular/core';

import { Observable } from 'rxjs';
import { ProductoService } from '../../services/producto.service';
import { Producto } from '../../model/producto';

@Component({
  selector: 'app-listar-productos',
  templateUrl: './listar-productos.component.html',
  styleUrls: ['./listar-productos.component.scss'],
})
export class ListarProductosComponent implements OnInit {
  results: Observable<Producto>;
  constructor(private prodService: ProductoService) { }

  ngOnInit() {
    console.log('inicio OnInit Component');
    this.results = null;
    this.results = this.prodService.listarActivosProducto();
    console.log('Fin OnInit Component');
  }

  /*listarActivos() {
    this.results = this.prodService.listarActivosProducto();
  }*/

  ionViewDidLoad() {
    /*this.prodService.listarActivosProducto()
    .subscribe(
      (data) => {
        console.log(data);
        this.results = data;
      },
      (error) => {
        console.error(error);
      }
    );*/
  }

}
