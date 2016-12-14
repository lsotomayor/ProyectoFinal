package daoImpl;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import dao.EmpleadoTelDao;
import model.EmpleadoTel;

@Repository ("empleadoTelDao")
public class EmpleadoTelDaoImpl extends GenericDaoHibernate<EmpleadoTel, Integer> implements EmpleadoTelDao {
	EmpleadoTel empTel = new EmpleadoTel();
	public EmpleadoTelDaoImpl() {
		super(EmpleadoTel.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EmpleadoTel> findByCedula(Integer cedulaEmp) {
		return getSession().createCriteria(EmpleadoTel.class).add(Restrictions.eq("cedula_empleado", cedulaEmp)).list();
	}

	@Override
	public void getNumero(Integer telefono, Integer cedulaEmp) {
		if(empTel.getEmpleado().getCedula()!=cedulaEmp){
			System.out.println("Cedula incorrecta");
		}
		System.out.println("Datos: "+this.get(telefono));
		
	}

	@Override
	public void ingresarNumero(Integer telefono, Integer cedulaEmp) {
		if(empTel.getEmpleado().getCedula()!=cedulaEmp){
			empTel.setTelefono(telefono);
			this.save(empTel);
			System.out.println("Numero Registrado");
		}
		
		
	}

	@Override
	public void updateNumero(Integer telefono, Integer cedulaEmp) {
		if(empTel.getEmpleado().getCedula()!=cedulaEmp){
			System.out.println("Cedula incorrecta");
		}
		empTel.setTelefono(telefono);
		this.save(empTel);
		System.out.println("Registro correcto");
	}

	@Override
	public void deleteNumero(Integer telefono, Integer cedulaEmp) {
		if(empTel.getEmpleado().getCedula()!=cedulaEmp){
			System.out.println("Cedula incorrecta");
		}
		this.remove(empTel.getTelefono());
		System.out.println("Registro borrado");
		
	}


}
