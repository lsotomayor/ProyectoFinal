package daoImpl;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;

import dao.PacienteTelDao;
import model.PacienteTel;

public class PacienteTelImpl extends GenericDaoHibernate<PacienteTel,Integer> implements PacienteTelDao{
	PacienteTel pacienteTel = new PacienteTel();
	public PacienteTelImpl() {
		super(PacienteTel.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PacienteTel> findByCedula(Integer cedulaPac) {
		return getSession().createCriteria(PacienteTel.class).add(Restrictions.eq("cedula_paciente",cedulaPac)).list();
	}

	@Override
	public void getNumero(Integer telefono, Integer cedulaPac) {
		if(pacienteTel.getPaciente().getCedula()!=cedulaPac){
			System.out.print("Cedula Incorrecta");
		}
		pacienteTel.setTelefono(telefono);
		this.save(pacienteTel);
		System.out.print("Registro correcto");
	}

	@Override
	public void ingresarNumero(Integer telefono, Integer cedulaPac) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateNumero(Integer telefono, Integer cedulaPac) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteNumero(Integer telefono, Integer cedulaPac) {
		// TODO Auto-generated method stub
		
	}

}
