package com.wakanda.APIpetCliente.aplication.api.pet;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import com.wakanda.APIpetCliente.aplication.Domain.pet.Pet;
import com.wakanda.APIpetCliente.aplication.api.cliente.ClienteListResponse;
import com.wakanda.APIpetCliente.aplication.api.cliente.ClienteResponse;
import com.wakanda.APIpetCliente.aplication.service.Cliente.ClienteService;
import com.wakanda.APIpetCliente.aplication.service.pet.PetService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequiredArgsConstructor
public class PetControler implements PetAPI {

	private final PetService petService;
	

	@Override
	public PetResponse postPET(UUID clienteId, @Valid PetRequest petRequest) {
		log.info("[inicia} PetController - postPet]");
	PetResponse postPet =  petService.criaPet(clienteId, petRequest);
		log.info("[IdCliente]");
		log.info("[Finalizar} PetController - postPet]");
			return postPet;
	
	}

	@Override
	public List<PetListResponse> getPetsDomClientebyId(UUID clienteID) {
		
		log.info("[inicia} PetController - getPetsDomClientebyId]");
		log.info("{IdCliente}", clienteID);
		 List<PetListResponse> pets = petService.petsClientesbyId(clienteID);
		log.info("[Finalizar} PetController - getPetsDomClientebyId]");
		
		return pets;
	}

	@Override
	public PetClienteDetalheReponse getPetClienteComId(UUID clienteID, UUID petId) {
		log.info("[inicia} PetController - getPetClienteComId]");
		PetClienteDetalheReponse pet = petService.buscaPetDosClientesComId(clienteID, petId);
		log.info("{IdCliente} {} - {petId}", clienteID, petId);
		log.info("[Finalizar} PetController - ggetPetClienteComId]");
		return pet;
	}

}
