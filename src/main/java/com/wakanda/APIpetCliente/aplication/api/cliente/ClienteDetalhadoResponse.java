package com.wakanda.APIpetCliente.aplication.api.cliente;

import java.util.UUID;

import org.hibernate.validator.constraints.br.CPF;

import com.wakanda.APIpetCliente.aplication.Domain.cliente.Cliente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class ClienteDetalhadoResponse {

	private UUID ClienteId;
	@NotBlank
	private String nomeCompleto;
	@Email
	@NotBlank
	private String email;
	@CPF
	@NotBlank
	private String cpf;
	
	public ClienteDetalhadoResponse(Cliente cliente) {
		this.ClienteId = cliente.getClienteId();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.email = cliente.getEmail();
		this.cpf = cliente.getCpf();	
	}
	

	
}
