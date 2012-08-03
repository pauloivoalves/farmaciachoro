package br.ufc.si.farmacia.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.ufc.si.farmacia.hibernate.util.HibernateUtil;
import br.ufc.si.farmacia.interfaces.IRemedioDAO;
import br.ufc.si.farmacia.model.Remedio;

public class RemedioDAO implements IRemedioDAO {

	@Override
	public void InserirRemedio(Remedio remedio) {

		Session sessao = HibernateUtil.getSession();
		Transaction txt = sessao.beginTransaction();

		try {
			sessao.save(remedio);
			txt.commit();
		} catch (Exception e) {
			txt.rollback();
		} finally {
			sessao.close();
		}
	}// fim do método salvar

	@Override
	public boolean AtualizarRemedio(Remedio remedio) {
		Session sessao = HibernateUtil.getSession();
		Transaction trasaction = sessao.beginTransaction();

		try {
			sessao.update(remedio);
			trasaction.commit();
			return true;
		} catch (Exception e) {
			trasaction.rollback();
		} finally {
			sessao.close();
		}

		return false;
	}// fim do método

	@Override
	public boolean DeletarRemedio(Remedio remedio) {
		Session sessao = HibernateUtil.getSession();
		Transaction txt = sessao.beginTransaction();

		try {
			sessao.delete(remedio);
			txt.commit();
			return true;
		} catch (Exception e) {
			txt.rollback();
		} finally {
			sessao.close();
		}
		return false;
	}// fim do método

	@Override
	public Remedio RemedioPorId(Integer id) {
		Remedio remedioAuxiliar;
		Session sessao = HibernateUtil.getSession();
		Transaction txt = sessao.beginTransaction();

		try {
			remedioAuxiliar = (Remedio) sessao.get(Remedio.class, id);
			txt.commit();
			return remedioAuxiliar;
		} catch (Exception e) {
			txt.rollback();
		} finally {
			sessao.close();
		}

		return null;
	}// fim do método

	@Override
	public List<Remedio> ListarTodosRemedios() {
	

		Session sessao = HibernateUtil.getSession();

		try {

			Query query =  sessao.createQuery("from Remedio");
			return query.list();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			 sessao.close();
			
		}

		return null;
	}//fim do método
}// fim da classe
