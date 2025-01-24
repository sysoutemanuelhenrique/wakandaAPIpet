package com.wakanda.APIpetCliente.aplication.api.cliente;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.wakanda.APIpetCliente.aplication.service.Cliente.ClienteService;

@ExtendWith (SpringExtension.class)
class ClienteControllerTest {
	
	@InjectMocks
	private ClienteController clienteControler;
	@Mock
	private ClienteService clienteServiceMock;
	
	
	
	}


