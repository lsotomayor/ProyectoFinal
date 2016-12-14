package dao;

import java.util.List;

import org.appfuse.dao.GenericDao;
import org.springframework.stereotype.Repository;

import model.PacienteTel;
	@Repository("pacienteTelDao")
public interface PacienteTelDao extends GenericDao<PacienteTel, Integer> {
//telefono -cedulapaciente
	public List<PacienteTel> findByCedula(Integer cedulaPac);
	
	public void getNumero(Integer telefono, Integer cedulaPac);
	public void ingresarNumero(Integer telefono, Integer cedulaPac);
	public void updateNumero(Integer telefono, Integer cedulaPac);
	public void deleteNumero(Integer telefono, Integer cedulaPac);
	
}
