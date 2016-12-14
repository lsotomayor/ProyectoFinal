package dao;

import java.util.List;

import org.appfuse.dao.GenericDao;

import model.Paciente;

public interface PacienteDao extends GenericDao<Paciente,Integer> {
	public List<Paciente> findByCedula(Integer cedula);
	public List<Paciente> findByNombre(String nombre);
	
	public void createPaciente(Integer cedula, String nombre, String apellido1, String apellido2, String correoElectronico, String direccion);
	public void getPaciente(Integer cedula);
	public void updatePaciente(Integer cedula, String correoElectronico, String direccion);
	
}
