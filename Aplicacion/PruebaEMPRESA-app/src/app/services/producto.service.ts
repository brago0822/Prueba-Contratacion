import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Producto } from '../model/producto';
import { Observable } from 'rxjs';
import { catchError, tap, map } from 'rxjs/operators';

const httpOptions = {
  headers: new HttpHeaders({'Content-Type': 'application/json'})
};
//const apiUrl = "http://localhost:8282/api-rest/productos";

@Injectable({
  providedIn: 'root'
})
export class ProductoService {

  constructor(public http: HttpClient) { }

  listarActivosProducto(): Observable<Producto> {
    const url = 'http://localhost:8282/api-rest/productos/listar';
    return this.http.get<Producto>(url);
  }


  crearProducto(prodData: any) {
    //return this.http.post<Producto>(apiUrl, Producto, httpOptions)
    console.log(JSON.stringify(prodData));
    //return this.http.post('http://localhost:8282/api-rest/productos/crear', prodData, httpOptions);
    
      this.http.post('http://localhost:8282/api-rest/productos/crear', prodData, httpOptions)
      .subscribe(data => {
        console.log(data['_body']);
       }, error => {
        console.log(error);
      });
     }
}
