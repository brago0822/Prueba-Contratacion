import { Component, OnInit } from '@angular/core';
import { ProductoService} from '../../services/producto.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-crear-producto',
  templateUrl: './crear-producto.component.html',
  styleUrls: ['./crear-producto.component.scss'],
})
export class CrearProductoComponent implements OnInit {
 
  constructor(private prodService: ProductoService) { }

  ngOnInit() {}

  OnCreateProduct() {
    const postData = {
                    "nombre": "Teclado",
                    "descripcion": "Teclado Básico",
                    "activo": true
    }
    console.log('Llamado a botón crear Producto');
    this.prodService.crearProducto(postData);
  }
}
