package com.wakanda.APIpetCliente.aplication.service.pet;

import java.util.List;
import java.util.UUID;

import com.wakanda.APIpetCliente.aplication.Domain.pet.Pet;
import com.wakanda.APIpetCliente.aplication.api.pet.PetListResponse;
import com.wakanda.APIpetCliente.aplication.api.pet.PetRequest;
import com.wakanda.APIpetCliente.aplication.api.pet.PetResponse;

import jakarta.validation.Valid;

public interface PetService {

	PetResponse criaPet(UUID clienteId, @Valid PetRequest petRequest);
	List<PetListResponse> petsClientesbyId(UUID clienteID);

	

	
			
}
	
