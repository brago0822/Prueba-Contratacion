import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Producto } from '../model/producto';
import { Observable } from 'rxjs';
import { catchError, tap, map } from 'rxjs/operators';

const httpOptions = {
  headers: new HttpHeaders({'Content-Type': 'application/json'})
};
const apiUrl = "http://localhost:8282/api-rest/productos";

@Injectable({
  providedIn: 'root'
})
export class ProductoService {

  constructor(public http: HttpClient) { }

  listarActivosProducto(): Observable<Producto> {
    const url = `${apiUrl}/listar`;
    return this.http.get<Producto>(url);
  }

  crearProducto(prodData: any): any {
    console.log(JSON.stringify(prodData));
    this.http.post(`${apiUrl}/crear`, prodData, httpOptions)
      .subscribe(data => {
        return 1;
       }, error => {
        console.log(error);
        return 0;
      });
     }
}
