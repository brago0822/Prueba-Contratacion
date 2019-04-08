import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Producto } from '../producto';

const httpOptions = {
  headers: new HttpHeaders({'Content-Type': 'application/json'})
};
const apiUrl = "localhost:8282/api-rest/productos";

@Injectable({
  providedIn: 'root'
})
export class ProductoService {

  constructor(public http: HttpClient) { }

  listarActivosProducto() {
    const url = '${apiUrl}/listar';
    return this.http.get<Producto>(url)
  }

  crearProducto(prodData) {
    //return this.http.post<Producto>(apiUrl, Producto, httpOptions)
    console.log(JSON.stringify(prodData));
      return this.http.post('${apiUrl}/crear', prodData,httpOptions);
  }
}
