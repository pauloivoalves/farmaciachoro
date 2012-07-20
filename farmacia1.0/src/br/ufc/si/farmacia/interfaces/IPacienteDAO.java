package br.ufc.si.farmacia.interfaces;

import br.ufc.si.farmacia.model.Paciente;

public interface IPacienteDAO {
	
	public void inserirPaciente(Paciente paciente);

	public void removerPaciente(Paciente paciente);

	public void atualizarPaciente(Paciente paciente);
}// fim da interface
