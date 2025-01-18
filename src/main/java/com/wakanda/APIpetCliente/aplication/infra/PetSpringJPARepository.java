package com.wakanda.APIpetCliente.aplication.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wakanda.APIpetCliente.aplication.Domain.pet.Pet;


public interface PetSpringJPARepository extends JpaRepository<Pet, UUID>{

}
