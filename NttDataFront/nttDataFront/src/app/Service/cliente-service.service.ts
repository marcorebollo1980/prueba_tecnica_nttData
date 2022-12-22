import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { ClienteModel } from '../Model/cliente-model';

@Injectable({
  providedIn: 'root'
})
export class ClienteServiceService {

  private getUrl:string ="http://localhost:8090/api/v1/clientes";

  constructor(private _httpClient: HttpClient) { }

  getClientes(): Observable<ClienteModel[]> {
    return this._httpClient.get<ClienteModel[]>(this.getUrl).pipe(
      map(response => {
        return response;
      })
    )
  }


  getCliente(numeroDocumento: number): Observable<ClienteModel> {
    return this._httpClient.get<ClienteModel>(`${this.getUrl}/${numeroDocumento}`).pipe(
      map(response => response)
    )
  }



}
