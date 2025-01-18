package com.wakanda.APIpetCliente.aplication.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.wakanda.APIpetCliente.aplication.Domain.cliente.Cliente;
import com.wakanda.APIpetCliente.aplication.handler.APIException;
import com.wakanda.APIpetCliente.aplication.repository.cliente.ClienteRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@RequiredArgsConstructor
@Log4j2
public class ClienteInfraRepository implements ClienteRepository {

	ClienteSpringJpaRepository clienteSpringJpaRepository;
	@Override
	public Cliente salva(Cliente cliente) {
	log.info("inicia");
	clienteSpringJpaRepository.save(cliente);
	log.info("finaliza");
		return cliente;
	}

	@Override
	public List<Cliente> buscaTodosClientes() {
		log.info("inicia");
		List<Cliente> todosClientes = clienteSpringJpaRepository.findAll();
		log.info("finaliza");
		return todosClientes;
	}

	@Override
	public Cliente clientesByid(UUID idCliente) {
		log.info("inicia");
		Cliente cliente = clienteSpringJpaRepository.findById(idCliente)
				.orElseThrow((()-> APIException.build(HttpStatus.NOT_FOUND, "cliente não encontrado")));
		log.info("finaliza");
		return cliente;
	}

	@Override
	public void deletaById(Cliente cliente) {
		log.info("inicia");
		clienteSpringJpaRepository.delete(cliente);
		log.info("finaliza");
	}

}
