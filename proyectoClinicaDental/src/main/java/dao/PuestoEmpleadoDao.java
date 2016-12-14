package dao;

import java.util.List;

import org.appfuse.dao.GenericDao;
import org.springframework.stereotype.Repository;

import model.PuestoEmpleado;

@Repository("puestoEmpleadoDao")
public interface PuestoEmpleadoDao extends GenericDao<PuestoEmpleado, Integer> {
//cod, puesot, cedula
	public List<PuestoEmpleado> findByPuesto(String puesto);
	
	public void ingresarPuesto(Integer codMed, String puesto);
	
	
}
