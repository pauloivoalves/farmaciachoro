package br.ufc.si.farmacia.teste;

import java.util.ArrayList;
import java.util.List;

import br.ufc.si.farmacia.dao.DispensaMedicamentoPacienteDAO;
import br.ufc.si.farmacia.dao.DispensaMedicamentoUnidadeDAO;
import br.ufc.si.farmacia.dao.PacienteDAO;
import br.ufc.si.farmacia.dao.RemedioDAO;
import br.ufc.si.farmacia.dao.UnidadeDAO;
import br.ufc.si.farmacia.interfaces.IDispensaMedicamentoPacienteDAO;
import br.ufc.si.farmacia.interfaces.IDispensaMedicamentoUnidadeDAO;
import br.ufc.si.farmacia.interfaces.IPacienteDAO;
import br.ufc.si.farmacia.interfaces.IRemedioDAO;
import br.ufc.si.farmacia.interfaces.IUnidadeDAO;
import br.ufc.si.farmacia.model.DispensaMedicamentoPaciente;
import br.ufc.si.farmacia.model.DispensaMedicamentoUnidade;
import br.ufc.si.farmacia.model.Paciente;
import br.ufc.si.farmacia.model.Remedio;
import br.ufc.si.farmacia.model.Unidade;

public class TestaFuncionalidades {
 public static void main(String[] args) {
	
	
	Remedio remedio = new Remedio(14, "ASS Infantil", 1, "comprimido", 30, 10, 300, "loteMedicamento", null, "notaFiscalMedicamento", "tipoAtencaoMedicamento", "tipoMedicamento",12);
	//IRemedioDAO iremedio = new RemedioDAO();
	//iremedio.InserirRemedio(remedio);
	
	Unidade unidade = new Unidade(3, "PSF Caicarinha", "Janaina");
	//IUnidadeDAO iunidade = new UnidadeDAO();
	//iunidade.salvarUnidade(unidade);
	
	DispensaMedicamentoUnidade dmu = new DispensaMedicamentoUnidade(2, "ffffffffffff", "fffffffffff", 2, null, remedio, unidade);
	IDispensaMedicamentoUnidadeDAO dao = new DispensaMedicamentoUnidadeDAO();
	dao.removerDispensaMedicamentoUnidade(dmu);
	
	List<DispensaMedicamentoUnidade> lista = new ArrayList<DispensaMedicamentoUnidade>();
	lista = dao.listarTodasAsDispensacoes();
	
	for(DispensaMedicamentoUnidade elem:lista){
		System.out.println(elem.getId() + "|" + elem.getTipoMedicamento() + "|" + elem.getQtdSaida());
	}

	 
	 System.out.println("beleza");
	
	
	
	//Paciente paciente = new Paciente("lucas", 123456789L, "1234567");
    //IPacienteDAO ipaciente = new PacienteDAO();
    //ipaciente.inserirPaciente(paciente);
	
	//DispensaMedicamentoPaciente novaDispensacao = new DispensaMedicamentoPaciente(1, "mardson", "eeeeeeee", "c", 20, null, null, paciente, remedio);
	//IDispensaMedicamentoPacienteDAO dispDAO = new DispensaMedicamentoPacienteDAO();
	//dispDAO.inserirDispensaMedicamentoPaciente(novaDispensacao);
	//dispDAO.removerDispensaMedicamentoPaciente(novaDispensacao);
	//dispDAO.atualizarDispensaMedicamentoPaciente(novaDispensacao);
	 
		 
	 
	 
 	}//fim da main
	 

	 
	 
	 
}//fim da classe
