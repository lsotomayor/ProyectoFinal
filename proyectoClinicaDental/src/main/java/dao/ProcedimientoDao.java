package dao;

import java.util.List;

import org.appfuse.dao.GenericDao;

import model.Procedimientos;

public interface ProcedimientoDao extends GenericDao<Procedimientos, Integer>{
	public List<Procedimientos> findByProcedimiento(String procedimiento);
	
	public void nuevoRegistro(String procedimiento);
}
