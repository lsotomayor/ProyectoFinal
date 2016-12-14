package daoImpl;

import java.sql.Date;
import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import dao.HistorialClinicoDao;
import model.HistorialClinico;

@Repository("historialClinicoDao")
public class HistorialClinicoDaoImpl extends GenericDaoHibernate<HistorialClinico, Integer> implements HistorialClinicoDao {
	HistorialClinico hisCli = new HistorialClinico();
	
	public HistorialClinicoDaoImpl(	) {
		super(HistorialClinico.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<HistorialClinico> findByCedulaPaciente(Integer cedPaciente) {
				return getSession().createCriteria(HistorialClinico.class).add(Restrictions.eq("cedula_paciente",cedPaciente)).list();
	}

	
	@Override
	public void nuevoRegistro(Integer histCli, Integer cedulaPac, 
			Integer cedulaEmp, String diagnostico,
			 Date proxCita, String tratamiento) {
		if(hisCli.getCedulaPaciente()!=histCli){
			hisCli.setDiagnostico(diagnostico);
			hisCli.setTratamiento(tratamiento);
			hisCli.setProximaCita(proxCita);
			this.save(hisCli);
			System.out.println("Nuevo registro: "+hisCli.toString());
		}
		System.out.println("");
	}

}
