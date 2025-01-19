package com.wakanda.APIpetCliente.aplication.api.pet;

import java.time.LocalDate;

import com.wakanda.APIpetCliente.aplication.Domain.pet.Porte;
import com.wakanda.APIpetCliente.aplication.Domain.pet.SexoPet;
import com.wakanda.APIpetCliente.aplication.Domain.pet.TipoPet;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
public class PetEditaRequest {
	
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
