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
@Table(name="paciente")
public class Paciente {
	@Id
	@Column(name="cedula", unique=true, nullable=false)
	private int cedula;
	@Column(name="nombre",nullable=false)
	private String nombre;
	@Column(name="apellido1", nullable=false)
	private String apellido1;
	@Column(name="apellido2", nullable=false)
	private String apellido2;
	@Column(name="direccion",nullable=false)
	private String direccion;
	@Column(name="correoElectronico",nullable=false)
	private String correoElectronico;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="paciente", cascade=CascadeType.ALL)
	private Set <PacienteTel> pacienteTel;
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public Set<PacienteTel> getPacienteTel() {
		return pacienteTel;
	}
	public void setPacienteTel(Set<PacienteTel> pacienteTel) {
		this.pacienteTel = pacienteTel;
	}
	@Override
	public String toString() {
		return "Paciente [cedula=" + cedula + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", direccion=" + direccion + ", correoElectronico=" + correoElectronico + ", pacienteTel="
				+ pacienteTel + "]";
	}
	
	
}
