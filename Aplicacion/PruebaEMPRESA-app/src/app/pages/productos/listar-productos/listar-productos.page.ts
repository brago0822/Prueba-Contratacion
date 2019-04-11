import { Component, OnInit } from '@angular/core';
import { ProductoService } from 'src/app/services/producto.service';
import { Producto } from 'src/app/model/producto';
import { Observable } from 'rxjs';

@Component({
  selector: 'page-listar-productos',
  templateUrl: './listar-productos.page.html',
  styleUrls: ['./listar-productos.page.scss'],
})
export class ListarProductosPage implements OnInit {

  results: Observable<Producto>;
  constructor(private prodService: ProductoService) { }

  ngOnInit() {
    console.log('inicio OnInit Page');
    this.results = null;
    this.results = this.prodService.listarActivosProducto();
    console.log('Fin OnInit Page');
  }

}
