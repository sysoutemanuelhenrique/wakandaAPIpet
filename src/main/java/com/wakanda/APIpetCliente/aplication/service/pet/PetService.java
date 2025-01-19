package com.wakanda.APIpetCliente.aplication.service.pet;

import java.util.List;
import java.util.UUID;

import com.wakanda.APIpetCliente.aplication.Domain.pet.Pet;
import com.wakanda.APIpetCliente.aplication.api.pet.PetClienteDetalheReponse;
import com.wakanda.APIpetCliente.aplication.api.pet.PetEditaRequest;
import com.wakanda.APIpetCliente.aplication.api.pet.PetListResponse;
import com.wakanda.APIpetCliente.aplication.api.pet.PetRequest;
import com.wakanda.APIpetCliente.aplication.api.pet.PetResponse;

import jakarta.validation.Valid;

public interface PetService {

	PetResponse criaPet(UUID clienteId, @Valid PetRequest petRequest);
	List<PetListResponse> petsClientesbyId(UUID clienteID);

	PetClienteDetalheReponse buscaPetDosClientesComId(UUID clienteID, UUID petId);
	void deletaPetById(UUID clienteID, UUID petId);
	void editaCliente(UUID clienteID, UUID petId,PetEditaRequest petEditaRequest);

	

	
			
}
	
