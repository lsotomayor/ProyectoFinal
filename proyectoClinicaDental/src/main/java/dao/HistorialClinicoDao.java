package dao;

import java.sql.Date;
import java.util.List;

import org.appfuse.dao.GenericDao;

import model.HistorialClinico;

public interface HistorialClinicoDao extends GenericDao<HistorialClinico, Integer> {
	public List<HistorialClinico> findByCedulaPaciente(Integer cedPaciente);
	
	public void nuevoRegistro(Integer histCli, Integer cedulaPac, Integer cedulaEmp, String diagnostico,  Date proxCita, String tratamiento);
	
}
