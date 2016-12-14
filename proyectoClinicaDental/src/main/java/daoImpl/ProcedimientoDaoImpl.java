package daoImpl;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;

import dao.ProcedimientoDao;
import model.Procedimientos;

public class ProcedimientoDaoImpl extends GenericDaoHibernate<Procedimientos, Integer> implements ProcedimientoDao{

	public ProcedimientoDaoImpl() {
		super(Procedimientos.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Procedimientos> findByProcedimiento(String procedimiento) {
		return getSession().createCriteria(Procedimientos.class).add(Restrictions.eq("procedimiento",procedimiento)).list();
	}

	@Override
	public void nuevoRegistro(String procedimiento) {
		Procedimientos proc = new Procedimientos();
		proc.setProcedimiento(procedimiento);
		this.save(proc);		
		
	}

}
