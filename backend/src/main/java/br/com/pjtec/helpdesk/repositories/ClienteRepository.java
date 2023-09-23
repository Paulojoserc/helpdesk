package br.com.pjtec.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pjtec.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
