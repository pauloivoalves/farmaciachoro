package br.ufc.si.farmacia.teste;

import br.ufc.si.farmacia.dao.MedicamentoDAO;
import br.ufc.si.farmacia.interfaces.IMedicamentoDAO;
import br.ufc.si.farmacia.model.Medicamento;

public class TestaMedicamento {
	
	public static void main(String[] args) {

		Medicamento medicamento = new Medicamento(14, "ASS Infantil", 1, "comprimido", 30, 10, 300, "loteMedicamento", null, "notaFiscalMedicamento", "tipoAtencaoMedicamento", "tipoMedicamento",12);
	    IMedicamentoDAO imedic = new MedicamentoDAO();
	   imedic.InserirRemedio(medicamento);	
	}
	
    

}//fim da classe
