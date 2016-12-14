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

@XmlRootElement(name="pacienteTel")
@Entity
@Table(name="pacientetel")
public class PacienteTel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="pacienteTel_id",unique=true, nullable=false)
	private int pacienteTel_ID;
	@Column(name="telefono")
	private int telefono;
	@ManyToOne
	@JoinColumn(name="cedula_paciente",nullable=false)
	@JsonIgnore
	private Paciente paciente;
	public int getPacienteTel_ID() {
		return pacienteTel_ID;
	}
	public void setPacienteTel_ID(int pacienteTel_ID) {
		this.pacienteTel_ID = pacienteTel_ID;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	@Override
	public String toString() {
		return "PacienteTel [pacienteTel_ID=" + pacienteTel_ID + ", telefono=" + telefono + ", paciente=" + paciente
				+ "]";
	}
	
	
	
}
