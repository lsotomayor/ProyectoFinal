package dao;

import java.util.List;
import org.appfuse.dao.GenericDao;
import model.Empleado;

public interface EmpleadoDao extends GenericDao<Empleado, Integer> {
	public List<Empleado> findByCedula(Integer cedula);
	public List<Empleado> findByNombre(String nombre);
	
	public void createEmpleado(Integer cedula, String nombre, String apellido1, String apellido2, String correoElectronico);
	public void getEmpleado(Integer cedula);
}
