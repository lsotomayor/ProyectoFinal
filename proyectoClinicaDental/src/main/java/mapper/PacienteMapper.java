package mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import dto.PacienteDTO;
import model.Paciente;

@Mapper
public interface PacienteMapper {
	PacienteMapper INSTANCE=Mappers.getMapper(PacienteMapper.class);
	List<PacienteDTO> pacientesToPacientesDTOs(List<Paciente> paciente);
	//source model target DTO
	@Mappings({
		@Mapping(source="cedula",target="cedula"),
		@Mapping(source="nombre",target="nombre"),
		@Mapping(source="apellido1",target="apellido1"),
		@Mapping(source="apellido2",target="apellido2"),
		@Mapping(source="direccion",target="direccion"),
		@Mapping(source="correoElectronico",target="correoElectronico"),
		@Mapping(source="pacienteTel",target="pacienteTel")
			})
	PacienteDTO pacienteToPacienteDTO(Paciente paciente);
}
