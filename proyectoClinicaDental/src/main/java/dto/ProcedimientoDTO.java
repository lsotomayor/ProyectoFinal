package dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="procedimientoDTO")
public class ProcedimientoDTO {
	private int idProcedimiento;
	private String procedimiento;
	 
	
	public ProcedimientoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ProcedimientoDTO(int idProcedimiento, String procedimiento) {
		super();
		this.idProcedimiento = idProcedimiento;
		this.procedimiento = procedimiento;
	}


	public int getIdProcedimiento() {
		return idProcedimiento;
	}


	public void setIdProcedimiento(int idProcedimiento) {
		this.idProcedimiento = idProcedimiento;
	}


	public String getProcedimiento() {
		return procedimiento;
	}


	public void setProcedimiento(String procedimiento) {
		this.procedimiento = procedimiento;
	}


	@Override
	public String toString() {
		return "ProcedimientoDTO [idProcedimiento=" + idProcedimiento + ", procedimiento=" + procedimiento + "]";
	}
	
}
