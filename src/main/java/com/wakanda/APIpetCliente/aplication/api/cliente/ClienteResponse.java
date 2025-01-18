package com.wakanda.APIpetCliente.aplication.api.cliente;

import java.util.UUID;

import org.springframework.web.bind.annotation.ResponseStatus;


import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ClienteResponse {
	private UUID ClienteId;
}
