package com.wakanda.APIpetCliente.aplication;

import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class ClienteController implements ClienteAPI {

	@Override
	public ClienteResponse postCliente(@Valid ClienteRequest clienteRequest) {
	log.info("[inicia} ClienteController - postCliente]");
	log.info("[Finalizar} ClienteController - postCliente]");
		return null;
	}

}
