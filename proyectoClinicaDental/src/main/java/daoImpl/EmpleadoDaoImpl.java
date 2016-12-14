package daoImpl;

import java.util.List;


import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import dao.EmpleadoDao;
import model.Empleado;

@Repository ("empleadoDao")
public class EmpleadoDaoImpl extends GenericDaoHibernate<Empleado, Integer> implements EmpleadoDao {
	Empleado emp = new Empleado();
	public EmpleadoDaoImpl(){
		super(Empleado.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Empleado> findByCedula(Integer cedula) {
		return getSession().createCriteria(Empleado.class).add(Restrictions.eq("cedula",cedula)).list();
	}
	@SuppressWarnings("unchecked")
		@Override
		public List<Empleado> findByNombre(String nombre) {
			return getSession().createCriteria(Empleado.class).add(Restrictions.eq("nombre",nombre)).list();
		}
	

	@Override
	public void createEmpleado(Integer cedula, String nombre, String apellido1, String apellido2,
			String correoElectronico) {
		if(emp.getCedula()==cedula){
			emp.setCedula(cedula);
			emp.setNombre(nombre);
			emp.setApellido1(apellido1);
			emp.setApellido2(apellido2);
			emp.setCorreoElectronico(correoElectronico);
			this.save(emp);
			System.out.println("Empleado registrado"+emp.toString());
			//return true;
		}
		System.out.println("Empleado ya existe: "+emp.toString());
		//return false;
	}
	@Override
	public void getEmpleado(Integer cedula) {
		if(emp.getCedula()!=cedula){
			System.out.print("Usuario no exite");
		}
		System.out.print("Empleado Info: "+this.get(cedula));
	}


	
}
