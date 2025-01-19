package com.wakanda.APIpetCliente.aplication.api.pet;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wakanda.APIpetCliente.aplication.api.cliente.ClienteListResponse;
import com.wakanda.APIpetCliente.aplication.api.cliente.ClienteRequest;
import com.wakanda.APIpetCliente.aplication.api.cliente.ClienteResponse;

import jakarta.validation.Valid;

@RestController
@RequestMapping  ("/v1/cliente/{idCliente}/pet")
public interface PetAPI {
	
	@PostMapping
	@ResponseStatus (code = HttpStatus.CREATED)
	PetResponse postPET(@PathVariable UUID clienteID, @Valid 
			@RequestBody PetRequest petRequest);
	
	@GetMapping 
	@ResponseStatus (code = HttpStatus.OK)
	List <PetListResponse> getPetsDomClientebyId (@PathVariable UUID clienteID);
	

}
