package com.wakanda.APIpetCliente.aplication.api.cliente;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.wakanda.APIpetCliente.aplication.service.Cliente.ClienteService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {
	private final ClienteService clienteService;
		
	@Override
	public ClienteResponse postCliente(ClienteRequest clienteRequest) {
	log.info("[inicia} ClienteController - postCliente]");
	ClienteResponse clienteCriado =  clienteService.criaCliente(clienteRequest);
	log.info("[Finalizar} ClienteController - postCliente]");
		return clienteCriado;
	}

	@Override
	public List<ClienteListResponse> getTodosClientes() {
		log.info("[inicia} ClienteController - getTodosClientes]");
	    List<ClienteListResponse> clientes = clienteService.buscaTodosClientes();
		log.info("[Finaliza} ClienteController - getTodosClientes]");
		return clientes;
	}

	@Override
	public ClienteDetalhadoResponse getClientesById(UUID idCliente) {
		log.info("[inicia} ClienteController -  getClientesById]");
		ClienteDetalhadoResponse clienteDetalhado = clienteService.clietesById(idCliente);
		log.info("[IdCliente]");
		log.info("[finaliza} ClienteController -  getClientesById]");
		return clienteDetalhado;
	}

	@Override
	public void deletaClientesById(UUID idCliente) {
		log.info("[inicia} ClienteController - deletaClientesById]");
		clienteService.deletaClientesById(idCliente);
		log.info("[IdCliente]");
		log.info("[finaliza} ClienteController -  deletaClientesById]");
	}

	@Override
	public void patchAlteraCliente(@PathVariable UUID idCliente, @Valid ClienteEditaRequest clienteEditaRequest) {
		
		log.info("[inicia} ClienteController - patchAlteraCliente");
		clienteService.editaCliente(idCliente, clienteEditaRequest);
		log.info("[IdCliente]");
		log.info("[finaliza} ClienteController - patchAlteraCliente");
	}


	}


	


