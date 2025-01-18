package com.wakanda.APIpetCliente.aplication.repository.cliente;

import java.util.List;
import java.util.UUID;

import com.wakanda.APIpetCliente.aplication.Domain.cliente.Cliente;
import com.wakanda.APIpetCliente.aplication.api.cliente.ClienteListResponse;

public interface ClienteRepository {
	Cliente salva(Cliente clientePet);

	List<Cliente> buscaTodosClientes();


	Cliente clientesByid(UUID idCliente);

	void deletaById(Cliente cliente);

	
}
