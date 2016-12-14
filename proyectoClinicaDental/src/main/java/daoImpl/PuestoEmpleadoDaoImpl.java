package daoImpl;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import dao.PuestoEmpleadoDao;
import model.PuestoEmpleado;

@Repository("puestoEmpeladoDao")
public class PuestoEmpleadoDaoImpl extends GenericDaoHibernate<PuestoEmpleado,Integer> implements PuestoEmpleadoDao{
	PuestoEmpleado puestoEmp= new PuestoEmpleado();
	
	public PuestoEmpleadoDaoImpl() {
		super(PuestoEmpleado.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PuestoEmpleado> findByPuesto(String puesto) {
		// TODO Auto-generated method stub
		return getSession().createCriteria(PuestoEmpleado.class).add(Restrictions.eq("puesto",puesto)).list();
	}

	@Override
	public void ingresarPuesto(Integer codMed, String puesto) {
		puestoEmp.setCodigoMedico(codMed);
		puestoEmp.setPuesto(puesto);
		this.save(puestoEmp);
		
	}

}
