package mapper;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import dto.EmpleadoDTO;
import model.Empleado;

@Mapper
public interface EmpleadoMapper {
	EmpleadoMapper INSTANCE =	Mappers.getMapper(EmpleadoMapper.class);
	List<EmpleadoDTO> empleadosToEmpleadosDTOS(List<Empleado> empleados);
	//source model target DTO
	// empleadoTel source nombre del xml
	
	@Mappings({
		@Mapping(source="cedula",target="cedula"),
		@Mapping(source="nombre",target="nombre"),
		@Mapping(source="apellido1",target="apellido1"),
		@Mapping(source="apellido2",target="apellido2"),
		@Mapping(source="correoElectronico",target="correoElectronico"),
		@Mapping(source="empleadoTel",target="empTel"),
		@Mapping(source="puestoEmpleado",target="puestoEmpleado")
	})
	EmpleadoDTO empleadoToEmpleadoDTO(Empleado emp);
}
