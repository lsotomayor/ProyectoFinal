package model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
@Table(name="historialclinico")
public class HistorialClinico {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idHistorial",unique=true, nullable=false)
	private int idHistorial;
	@Column(name="cedula_paciente",nullable=false)
	private int cedulaPaciente;
	@Column(name="cedula_empleado",nullable=false)
	private int cedulaEmpleado;
	@Column(name="tratamiento", nullable=false)
	private String tratamiento;
	@Column(name="diagnostico", nullable=false)
	private String diagnostico;
	@Column(name="proximaCita",nullable=false)
	private Date proximaCita;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="historialClinico", cascade=CascadeType.ALL)
	private Set<Procedimientos> procedimientos;
	
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
	public Set<Procedimientos> getProcedimientos() {
		return procedimientos;
	}
	public void setProcedimientos(Set<Procedimientos> procedimientos) {
		this.procedimientos = procedimientos;
	}
	@Override
	public String toString() {
		return "HistorialClinico [idHistorial=" + idHistorial + ", cedulaPaciente=" + cedulaPaciente
				+ ", cedulaEmpleado=" + cedulaEmpleado + ", tratamiento=" + tratamiento + ", diagnostico=" + diagnostico
				+ ", proximaCita=" + proximaCita + ", procedimientos=" + procedimientos + "]";
	}
	
	
}
