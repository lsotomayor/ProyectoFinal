package dao;

import java.util.List;

import org.appfuse.dao.GenericDao;

import model.EmpleadoTel;
public interface EmpleadoTelDao extends GenericDao<EmpleadoTel, Integer> {

	public List<EmpleadoTel> findByCedula(Integer cedulaEmp);
	
	public void getNumero(Integer telefono, Integer cedulaEmp);
	public void ingresarNumero(Integer telefono, Integer cedulaEmp);
	public void updateNumero(Integer telefono, Integer cedulaEmp);
	public void deleteNumero(Integer telefono, Integer cedulaEmp);
}
