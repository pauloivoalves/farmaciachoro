package br.ufc.si.farmacia.teste;

import br.ufc.si.farmacia.dao.PacienteDAO;
import br.ufc.si.farmacia.interfaces.IPacienteDAO;
import br.ufc.si.farmacia.model.Paciente;

public class TestaFuncionalidades {
 public static void main(String[] args) {
	IPacienteDAO ipaciente = new PacienteDAO();
	
	Paciente paciente = new Paciente("marcos", 123456789L, "12345");
	
	ipaciente.inserirPaciente(paciente);
	
	
}
}//fim da classe
