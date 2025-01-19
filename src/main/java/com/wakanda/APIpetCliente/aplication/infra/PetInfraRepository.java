package com.wakanda.APIpetCliente.aplication.infra;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.wakanda.APIpetCliente.aplication.Domain.pet.Pet;
import com.wakanda.APIpetCliente.aplication.api.pet.PetListResponse;
import com.wakanda.APIpetCliente.aplication.repository.pet.PetRepository;

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


	

}
