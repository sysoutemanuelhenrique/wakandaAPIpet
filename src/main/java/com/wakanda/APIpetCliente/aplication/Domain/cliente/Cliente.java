package com.wakanda.APIpetCliente.aplication.Domain.cliente;

import java.time.LocalDate;
import java.util.UUID;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.wakanda.APIpetCliente.aplication.api.cliente.ClienteEditaRequest;
import com.wakanda.APIpetCliente.aplication.api.cliente.ClienteRequest;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor (access = AccessLevel.PRIVATE)
@Getter
@Entity
@EntityScan
public class Cliente {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (columnDefinition ="uuid", name= "id", updatable = false, unique = true, nullable = false)
	private UUID clienteId;
	@NotBlank
	private String nomeCompleto;
	@Email
	@Column (unique = true)
	@NotBlank
	private String email;
	@CPF
	@Column (unique = true)
	@NotBlank
	private String cpf;
	private Sexo  sexo;
	private LocalDate dataCadastro;
	private LocalDate dataNascimento;
	

	public Cliente(ClienteRequest clienteRequest) {
		
		this.nomeCompleto = clienteRequest.getNomeCompleto();
		this.email = clienteRequest.getEmail();
		this.cpf = clienteRequest.getCpf();
		this.sexo = clienteRequest.getSexo();
		this.dataCadastro = LocalDate.now();
		this.dataNascimento = clienteRequest.getDataNascimento();
		
	}


	public void altera(ClienteEditaRequest clienteRequest) {
		
	
		this.dataCadastro = LocalDate.now();
		
		
		
	}


	public static Object builder() {
		
		return null;
	}
	



		
	

}
