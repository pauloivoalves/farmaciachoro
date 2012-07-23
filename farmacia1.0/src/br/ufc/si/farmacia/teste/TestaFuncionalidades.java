package br.ufc.si.farmacia.teste;

import java.util.ArrayList;
import java.util.List;

import br.ufc.si.farmacia.dao.PacienteDAO;
import br.ufc.si.farmacia.interfaces.IPacienteDAO;
import br.ufc.si.farmacia.model.Paciente;

public class TestaFuncionalidades {
 public static void main(String[] args) {
	IPacienteDAO ipaciente = new PacienteDAO();
	
	Paciente paciente = new Paciente("lucas", 123456789L, "1234567");
	
	//ipaciente.inserirPaciente(paciente);
	
	/*
	List<Paciente> lista = new ArrayList<Paciente>();
	lista = ipaciente.listaTodosPacientes();
	
	for(Paciente elem:lista){
		System.out.println(elem.getNome() + "|" + elem.getNumero_cartao_sus() + "|" + elem.getRg());
	}
	*/
	
	paciente = ipaciente.pacientePorId(2);
	//System.out.println(paciente.getNome());
	//paciente.setNome("jorge");
	//ipaciente.atualizarPaciente(paciente);
	//ipaciente.removerPaciente(paciente);
	
}
}//fim da classe
