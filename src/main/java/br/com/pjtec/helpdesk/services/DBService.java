package br.com.pjtec.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pjtec.helpdesk.domain.Chamado;
import br.com.pjtec.helpdesk.domain.Cliente;
import br.com.pjtec.helpdesk.domain.Tecnico;
import br.com.pjtec.helpdesk.domain.enums.Perfil;
import br.com.pjtec.helpdesk.domain.enums.Prioridade;
import br.com.pjtec.helpdesk.domain.enums.Status;
import br.com.pjtec.helpdesk.repositories.ChamadoRepository;
import br.com.pjtec.helpdesk.repositories.ClienteRepository;
import br.com.pjtec.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Paulo Costa", "04360638086", "paulotec@gmail.com", "123" );
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Neymar Jr", "27659144006", "naymarjr@gmail.com", "123");
		
		Chamado c1 =  new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
}
