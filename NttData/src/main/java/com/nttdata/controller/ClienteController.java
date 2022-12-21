package com.nttdata.controller;

import java.net.http.HttpResponse;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.model.ClienteEntity;
import com.nttdata.service.ClienteService;

@CrossOrigin(origins = "http://localhost:8090")
@RestController
@RequestMapping("/api")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	
	@GetMapping("/buscarClientes")
	public ResponseEntity<List<ClienteEntity>> buscarClientes(){
		List<ClienteEntity> listaCliente = clienteService.findAll();
		return new ResponseEntity<List<ClienteEntity>>(listaCliente, HttpStatus.OK);
	}

}
