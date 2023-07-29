package br.com.pjtec.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pjtec.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
