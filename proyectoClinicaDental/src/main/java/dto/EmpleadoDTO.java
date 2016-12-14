package dto;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlRootElement;

import model.EmpleadoTel;
import model.PuestoEmpleado;

@XmlRootElement(name="empleadoDTO")
public class EmpleadoDTO {
	private int cedula;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String correoElectronico;
	private EmpleadoTel[] empTel;
	private PuestoEmpleado[] puestoEmpleado;
	
	public EmpleadoDTO() {
		super();
		}

	public EmpleadoDTO(int cedula, String nombre, String apellido1, String apellido2, String correoElectronico,
			EmpleadoTel[] empTel, PuestoEmpleado[] puestoEmpleado) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.correoElectronico = correoElectronico;
		this.empTel = empTel;
		this.puestoEmpleado = puestoEmpleado;
	}

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

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public EmpleadoTel[] getEmpTel() {
		return empTel;
	}

	public void setEmpTel(EmpleadoTel[] empTel) {
		this.empTel = empTel;
	}

	public PuestoEmpleado[] getPuestoEmpleado() {
		return puestoEmpleado;
	}

	public void setPuestoEmpleado(PuestoEmpleado[] puestoEmpleado) {
		this.puestoEmpleado = puestoEmpleado;
	}

	@Override
	public String toString() {
		return "EmpleadoDTO [cedula=" + cedula + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", correoElectronico=" + correoElectronico + ", empTel=" + Arrays.toString(empTel)
				+ ", puestoEmpleado=" + Arrays.toString(puestoEmpleado) + "]";
	}

	
	
	

}
