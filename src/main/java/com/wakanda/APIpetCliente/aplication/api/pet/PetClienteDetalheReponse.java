package com.wakanda.APIpetCliente.aplication.api.pet;

import java.time.LocalDate;
import java.util.UUID;

import com.wakanda.APIpetCliente.aplication.Domain.pet.Pet;
import com.wakanda.APIpetCliente.aplication.Domain.pet.Porte;
import com.wakanda.APIpetCliente.aplication.Domain.pet.SexoPet;
import com.wakanda.APIpetCliente.aplication.Domain.pet.TipoPet;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class PetClienteDetalheReponse {
	
	public PetClienteDetalheReponse(Pet pet) {
		this.idPet = pet.getIdPet();
		this.clienteId = pet.getClienteId();
		this.nomePet = pet.getNomePet();
		this.porte = pet.getPorte();
		this.sexoPet = pet.getSexoPet();
		this.microChip = pet.getMicroChip();
		this.raca = pet.getRaca();
		this.pelagemCor = pet.getPelagemCor();
		this.tipoPet = pet.getTipoPet();
		this.dataCadastro = LocalDate.now();
		this.data = pet.getData();
		this.peso = pet.getPeso();
	}
	
	private UUID clienteId;
	private UUID idPet;
	private String nomePet;
	private Porte porte;
	private SexoPet sexoPet;
	private String microChip;
	private String raca;
	private String pelagemCor;
	private TipoPet tipoPet;
	private LocalDate dataCadastro;
	private LocalDate data;
	private Integer peso;

}
