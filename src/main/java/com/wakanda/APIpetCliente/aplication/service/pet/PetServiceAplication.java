package com.wakanda.APIpetCliente.aplication.service.pet;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.wakanda.APIpetCliente.aplication.Domain.cliente.Cliente;
import com.wakanda.APIpetCliente.aplication.Domain.pet.Pet;
import com.wakanda.APIpetCliente.aplication.api.cliente.ClienteListResponse;
import com.wakanda.APIpetCliente.aplication.api.cliente.ClienteResponse;
import com.wakanda.APIpetCliente.aplication.api.pet.PetListResponse;
import com.wakanda.APIpetCliente.aplication.api.pet.PetRequest;
import com.wakanda.APIpetCliente.aplication.api.pet.PetResponse;
import com.wakanda.APIpetCliente.aplication.repository.pet.PetRepository;
import com.wakanda.APIpetCliente.aplication.service.Cliente.ClienteService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class PetServiceAplication implements PetService {

	private final ClienteService clienteService;
	private final PetRepository petRepository;
	
	@Override
	public PetResponse criaPet(UUID clienteId, @Valid PetRequest petRequest) {
		
		log.info("[Inicia] - PetAplicationService - criaPet");
		clienteService.clietesById(clienteId);
		Pet pet =  petRepository.petSalva(new Pet(clienteId, petRequest));
		log.info("[finaliza] - PetAplicationService - criaPet");
		return new PetResponse(pet.getIdPet());
		
	}

	@Override
	public List<PetListResponse> petsClientesbyId(UUID clienteID) {
		log.info("[Inicia] - PetAplicationService -  petsClientesbyIt");
		clienteService.clietesById(clienteID);
		List<Pet> pet = petRepository.buscaPetsClienteById(clienteID);
		log.info("[finaliza] - PetAplicationService -  petsClientesbyIt");
		return PetListResponse.converte(pet);
	}

}
