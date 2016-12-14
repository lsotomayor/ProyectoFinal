package dto;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlRootElement;

import model.PacienteTel;

@XmlRootElement(name="pacienteDTO")
public class PacienteDTO {
	private int cedula;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String direccion;
	private String correoElectronico;
	private PacienteTel[] pacienteTel;
	
	public PacienteDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public PacienteDTO(int cedula, String nombre, String apellido1, String apellido2, String direccion,
			String correoElectronico, PacienteTel[] pacienteTel) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.direccion = direccion;
		this.correoElectronico = correoElectronico;
		this.pacienteTel = pacienteTel;
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

	public PacienteTel[] getPacienteTel() {
		return pacienteTel;
	}

	public void setPacienteTel(PacienteTel[] pacienteTel) {
		this.pacienteTel = pacienteTel;
	}


	@Override
	public String toString() {
		return "PacienteDTO [cedula=" + cedula + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", direccion=" + direccion + ", correoElectronico=" + correoElectronico + ", pacienteTel="
				+ Arrays.toString(pacienteTel) + "]";
	}
	
	
}
