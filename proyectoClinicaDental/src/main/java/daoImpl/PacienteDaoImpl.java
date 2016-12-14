package daoImpl;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import dao.PacienteDao;
import model.Paciente;

@Repository("pacienteDao")
public class PacienteDaoImpl extends GenericDaoHibernate<Paciente,Integer> implements PacienteDao {
	Paciente paciente = new Paciente();
	public PacienteDaoImpl() {
		super(Paciente.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Paciente> findByCedula(Integer cedula) {
		// TODO Auto-generated method stub
		return getSession().createCriteria(Paciente.class).add(Restrictions.eq("cedula",cedula)).list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Paciente> findByNombre(String nombre) {
		return getSession().createCriteria(Paciente.class).add(Restrictions.eq("nombre",nombre)).list();
	}

	@Override
	public void createPaciente(Integer cedula, String nombre, String apellido1, 
			String apellido2,
			String correoElectronico, String direccion) {
		if(paciente.getCedula()!=cedula){
			System.out.println("cedula incorrecta");
		}
		paciente.setCedula(cedula);
		paciente.setNombre(nombre);
		paciente.setApellido1(apellido1);
		paciente.setApellido2(apellido2);
		paciente.setDireccion(direccion);
		paciente.setCorreoElectronico(correoElectronico);
		this.save(paciente);
		System.out.println("Paciente registrado"+paciente.toString());
		
	}

	@Override
	public void getPaciente(Integer cedula) {
		if(paciente.getCedula()!=cedula){
			System.out.println("cedula incorrecta");
		}
		System.out.println("cedula: "+paciente.toString());
	
	}

	@Override
	public void updatePaciente(Integer cedula, String correoElectronico,
			String direccion) {
		if(paciente.getCedula()!=cedula){
			System.out.println("cedula incorrecta");
		}
		paciente.setCorreoElectronico(correoElectronico);
		paciente.setDireccion(direccion);
		this.save(paciente);
		System.out.println("Cambio realizado"+paciente.toString());
		
	}
	
}
