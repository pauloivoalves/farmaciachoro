package br.ufc.si.farmacia.interfaces;

import java.util.List;

import br.ufc.si.farmacia.model.Remedio;

public interface IRemedioDAO {
	public void InserirRemedio(Remedio remedio);

	public boolean AtualizarRemedio(Remedio remedio);

	public boolean DeletarRemedio(Remedio remedio);

	public Remedio RemedioPorId(Integer id);

	public List<Remedio> ListarTodosRemedios();
}
