package com.wakanda.APIpetCliente.aplication.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wakanda.APIpetCliente.aplication.Domain.cliente.Cliente;

public interface ClienteSpringJpaRepository extends JpaRepository<Cliente, UUID>{

}
