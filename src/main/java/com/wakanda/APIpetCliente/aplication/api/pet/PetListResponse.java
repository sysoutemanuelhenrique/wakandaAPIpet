package com.wakanda.APIpetCliente.aplication.api.pet;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import com.wakanda.APIpetCliente.aplication.Domain.pet.Pet;
import com.wakanda.APIpetCliente.aplication.Domain.pet.Porte;
import com.wakanda.APIpetCliente.aplication.Domain.pet.SexoPet;
import com.wakanda.APIpetCliente.aplication.Domain.pet.TipoPet;
import com.wakanda.APIpetCliente.aplication.api.cliente.ClienteListResponse;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class PetListResponse {
	
	
	private Porte porte;
	private SexoPet sexoPet;
	private String microChip;
	private String raca;
	private String pelagemCor;
	private TipoPet tipoPet;
	private LocalDate dataCadastro;
	private LocalDate data;
	private Integer peso;

	public static List<PetListResponse> converte(List<Pet> pet) {
	
		return pet.stream(
				).map(PetListResponse::new)
				.collect(Collectors.toList());
	}
	
	public PetListResponse(Pet pet) {
		super();
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



}
