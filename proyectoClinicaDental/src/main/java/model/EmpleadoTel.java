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

@XmlRootElement(name="empleadoTel")
@Entity
@Table(name="empleadotel")
public class EmpleadoTel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="empleadoTel_id", unique=true, nullable=false)
	private int empleadoTelID;
	
	@Column(name="telefono")
	private int telefono;
	@ManyToOne
	@JoinColumn(name="cedula_empleado",nullable=false)
	@JsonIgnore
	private Empleado empleado; //tabla de empleado
	public int getEmpleadoTelID() {
		return empleadoTelID;
	}
	public void setEmpleadoTelID(int empleadoTelID) {
		this.empleadoTelID = empleadoTelID;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	@Override
	public String toString() {
		return "EmpleadoTel [empleadoTelID=" + empleadoTelID + ", telefono=" + telefono + ", empleado=" + empleado
				+ "]";
	}
	
}
