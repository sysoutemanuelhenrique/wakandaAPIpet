package com.wakanda.APIpetCliente.aplication.api.cliente;

import java.time.LocalDate;

import com.wakanda.APIpetCliente.aplication.Domain.cliente.Sexo;

public class ClienteEditaRequest {
	private Sexo  sexo;
	private LocalDate dataCadastro;
	private LocalDate dataNascimento;
}
