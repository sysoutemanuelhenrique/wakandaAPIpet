package com.wakanda.APIpetCliente.service;

import com.wakanda.APIpetCliente.aplication.ClienteRequest;
import com.wakanda.APIpetCliente.aplication.ClienteResponse;

import jakarta.validation.Valid;

public interface ClienteService {

	ClienteResponse criaCliente(@Valid ClienteRequest clienteRequest);

}
