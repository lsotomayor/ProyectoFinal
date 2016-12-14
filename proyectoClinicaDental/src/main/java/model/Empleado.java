package model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity
@Table(name="empleado")
public class Empleado {
	@Id
	@Column(name="cedula", unique=true, nullable=false)
	private Integer cedula;
	@Column(name="nombre", nullable=false)
	private String nombre;
	@Column(name="apellido1",  nullable=false)
	private String apellido1;
	@Column(name="apellido2", nullable=false)
	private String apellido2;
	@Column(name="correoElectronico", nullable=false)
	private String correoElectronico;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="empleado", cascade=CascadeType.ALL)
	private Set <EmpleadoTel> empleadoTel;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="empleado",cascade=CascadeType.ALL)
	private Set <PuestoEmpleado> puestoEmpleado;
	
	public Integer getCedula() {
		return cedula;
	}
	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	
	public Set<EmpleadoTel> getEmpleadoTel() {
		return empleadoTel;
	}
	public void setEmpleadoTel(Set<EmpleadoTel> telefono) {
		this.empleadoTel = telefono;
	}
	public Set<PuestoEmpleado> getPuestoEmpleado() {
		return puestoEmpleado;
	}
	public void setPuestoEmpleado(Set<PuestoEmpleado> puestoEmpleado) {
		this.puestoEmpleado = puestoEmpleado;
	}
	@Override
	public String toString() {
		return "Empleado [cedula=" + cedula + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", correoElectronico=" + correoElectronico + ", empleadoTel=" + empleadoTel
				+ ", puestoEmpleado=" + puestoEmpleado + "]";
	}
	
	
	
}
