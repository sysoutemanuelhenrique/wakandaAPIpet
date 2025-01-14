package com.wakanda.APIpetCliente.aplication;

import java.time.LocalDate;
import java.util.UUID;

import org.hibernate.validator.constraints.br.CPF;

import com.wakanda.APIpetCliente.domain.Sexo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Value;

@Value
public class ClienteRequest {

	private String nomeCompleto;
	@Email
	@NotBlank
	private String email;
	@CPF
	@NotBlank
	private int cpf;
	private Sexo  sexo;
	
	@Getter(value = AccessLevel.PRIVATE)
	private String senha;
	
}
