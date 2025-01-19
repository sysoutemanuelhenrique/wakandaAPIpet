package com.wakanda.APIpetCliente.aplication.repository.pet;

import java.util.List;
import java.util.UUID;

import com.wakanda.APIpetCliente.aplication.Domain.cliente.Cliente;
import com.wakanda.APIpetCliente.aplication.Domain.pet.Pet;

public interface PetRepository {
	Pet petSalva(Pet pet);
	List<Pet> buscaPetsClienteById(UUID clienteID);
	Pet buscaPet(UUID petId);

}
