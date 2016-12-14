package mapper;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import dto.HistorialClinicoDTO;
import model.HistorialClinico;
@Mapper
public interface HistorialClinicoMapper {
	HistorialClinicoMapper INSTANCE=Mappers.getMapper(HistorialClinicoMapper.class);
	List<HistorialClinicoDTO> historialsToHistorialsDTOs(List<HistorialClinico> historialClinico);
	
	//source model target DTO
	@Mappings({
		@Mapping(source="idHistorial",target="idHistorial"),
		@Mapping(source="cedula_paciente",target="cedulaPaciente"),
		@Mapping(source="cedula_empleado",target="cedulaEmpleado"),
		@Mapping(source="tratamiento",target="tratamiento"),
		@Mapping(source="diagnostico",target="diagnostico"),
		@Mapping(source="proximaCita",target="proximaCita"),
		@Mapping(source="procedmiento",target="procedimientos")
	})
	HistorialClinicoDTO historialClinicoToHistorialClinicoDTO(HistorialClinico historialClinico);
}
