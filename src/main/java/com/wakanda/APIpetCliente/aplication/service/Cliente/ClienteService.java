package com.wakanda.APIpetCliente.aplication.service.Cliente;

import java.util.List;
import java.util.UUID;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Service;

import com.wakanda.APIpetCliente.aplication.api.cliente.ClienteDetalhadoResponse;
import com.wakanda.APIpetCliente.aplication.api.cliente.ClienteEditaRequest;
import com.wakanda.APIpetCliente.aplication.api.cliente.ClienteListResponse;
import com.wakanda.APIpetCliente.aplication.api.cliente.ClienteRequest;
import com.wakanda.APIpetCliente.aplication.api.cliente.ClienteResponse;

import jakarta.validation.Valid;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@EntityScan
public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);

	List<ClienteListResponse> buscaTodosClientes();

	ClienteDetalhadoResponse clietesById(UUID idCliente);

	void  deletaClientesById(UUID idCliente);

	void editaCliente(UUID idCliente, ClienteEditaRequest clienteEditaRequest);

	
	

}
