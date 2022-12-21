package com.nttdata.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.model.ClienteEntity;
import com.nttdata.repository.ClienteRepository;
import com.nttdata.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public List<ClienteEntity> findAll() {
		return clienteRepository.findAll();
	}
	
	

}
