package br.ufc.si.farmacia.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.ufc.si.farmacia.hibernate.util.HibernateUtil;
import br.ufc.si.farmacia.interfaces.IPacienteDAO;
import br.ufc.si.farmacia.model.Paciente;

public class PacienteDAO implements IPacienteDAO{

	@Override
	public void inserirPaciente(Paciente paciente) {
		Session sessao = HibernateUtil.getSession();
		Transaction trasaction = sessao.beginTransaction();
		
		try{
			sessao.save(paciente);
			trasaction.commit();
		}catch (Exception e) {
			trasaction.rollback();
		}finally{
			sessao.close();
		}
		
	}
  
}//fim da classe pacienteDAO
