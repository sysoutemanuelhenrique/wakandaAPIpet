package com.wakanda.APIpetCliente.aplication.api.cliente;

import java.time.LocalDate;
import org.hibernate.validator.constraints.br.CPF;

import com.wakanda.APIpetCliente.aplication.Domain.cliente.Sexo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class ClienteRequest {

	@NotBlank
	private String nomeCompleto;
	@Email
	@NotBlank
	private String email;
	@CPF
	@NotBlank
	private String cpf;
	private Sexo  sexo;
	private LocalDate dataCadastro;
	private LocalDate dataNascimento;
	
	
}
