package br.com.pjtec.helpdesk.domain;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
private List<Chamado> chamados = new ArrayList<>();

public Cliente() {
	super();
}

public Cliente(Integer id, String nome, String cpf, String email, String senha) {
	super(id, nome, cpf, email, senha);
}

public Cliente(List<Chamado> chamados) {
	this.chamados = chamados;
}


}
