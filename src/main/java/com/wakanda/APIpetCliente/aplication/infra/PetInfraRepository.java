package com.wakanda.APIpetCliente.aplication.infra;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.wakanda.APIpetCliente.aplication.Domain.pet.Pet;
import com.wakanda.APIpetCliente.aplication.api.pet.PetEditaRequest;
import com.wakanda.APIpetCliente.aplication.api.pet.PetListResponse;
import com.wakanda.APIpetCliente.aplication.handler.APIException;
import com.wakanda.APIpetCliente.aplication.repository.pet.PetRepository;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@RequiredArgsConstructor
@Log4j2
public class PetInfraRepository implements PetRepository {
 
	PetSpringJPARepository petSpringJPARepository;
	
	@Override
	public Pet petSalva(Pet pet) {
	Pet petSalvo = petSpringJPARepository.save(pet);
		return pet;
	}

	@Override
	public List<Pet> buscaPetsClienteById(UUID clienteID) {
		var pet = petSpringJPARepository.buscaPetsClienteById(clienteID);
		return pet;
	}

	@Override
	public Pet buscaPet(UUID petId) {
	var petBuscado = petSpringJPARepository.findById(petId).orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Pet não encontrado") );
		return petBuscado;
	}

	@Override
	public void deletaById(Pet pet) {
		petSpringJPARepository.delete(pet);
		
	}








	

}
