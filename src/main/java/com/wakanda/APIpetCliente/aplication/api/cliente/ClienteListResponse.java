package com.wakanda.APIpetCliente.aplication.api.cliente;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.hibernate.validator.constraints.br.CPF;

import com.wakanda.APIpetCliente.aplication.Domain.cliente.Cliente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;
@Value
public class ClienteListResponse {
	private UUID ClienteId;
	@NotBlank
	private String nomeCompleto;
	@Email
	@NotBlank
	private String email;
	@CPF
	@NotBlank
	private String cpf;
	
	public static List<ClienteListResponse> converte(List<Cliente> clientes) {
		return clientes.stream()
				.map(c -> new ClienteListResponse(c))
				.collect(Collectors.toList());
	}

	public ClienteListResponse(Cliente clientePet) {
		super();
		this.ClienteId = clientePet.getClienteId();
		this.nomeCompleto = clientePet.getNomeCompleto();
		this.email = clientePet.getEmail();
		this.cpf = clientePet.getCpf();
	}
}
