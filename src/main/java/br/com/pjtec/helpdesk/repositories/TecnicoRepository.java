package br.com.pjtec.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pjtec.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
