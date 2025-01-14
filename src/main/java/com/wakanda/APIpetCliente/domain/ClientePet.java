package com.wakanda.APIpetCliente.domain;

import java.time.LocalDate;
import java.util.UUID;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor (access = AccessLevel.PRIVATE)
@Getter
@Entity
public class ClientePet {
	
	@Id
	//@GenereteValue )strategy = GenerationType.AUTO) "Gera a senha sem precisar do construtor"
	private UUID ClienteId;
	@NotBlank
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
	private LocalDate dataCadastro;
	private LocalDate dataNascimento;
	
	public boolean ValidaSenha (String senhaNova)
	{ return this.senha.equals(senhaNova);
		
		
	}

	public ClientePet(UUID ClienteId, @NotBlank String nomeCompleto, @Email String email, @CPF int cpf, Sexo sexo,
			String senha, LocalDate dataNasciment, LocalDate dataCadastro) {
		super();
		
		this.ClienteId = UUID.randomUUID();
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.cpf = cpf;
		this.sexo = sexo;
		this.senha = senha;
		this.dataCadastro = LocalDate.now();
	}

}
