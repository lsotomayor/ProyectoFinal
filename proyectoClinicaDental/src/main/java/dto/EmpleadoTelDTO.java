package dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="empleadoTelDTO")
public class EmpleadoTelDTO {
	private int id;
	private int telefono;
	public EmpleadoTelDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpleadoTelDTO(int id, int telefono) {
		super();
		this.id = id;
		this.telefono = telefono;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "EmpleadoTelDTO [id=" + id + ", telefono=" + telefono + "]";
	}
	

}
