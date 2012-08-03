package br.ufc.si.farmacia.teste;

import java.util.ArrayList;
import java.util.List;

import br.ufc.si.farmacia.dao.DispensaMedicamentoPacienteDAO;
import br.ufc.si.farmacia.dao.PacienteDAO;
import br.ufc.si.farmacia.dao.RemedioDAO;
import br.ufc.si.farmacia.interfaces.IDispensaMedicamentoPacienteDAO;
import br.ufc.si.farmacia.interfaces.IPacienteDAO;
import br.ufc.si.farmacia.interfaces.IRemedioDAO;
import br.ufc.si.farmacia.model.DispensaMedicamentoPaciente;
import br.ufc.si.farmacia.model.Paciente;
import br.ufc.si.farmacia.model.Remedio;

public class TestaFuncionalidades {
 public static void main(String[] args) {
	
	
	Remedio remedio = new Remedio(10, "camisinha", 1, "comprimido", 30, 10, 300, "loteMedicamento", null, "notaFiscalMedicamento", "tipoAtencaoMedicamento", "tipoMedicamento",12);
	IRemedioDAO iremedio = new RemedioDAO();
	iremedio.InserirRemedio(remedio);
	
	Paciente paciente = new Paciente("lucas", 123456789L, "1234567");
    IPacienteDAO ipaciente = new PacienteDAO();
    ipaciente.inserirPaciente(paciente);
	
	DispensaMedicamentoPaciente novaDispensacao = new DispensaMedicamentoPaciente(1, "mardson", "eeeeeeee", "c", 20, null, null, paciente, remedio);
	IDispensaMedicamentoPacienteDAO dispDAO = new DispensaMedicamentoPacienteDAO();
	//dispDAO.inserirDispensaMedicamentoPaciente(novaDispensacao);
	//dispDAO.removerDispensaMedicamentoPaciente(novaDispensacao);
	dispDAO.atualizarDispensaMedicamentoPaciente(novaDispensacao);
	 
	/*List<DispensaMedicamentoPaciente> lista = new ArrayList<DispensaMedicamentoPaciente>();
	lista = dispDAO.listarTodasAsDispensacoes();
	
	for(DispensaMedicamentoPaciente elem:lista){
		System.out.println(elem.getCrm_medico() + "|" + elem.getTipo_medicamento() + "|" + elem.getQuant_saida());
	}*/
	 
	 
	 
 	}//fim da main
	 

	 
	 
	 
}//fim da classe
