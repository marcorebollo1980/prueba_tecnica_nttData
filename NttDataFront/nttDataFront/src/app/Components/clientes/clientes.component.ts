import { Component, OnInit } from '@angular/core';
import { ClienteModel } from 'src/app/Model/cliente-model';
import { ClienteServiceService } from 'src/app/Service/cliente-service.service';

@Component({
  selector: 'app-clientes',
  templateUrl: './clientes.component.html',
  styleUrls: ['./clientes.component.css']
})
export class ClientesComponent implements OnInit {

  clientes: ClienteModel[] = [];

  currentIndex = -1;
  title = '';

  numeroDocumento!: number;

  filters = {
    keyword: '',
    sortBy: 'Name'
  }

  tutorials!: ClienteModel;


  constructor(private _clienteService: ClienteServiceService) { }

  ngOnInit(): void {
    this.obtenerClientes();
  }

  obtenerClientes(){
    this._clienteService.getClientes().subscribe(
      data => this.clientes = data
    );
  }

  searchTitle(): void {
    this.currentIndex = -1;

    this._clienteService.getCliente(this.numeroDocumento)
      .subscribe({
        next: (data) => {
          this.tutorials = data;
          console.log(data);
        },
        error: (e) => console.error(e)
      });
  }

}
