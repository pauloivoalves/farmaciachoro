package br.ufc.si.farmacia.teste;

import java.util.ArrayList;
import java.util.List;

import br.ufc.si.farmacia.dao.PacienteDAO;
import br.ufc.si.farmacia.dao.RemedioDAO;
import br.ufc.si.farmacia.interfaces.IPacienteDAO;
import br.ufc.si.farmacia.interfaces.IRemedioDAO;
import br.ufc.si.farmacia.model.Paciente;
import br.ufc.si.farmacia.model.Remedio;

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
	
	//paciente = ipaciente.pacientePorId(2);
	//System.out.println(paciente.getNome());
	//paciente.setNome("jorge");
	//ipaciente.atualizarPaciente(paciente);
	//ipaciente.removerPaciente(paciente);
	
	Remedio remedio = new Remedio(2, "asdas", 1, "comprimido", 30, 10, 300, "loteMedicamento", null, "notaFiscalMedicamento", "tipoAtencaoMedicamento", "tipoMedicamento",12);
	IRemedioDAO iremedio = new RemedioDAO();
	//iremedio.InserirRemedio(remedio);
	
	remedio.setNomeMedicamento("benegripe");
	//iremedio.AtualizarRemedio(remedio);
	//iremedio.DeletarRemedio(remedio);
	
	/*
	List<Remedio> remedios = iremedio.ListarTodosRemedios();
	for(Remedio elem:remedios){
		System.out.println(elem.getNomeMedicamento());
	}
	*/
	
	
	
	
}
}//fim da classe
