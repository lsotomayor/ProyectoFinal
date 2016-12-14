package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;

@XmlRootElement(name="puestoempleado")
@Entity
@Table(name="puestoempleado")
public class PuestoEmpleado {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idPuesto",unique=true, nullable=false)
	private int idPuesto;
	@Column(name="puesto",unique=true, nullable=false)
	private String puesto;
	@Column(name="codigoMedico",unique=true, nullable=false)
	private int codigoMedico;
	
	@ManyToOne
	@JoinColumn(name="cedula_empleado",nullable=false)
	@JsonIgnore
	private Empleado empleado; //referencia tabla empleado
	public int getIdPuesto() {
		return idPuesto;
	}
	public void setIdPuesto(int idPuesto) {
		this.idPuesto = idPuesto;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public int getCodigoMedico() {
		return codigoMedico;
	}
	public void setCodigoMedico(int codigoMedico) {
		this.codigoMedico = codigoMedico;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	@Override
	public String toString() {
		return "PuestoEmpleado [idPuesto=" + idPuesto + ", puesto=" + puesto + ", codigoMedico=" + codigoMedico
				+ ", empleado=" + empleado + "]";
	}
	
	

}
