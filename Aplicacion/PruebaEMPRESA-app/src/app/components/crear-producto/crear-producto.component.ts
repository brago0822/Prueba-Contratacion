import { Component, OnInit } from '@angular/core';
import { ProductoService} from '../../services/producto.service';
import { AlertController } from '@ionic/angular';

import { Producto } from 'src/app/model/producto';

import { FormBuilder, FormGroup, Validators, NgForm, FormControl, FormArray } from '@angular/forms';

@Component({
  selector: 'app-crear-producto',
  templateUrl: './crear-producto.component.html',
  styleUrls: ['./crear-producto.component.scss'],
})
export class CrearProductoComponent implements OnInit {
  formProducto: FormGroup;
  productos: FormArray;

  constructor(private prodService: ProductoService,
              private formBuilder: FormBuilder,
              private alertController: AlertController
              )
  {
    this.formProducto = this.formBuilder.group({
      nombre : [null, Validators.required],
      descripcion : [null, Validators.required],
      activo : [null, Validators.required]
    });
  }

  ngOnInit() { }

  OnCreateProduct() {
    console.log(this.formProducto.value);
    const result = this.prodService.crearProducto(this.formProducto.value);
    if (result !== 0) {
      this.alertController.create({
        header: 'Producto Creado',
        message: 'El producto ha sido creado de manera exitosa',
        buttons: [{
          text: 'Aceptar'
        }
        ]}).then(alertElement => {
          alertElement.present();
        });
    }
  }
}
