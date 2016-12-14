package dto;

import java.sql.Date;
import java.util.Arrays;

import javax.xml.bind.annotation.XmlRootElement;

import model.Procedimientos;

@XmlRootElement(name="historialClinicoDTO")
public class HistorialClinicoDTO {
	private int idHistorial;
	private int cedulaPaciente;
	private int cedulaEmpleado;
	private String tratamiento;
	private String diagnostico;
	private Date proximaCita;
	private Procedimientos[] procedimientos;
	
	public HistorialClinicoDTO(){
		super();
	}

	public HistorialClinicoDTO(int idHistorial, int cedulaPaciente, int cedulaEmpleado, String tratamiento,
			String diagnostico, Date proximaCita, Procedimientos[] procedimientos) {
		super();
		this.idHistorial = idHistorial;
		this.cedulaPaciente = cedulaPaciente;
		this.cedulaEmpleado = cedulaEmpleado;
		this.tratamiento = tratamiento;
		this.diagnostico = diagnostico;
		this.proximaCita = proximaCita;
		this.procedimientos = procedimientos;
	}

	public int getIdHistorial() {
		return idHistorial;
	}

	public void setIdHistorial(int idHistorial) {
		this.idHistorial = idHistorial;
	}

	public int getCedulaPaciente() {
		return cedulaPaciente;
	}

	public void setCedulaPaciente(int cedulaPaciente) {
		this.cedulaPaciente = cedulaPaciente;
	}

	public int getCedulaEmpleado() {
		return cedulaEmpleado;
	}

	public void setCedulaEmpleado(int cedulaEmpleado) {
		this.cedulaEmpleado = cedulaEmpleado;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public Date getProximaCita() {
		return proximaCita;
	}

	public void setProximaCita(Date proximaCita) {
		this.proximaCita = proximaCita;
	}

	public Procedimientos[] getProcedimientos() {
		return procedimientos;
	}

	public void setProcedimientos(Procedimientos[] procedimientos) {
		this.procedimientos = procedimientos;
	}

	@Override
	public String toString() {
		return "HistorialClinicoDTO [idHistorial=" + idHistorial + ", cedulaPaciente=" + cedulaPaciente
				+ ", cedulaEmpleado=" + cedulaEmpleado + ", tratamiento=" + tratamiento + ", diagnostico=" + diagnostico
				+ ", proximaCita=" + proximaCita + ", procedimientos=" + Arrays.toString(procedimientos) + "]";
	}

	
}
