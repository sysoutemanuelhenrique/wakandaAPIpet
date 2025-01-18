package com.wakanda.APIpetCliente.aplication.Domain.pet;

import java.time.LocalDate;
import java.util.UUID;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Indexed;

import com.wakanda.APIpetCliente.aplication.api.cliente.ClienteEditaRequest;
import com.wakanda.APIpetCliente.aplication.api.cliente.ClienteRequest;
import com.wakanda.APIpetCliente.aplication.api.pet.PetRequest;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor (access = AccessLevel.PRIVATE)
@Getter
@Entity
@EntityScan
public class Pet {
	

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (columnDefinition ="uuid", name= "id", updatable = false, unique = true, nullable = false)
	private UUID idPet;
	@NotNull
	@Column (columnDefinition ="uuid", name= "clienteId", updatable = false, unique = true, nullable = false)
	private UUID clienteId;
	@NotBlank
	private String nomePet;
	@Enumerated(EnumType.STRING)
	private Porte porte;
	@Enumerated(EnumType.STRING)
	private SexoPet sexoPet;
	@Enumerated(EnumType.STRING)
	private String microChip;
	private String raca;
	private String pelagemCor;
	private TipoPet tipoPet;
	private LocalDate dataCadastro;
	private LocalDate data;
	private Integer peso;

		
		
	
		
		
	



	public Pet(UUID clienteId, @Valid PetRequest petRequest) {
		this.clienteId = petRequest.getClienteId();
		this.nomePet = petRequest.getNomePet();
		this.porte = petRequest.getPorte();
		this.sexoPet = petRequest.getSexoPet();
		this.microChip = petRequest.getMicroChip();
		this.raca = petRequest.getRaca();
		this.pelagemCor = petRequest.getPelagemCor();
		this.tipoPet = petRequest.getTipoPet();
		this.dataCadastro = petRequest.getDataCadastro();
		this.data = petRequest.getData();
		this.peso = petRequest.getPeso();
	
		
	}














	
	}
	



		
	


