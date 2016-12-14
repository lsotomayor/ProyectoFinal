package dto;

public class PuestoEmpleadoDTO {
	private int idPuesto;
	private String puesto;
	private int codigoMedico;
	public PuestoEmpleadoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PuestoEmpleadoDTO(int idPuesto, String puesto, int codigoMedico) {
		super();
		this.idPuesto = idPuesto;
		this.puesto = puesto;
		this.codigoMedico = codigoMedico;
	}
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
	@Override
	public String toString() {
		return "PuestoEmpleadoDTO [idPuesto=" + idPuesto + ", puesto=" + puesto + ", codigoMedico=" + codigoMedico
				+ "]";
	}
	
}
