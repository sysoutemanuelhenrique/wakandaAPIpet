package com.wakanda.APIpetCliente.aplication.api.pet;

import java.time.LocalDate;
import java.util.UUID;

import com.wakanda.APIpetCliente.aplication.Domain.pet.Porte;
import com.wakanda.APIpetCliente.aplication.Domain.pet.SexoPet;
import com.wakanda.APIpetCliente.aplication.Domain.pet.TipoPet;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class PetRequest {
	
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
	@NotNull
	private UUID clienteId;
}
