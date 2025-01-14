package com.wakanda.APIpetCliente.aplication;

import org.springframework.web.bind.annotation.RestController;

import com.wakanda.APIpetCliente.service.ClienteService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@AllArgsConstructor
public class ClienteController implements ClienteAPI {
	
	private final ClienteService clienteService;

	@Override
	public ClienteResponse postCliente(@Valid ClienteRequest clienteRequest) {
	log.info("[inicia} ClienteController - postCliente]");
	ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
	log.info("[Finalizar} ClienteController - postCliente]");
		return null;
	}

}
