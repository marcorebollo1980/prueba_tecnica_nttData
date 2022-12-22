package com.nttdata.controller;

import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.model.ClienteEntity;
import com.nttdata.repository.ClienteRepository;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	
	@GetMapping("/clientes")
	public ResponseEntity<List<ClienteEntity>> buscarClientes(){
		List<ClienteEntity> listaCliente = clienteRepository.findAll();
		return new ResponseEntity<List<ClienteEntity>>(listaCliente, HttpStatus.OK);
	}
	
	
	@PostMapping("/clientes")
	public ResponseEntity<ClienteEntity> save(@RequestBody ClienteEntity clienteEntity) {
		ClienteEntity cliente = clienteRepository.save(clienteEntity);
		return new ResponseEntity<ClienteEntity>(cliente, HttpStatus.OK);
	}
	
	
	
	@GetMapping("/clientes/{numeroDocumento}")
	public ResponseEntity<ClienteEntity> getTutorialById(@PathVariable("numeroDocumento") Long numeroDocumento) {
		ClienteEntity clienteData = clienteRepository.findByNumeroDocumento(numeroDocumento);

		if (clienteData.getClienteId() != null) {
			return new ResponseEntity<>(clienteData, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	

}
