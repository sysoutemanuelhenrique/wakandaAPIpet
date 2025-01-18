package com.wakanda.APIpetCliente.aplication.api.cliente;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import jakarta.validation.Valid;
import lombok.Value;




@RestController
@RequestMapping  ("/v1/cliente")
public interface ClienteAPI {
	@PostMapping
	@ResponseStatus (code = HttpStatus.CREATED)
	ClienteResponse postCliente(@Valid @RequestBody ClienteRequest clienteRequest);
	
	@GetMapping 
	@ResponseStatus (code = HttpStatus.OK)
	List <ClienteListResponse> getTodosClientes ();
	
	@GetMapping (value = "/{idCliente}")
	@ResponseStatus (code = HttpStatus.OK)
	ClienteDetalhadoResponse getClientesById(@PathVariable UUID idCliente);
	
	@DeleteMapping (value = "/{idCliente}")
	@ResponseStatus (code = HttpStatus.NO_CONTENT)
	void deletaClientesById(@PathVariable UUID idCliente);
	
	@PatchMapping (value = "/{idCliente}")
	@ResponseStatus (code = HttpStatus.NO_CONTENT)
	void patchAlteraCliente(@PathVariable UUID idCliente, @Valid @RequestBody ClienteEditaRequest clienteEditaRequest);
	
	

}
