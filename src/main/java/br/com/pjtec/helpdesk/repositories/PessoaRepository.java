package br.com.pjtec.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pjtec.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}