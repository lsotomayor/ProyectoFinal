package serviceImpl;

import java.util.List;

import javax.jws.WebService;
import javax.transaction.Transactional;

import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.stereotype.Service;

import dao.EmpleadoDao;
import dto.EmpleadoDTO;
import mapper.EmpleadoMapper;
import model.Empleado;
import service.EmpleadoManager;

@Transactional
@Service("empleadoManager")
@WebService(serviceName="EmpleadoService",endpointInterface="service.EmpleadoManager")
public class EmpleadoImpl extends GenericManagerImpl<Empleado, Integer> implements EmpleadoManager {
	EmpleadoDao empDao;
	Empleado emp;
	
	public EmpleadoImpl() {
	}
	

	public EmpleadoImpl(EmpleadoDao empDao) {
		super(empDao);
		this.empDao = empDao;
	}


	@Override
	public List<EmpleadoDTO> findByCedula(Integer cedula) {
		List<EmpleadoDTO> empDTOs=null;
		List<Empleado> empList = empDao.findByCedula(cedula);
		empDTOs=EmpleadoMapper.INSTANCE.empleadosToEmpleadosDTOS(empList);
				return empDTOs;
	}

	@Override
	public List<EmpleadoDTO> getCedula() {
		List<EmpleadoDTO> empDTOs=null;
		List<Empleado> empList=empDao.getAll();
		empDTOs=EmpleadoMapper.INSTANCE.empleadosToEmpleadosDTOS(empList);
		return empDTOs;
	}

	@Override
	public void nuevoEmpleado(Integer cedula, String nombre, String apellido1, String apellido2,
			String correoElectronico) {
		empDao.createEmpleado(cedula, nombre, apellido1, apellido2, correoElectronico);
		
	}
	
}
