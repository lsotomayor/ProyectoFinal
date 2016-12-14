package service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.appfuse.service.GenericManager;

import dto.EmpleadoDTO;
import model.Empleado;

@WebService
@Path("/empleado")
public interface EmpleadoManager extends GenericManager <Empleado, Integer> {
	@GET
	@Path("{cedula}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<EmpleadoDTO> findByCedula(@PathParam("cedula") Integer cedula);
	
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<EmpleadoDTO> getCedula();
	
	@POST
	@Path("/new")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void nuevoEmpleado(@PathParam("cedula") Integer cedula,@PathParam("nombre")String nombre,
			@PathParam("apellido1")String apellido1, @PathParam("apellido2") String apellido2,
			@PathParam("correoElectronico")String correoElectronico);
	
	
}

