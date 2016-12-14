package dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="pacienteTelDTO")
public class PacienteTelDTO {
	private int id;
	private int telefono;
	public PacienteTelDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PacienteTelDTO(int id, int telefono) {
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
		return "PacienteTelDTO [id=" + id + ", telefono=" + telefono + "]";
	}
	
}
