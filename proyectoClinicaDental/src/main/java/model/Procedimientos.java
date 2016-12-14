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

@XmlRootElement(name="procedmiento")
@Entity
@Table(name="procedimientos")
public class Procedimientos {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idProcedimiento",unique=true, nullable=false)
	private int idProcedmineto;
	@Column(name="procedimiento", nullable=false)
	private String procedimiento;
	
	@ManyToOne
	@JoinColumn(name="idHistorialClinico",nullable=false)
	@JsonIgnore
	private HistorialClinico historialClinico;
	
	public int getIdProcedmineto() {
		return idProcedmineto;
	}
	public void setIdProcedmineto(int idProcedmineto) {
		this.idProcedmineto = idProcedmineto;
	}
	public String getProcedimiento() {
		return procedimiento;
	}
	public void setProcedimiento(String procedimiento) {
		this.procedimiento = procedimiento;
	}
	public HistorialClinico getHistClinico() {
		return historialClinico;
	}
	public void setHistClinico(HistorialClinico histClinico) {
		this.historialClinico = histClinico;
	}
	@Override
	public String toString() {
		return "Procedimientos [idProcedmineto=" + idProcedmineto + ", procedimiento=" + procedimiento
				+ ", histClinico=" + historialClinico + "]";
	}
	
	
}
