package com.wakanda.APIpetCliente.aplication.service.Cliente;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.wakanda.APIpetCliente.aplication.Domain.cliente.Cliente;
import com.wakanda.APIpetCliente.aplication.api.cliente.ClienteDetalhadoResponse;
import com.wakanda.APIpetCliente.aplication.api.cliente.ClienteEditaRequest;
import com.wakanda.APIpetCliente.aplication.api.cliente.ClienteListResponse;
import com.wakanda.APIpetCliente.aplication.api.cliente.ClienteRequest;
import com.wakanda.APIpetCliente.aplication.api.cliente.ClienteResponse;
import com.wakanda.APIpetCliente.aplication.repository.cliente.ClienteRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService{
private final ClienteRepository clienteRepository;

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		 log.info("[inicia] -  ClienteAplicationService");
		Cliente cliente =  clienteRepository.salva(new Cliente(clienteRequest));
		 log.info("[finaliza] - ClienteAplicationService");
		return ClienteResponse.builder()
				.ClienteId(cliente.getClienteId())
				.build();
	}

	@Override
	public List<ClienteListResponse> buscaTodosClientes() {
		 log.info("[inicia] -  ClienteAplicationService - buscaTodosCliente");
		 List<Cliente> clientes =  clienteRepository.buscaTodosClientes();
		 log.info("[finaliza] -  ClienteAplicationService - buscaTodosCliente");
		return ClienteListResponse.converte(clientes);
	}

	@Override
	public ClienteDetalhadoResponse clietesById(UUID idCliente) {
		 log.info("[inicia] -  ClienteAplicationService - clietesById");
		 Cliente cliente = clienteRepository.clientesByid(idCliente);
		 log.info("[finaliza] -  ClienteAplicationService - clietesById");
		return new ClienteDetalhadoResponse(cliente);
	}

	@Override
	public void deletaClientesById(UUID idCliente) {
		 log.info("[inicia] -  ClienteAplicationService - clietesById");
		 Cliente cliente = clienteRepository.clientesByid(idCliente);
		 clienteRepository.deletaById(cliente);
		 log.info("[finaliza] -  ClienteAplicationService - clietesById");
		
	}

	@Override
	public void editaCliente(UUID idCliente, ClienteEditaRequest clienteEditaRequest) {
	
		log.info("[inicia] -  ClienteAplicationService - editaCliente");
		 Cliente cliente = clienteRepository.clientesByid(idCliente);
		 cliente.altera(clienteEditaRequest);
		 clienteRepository.deletaById(cliente);
		 log.info("[finaliza] -  ClienteAplicationService - editaCliente");
		
	}

}
